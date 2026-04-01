package scenario_based.HospitalManagement;

class InPatient extends Patient implements IPayable {
    private int days;
    private double costPerDay;

    public InPatient(int id, String name, int age, int days, double costPerDay) {
        super(id, name, age);
        this.days = days;
        this.costPerDay = costPerDay;
    }

    public double calculateBill() {
        return days * costPerDay;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: In-Patient");
        System.out.println("Bill: " + calculateBill());
    }
}

