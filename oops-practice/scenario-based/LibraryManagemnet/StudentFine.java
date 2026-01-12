package scenario_based.LibraryManagemnet;

class StudentFine implements FineCalculator {
    public double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}
