package scenario_based.HospitalManagement;

public class HospitalApp {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Vansh", 30, 4, 2000);
        Patient p2 = new OutPatient(2, "Ansh", 25, 700);

        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
    }
}
