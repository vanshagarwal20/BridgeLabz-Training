package reviews;

public class OverLoading {

//	     Method with two int type parameters
	    int add(int a, int b) {
	        return a + b;
	    }

//	     Method with three int type parameters
	    int add(int a, int b, int c) {
	        return a + b + c;
	    }

//	     Method with double type parameters
	    double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        OverLoading obj = new OverLoading();
//	      Calls add(int, int)
	        System.out.println(obj.add(10, 20));
//	      Calls add(int, int, int)
	        System.out.println(obj.add(10, 20, 30)); 
//	      Calls add(double, double)
	        System.out.println(obj.add(10.5, 20.5));    
	    }

}
