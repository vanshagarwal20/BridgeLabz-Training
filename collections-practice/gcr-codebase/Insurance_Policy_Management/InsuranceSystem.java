package Insurance_Policy_Management;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Policy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(String policyNumber, String policyholderName, String expiryDate,
                  String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = LocalDate.parse(expiryDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.coverageType = coverageType;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s, %.2f]", policyNumber, policyholderName, expiryDate, coverageType, premium);
    }
}

public class InsuranceSystem {

    private Map<String, Policy> hashMapPolicies = new HashMap<>();
    private Map<String, Policy> linkedHashMapPolicies = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> treeMapPolicies = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy p) {
        hashMapPolicies.put(p.policyNumber, p);
        linkedHashMapPolicies.put(p.policyNumber, p);
        treeMapPolicies.computeIfAbsent(p.expiryDate, k -> new ArrayList<>()).add(p);
    }

    // Retrieve by policy number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMapPolicies.get(policyNumber);
    }

    // Policies expiring in next N days
    public List<Policy> policiesExpiringSoon(int days) {
        LocalDate today = LocalDate.now();
        LocalDate target = today.plusDays(days);
        List<Policy> result = new ArrayList<>();
        treeMapPolicies.subMap(today, true, target, true)
                       .values().forEach(result::addAll);
        return result;
    }

    // Policies by policyholder
    public List<Policy> policiesByHolder(String holder) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : hashMapPolicies.values()) {
            if (p.policyholderName.equalsIgnoreCase(holder)) result.add(p);
        }
        return result;
    }

    // Remove expired policies
    public void removeExpired() {
        LocalDate today = LocalDate.now();
        treeMapPolicies.headMap(today, true).clear();
        hashMapPolicies.values().removeIf(p -> p.expiryDate.isBefore(today));
        linkedHashMapPolicies.values().removeIf(p -> p.expiryDate.isBefore(today));
    }

    public static void main(String[] args) {
        InsuranceSystem system = new InsuranceSystem();
        system.addPolicy(new Policy("P101","Alice","2026-02-10","Health",5000));
        system.addPolicy(new Policy("P102","Bob","2026-01-25","Auto",3000));
        system.addPolicy(new Policy("P103","Alice","2026-02-05","Home",4000));

        System.out.println("Retrieve P101: " + system.getPolicyByNumber("P101"));
        System.out.println("Expiring in 30 days: " + system.policiesExpiringSoon(30));
        System.out.println("Policies of Alice: " + system.policiesByHolder("Alice"));

        system.removeExpired();
        System.out.println("After removing expired: " + system.hashMapPolicies.values());
    }
}

