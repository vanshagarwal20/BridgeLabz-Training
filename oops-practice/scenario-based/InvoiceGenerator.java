package scenario_based;

//	Custom Exception
	class InvalidInvoiceFormatException extends Exception {
	 public InvalidInvoiceFormatException(String message) {
	     super(message);
	 }
	}
	
	public class InvoiceGenerator {
	
	 public static int calculateTotal(String invoice) throws InvalidInvoiceFormatException {
	     int total = 0;
	
	     String[] items = invoice.split(",");
	
	     for (String item : items) {
	         if (!item.contains("-")) {
	             throw new InvalidInvoiceFormatException("Invalid format: " + item);
	         }
	
	         String[] parts = item.split("-");
	         if (parts.length != 2) {
	             throw new InvalidInvoiceFormatException("Invalid format: " + item);
	         }
	
	         String amountPart = parts[1].trim().split(" ")[0];
	
	         try {
	             int amount = Integer.parseInt(amountPart);
	             total += amount;
	         } catch (NumberFormatException e) {
	             throw new InvalidInvoiceFormatException("Invalid amount in: " + item);
	         }
	     }
	
	     return total;
	 }
	
	 public static void main(String[] args) {
	     String invoice = "Logo Design - 3000 INR, Web Page - 4500 INR";
	
	     try {
	         int totalAmount = calculateTotal(invoice);
	         System.out.println("Total Invoice Amount: " + totalAmount + " INR");
	     } catch (InvalidInvoiceFormatException e) {
	         System.out.println(e.getMessage());
	     }
	 }
	}

