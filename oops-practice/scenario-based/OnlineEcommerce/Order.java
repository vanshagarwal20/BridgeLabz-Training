package scenario_based.OnlineEcommerce;

class Order {
    Product product;
    boolean cancelled;

    public Order(Product product) {
        this.product = product;
    }

    public void cancelOrder() {
        cancelled = true;
        System.out.println("Order cancelled for " + product.name);
    }

    public void trackOrder() {
        if (cancelled)
            System.out.println("Order is cancelled");
        else
            System.out.println("Order is being delivered");
    }
}

