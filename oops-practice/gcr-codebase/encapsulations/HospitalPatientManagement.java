package encapsulations;

import java.util.*;

//	Interface for medical records
	interface MedicalRecord {
	 void addRecord(String record);
	 void viewRecords();
	}
	
//	Abstract Patient class
	abstract class Patient implements MedicalRecord {
	 private String patientId;
	 private String name;
	 private int age;
	 private List<String> medicalHistory = new ArrayList<>(); // encapsulated sensitive data
	
	 public Patient(String patientId, String name, int age) {
	     this.patientId = patientId;
	     this.name = name;
	     this.age = age;
	 }
	
//	  Encapsulation
	 public String getPatientId() { return patientId; }
	 public String getName() { return name; }
	 public int getAge() { return age; }
	
//	  Abstract method for billing
	 public abstract double calculateBill();
	
//	  Concrete method
	 public void getPatientDetails() {
	     System.out.println("Patient ID : " + patientId);
	     System.out.println("Name       : " + name);
	     System.out.println("Age        : " + age);
	 }
	
//	  MedicalRecord interface methods
	 @Override
	 public void addRecord(String record) {
	     medicalHistory.add(record);
	 }
	
	 @Override
	 public void viewRecords() {
	     System.out.println("Medical Records for " + name + ":");
	     if (medicalHistory.isEmpty()) {
	         System.out.println("No records found.");
	     } else {
	         for (String rec : medicalHistory) {
	             System.out.println("- " + rec);
	         }
	     }
	 }
	}
	
//	InPatient class
	class InPatient extends Patient {
	 private int daysAdmitted;
	 private double dailyCharge;
	
	 public InPatient(String id, String name, int age, int daysAdmitted, double dailyCharge) {
	     super(id, name, age);
	     this.daysAdmitted = daysAdmitted;
	     this.dailyCharge = dailyCharge;
	 }
	
	 @Override
	 public double calculateBill() {
	     return daysAdmitted * dailyCharge;
	 }
	}
	
//	OutPatient class
	class OutPatient extends Patient {
	 private double consultationFee;
	
	 public OutPatient(String id, String name, int age, double consultationFee) {
	     super(id, name, age);
	     this.consultationFee = consultationFee;
	 }
	
	 @Override
	 public double calculateBill() {
	     return consultationFee;
	 }
	}
	
//	Main class
	public class HospitalPatientManagement {
	 public static void main(String[] args) {
	     List<Patient> patients = new ArrayList<>();
	
	     Patient p1 = new InPatient("IP101", "Vansh Agarwal", 25, 5, 2000);
	     Patient p2 = new OutPatient("OP202", "Amit Sharma", 30, 500);
	
//	      Adding medical records
	     p1.addRecord("Diagnosed with Flu");
	     p1.addRecord("Prescribed antibiotics");
	     p2.addRecord("Routine check-up");
	
	     patients.add(p1);
	     patients.add(p2);
	
//	      Polymorphism: manage all patients dynamically
	     for (Patient p : patients) {
	         p.getPatientDetails();
	         p.viewRecords();
	         System.out.println("Total Bill: " + p.calculateBill());
	         System.out.println();
	     }
	 }
	}
	
