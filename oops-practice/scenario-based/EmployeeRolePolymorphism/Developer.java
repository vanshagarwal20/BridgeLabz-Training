package scenario_based.EmployeeRolePolymorphism;

class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double calculateBonus() {
        return getSalary() > 50000 ? getSalary() * 0.05 : 0.0;
    }
}
