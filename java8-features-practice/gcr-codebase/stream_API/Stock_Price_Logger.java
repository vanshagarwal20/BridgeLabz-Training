package stream_API;

import java.util.*;

public class Stock_Price_Logger {
	    public static void main(String[] args) {

	        List<Double> prices = List.of(120.5, 118.2, 121.9);

	        prices.forEach(p ->
	            System.out.println("Stock Price: " + p)
	        );
	    }
	}



