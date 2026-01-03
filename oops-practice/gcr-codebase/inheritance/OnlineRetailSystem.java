package inheritance;

//	Base class
	class Order {
	 String orderId;
	 String orderDate;
	
	 Order(String orderId, String orderDate) {
	     this.orderId = orderId;
	     this.orderDate = orderDate;
	 }
	
	 String getOrderStatus() {
	     return "Order Placed";
	 }
	}
	
//	Intermediate subclass
	class ShippedOrder extends Order {
	 String trackingNumber;
	
	 ShippedOrder(String orderId, String orderDate, String trackingNumber) {
	     super(orderId, orderDate);
	     this.trackingNumber = trackingNumber;
	 }
	
	 @Override
	 String getOrderStatus() {
	     return "Order Shipped";
	 }
	}
	
//	Final subclass
	class DeliveredOrder extends ShippedOrder {
	 String deliveryDate;
	
	 DeliveredOrder(String orderId, String orderDate,String trackingNumber, String deliveryDate) {
	     super(orderId, orderDate, trackingNumber);
	     this.deliveryDate = deliveryDate;
	 }
	
	 @Override
	 String getOrderStatus() {
	     return "Order Delivered";
	 }
	}
	
//	Main class
	public class OnlineRetailSystem {
	 public static void main(String[] args) {
	
	     Order order1 = new Order("ORD101", "01-Jan-2026");
	     Order order2 = new ShippedOrder("ORD102", "02-Jan-2026", "TRK789");
	     Order order3 = new DeliveredOrder("ORD103", "03-Jan-2026", "TRK456", "05-Jan-2026");
	
	     System.out.println(order1.getOrderStatus());
	     System.out.println(order2.getOrderStatus());
	     System.out.println(order3.getOrderStatus());
	 }

}
