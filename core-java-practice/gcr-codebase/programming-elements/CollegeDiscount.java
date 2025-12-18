package programming_elements;

public class CollegeDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fee = 125000;
        int discountPercentage = 10;
        int discount = fee * discountPercentage / 100;
        int finalFees = fee - discount;
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFees);

	}

}
