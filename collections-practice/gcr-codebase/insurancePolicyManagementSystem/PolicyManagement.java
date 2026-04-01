package insurancePolicyManagementSystem;


import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class PolicyManagement {

    // Sets
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // Display all unique policies
    public void displayAllPolicies() {
        System.out.println("HashSet Policies: " + hashSetPolicies);
        System.out.println("LinkedHashSet Policies (insertion order): " + linkedHashSetPolicies);
        System.out.println("TreeSet Policies (sorted by expiry): " + treeSetPolicies);
    }

    // Policies expiring within next 'days' days
    public void displayExpiringSoon(int days) {
        LocalDate today = LocalDate.now();
        System.out.println("Policies expiring in next " + days + " days:");
        for (Policy p : treeSetPolicies) { // treeSet is sorted by expiry
            if (!p.getExpiryDate().isAfter(today.plusDays(days))) {
                System.out.println(p);
            }
        }
    }

    // Policies by coverage type
    public void displayByCoverage(String coverageType) {
        System.out.println("Policies with coverage type: " + coverageType);
        for (Policy p : hashSetPolicies) {
            if (p.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(p);
            }
        }
    }

    // Find duplicate policies based on policy number
    public void displayDuplicatePolicies(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }
        System.out.println("Duplicate Policy Numbers: " + duplicates);
    }

    // Performance comparison
    public void comparePerformance(Policy policy) {
        long start, end;

        // HashSet
        start = System.nanoTime();
        hashSetPolicies.add(policy);
        end = System.nanoTime();
        System.out.println("HashSet add: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSetPolicies.contains(policy);
        end = System.nanoTime();
        System.out.println("HashSet search: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSetPolicies.remove(policy);
        end = System.nanoTime();
        System.out.println("HashSet remove: " + (end - start) + " ns");

        // LinkedHashSet
        start = System.nanoTime();
        linkedHashSetPolicies.add(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet add: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSetPolicies.contains(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet search: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSetPolicies.remove(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet remove: " + (end - start) + " ns");

        // TreeSet
        start = System.nanoTime();
        treeSetPolicies.add(policy);
        end = System.nanoTime();
        System.out.println("TreeSet add: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSetPolicies.contains(policy);
        end = System.nanoTime();
        System.out.println("TreeSet search: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSetPolicies.remove(policy);
        end = System.nanoTime();
        System.out.println("TreeSet remove: " + (end - start) + " ns");
    }

    public static void main(String[] args) {

        PolicyManagement pm = new PolicyManagement();

        // Sample policies
        pm.addPolicy(new Policy("P101", "Alice", "2026-02-10", "Health", 5000));
        pm.addPolicy(new Policy("P102", "Bob", "2026-01-25", "Auto", 3000));
        pm.addPolicy(new Policy("P103", "Charlie", "2026-02-05", "Home", 4000));
        pm.addPolicy(new Policy("P104", "David", "2026-01-28", "Health", 4500));
        pm.addPolicy(new Policy("P102", "Bob Duplicate", "2026-01-25", "Auto", 3000)); // duplicate

        // Display
        pm.displayAllPolicies();
        System.out.println();
        pm.displayExpiringSoon(30);
        System.out.println();
        pm.displayByCoverage("Health");
        System.out.println();

        // Detect duplicates
        pm.displayDuplicatePolicies(Arrays.asList(
            new Policy("P101","A","2026-02-10","Health",5000),
            new Policy("P102","B","2026-01-25","Auto",3000),
            new Policy("P102","B Duplicate","2026-01-25","Auto",3000),
            new Policy("P103","C","2026-02-05","Home",4000)
        ));

        System.out.println();

        // Performance check
        pm.comparePerformance(new Policy("P200","Eve","2026-03-01","Health",6000));
    }
    
}
