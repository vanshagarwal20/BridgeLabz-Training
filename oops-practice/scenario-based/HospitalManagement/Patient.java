package scenario_based.HospitalManagement;

class Patient {
    private int id;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void displayInfo() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
