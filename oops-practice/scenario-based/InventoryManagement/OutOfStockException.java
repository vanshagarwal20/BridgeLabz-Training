package scenario_based.InventoryManagement;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}
