package scenario_based.LibraryManagemnet;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}
