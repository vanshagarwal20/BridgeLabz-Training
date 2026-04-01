package scenario_based.LibraryManagemnet;

class Member extends User {
    private FineCalculator fineCalculator;

    public Member(int userId, String name, FineCalculator fineCalculator) {
        this.userId = userId;
        this.name = name;
        this.fineCalculator = fineCalculator;
    }

    public double getFine(int daysLate) {
        return fineCalculator.calculateFine(daysLate);
    }
}
