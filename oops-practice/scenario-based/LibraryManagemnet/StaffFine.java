package scenario_based.LibraryManagemnet;

class StaffFine implements FineCalculator {
    public double calculateFine(int daysLate) {
        return daysLate * 1;
    }
}