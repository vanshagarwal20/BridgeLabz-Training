package string;

import java.util.*;
public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Exception generated");
        }

        handleException(names);
	}
	public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

}
