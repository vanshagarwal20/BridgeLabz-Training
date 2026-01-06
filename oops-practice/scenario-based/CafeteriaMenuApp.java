package scenario_based;

import java.util.Scanner;

public class CafeteriaMenuApp {

//     Method to display menu
    public static void displayMenu(String[] menu) {
        System.out.println("Cafeteria Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

//     Method to get item by index
    public static String getItemByIndex(String[] menu, int index) {
        return menu[index];
    }

    public static void main(String[] args) {
        String[] menuItems = {
            "Burger", "Pizza", "Sandwich", "Pasta", "Noodles",
            "Coffee", "Tea", "Juice", "Cake", "Ice Cream"
        };

        Scanner sc = new Scanner(System.in);

        displayMenu(menuItems);

        System.out.print("Enter item index to order: ");
        int choice = sc.nextInt();

        System.out.println("You ordered: " + getItemByIndex(menuItems, choice));
    }
}

