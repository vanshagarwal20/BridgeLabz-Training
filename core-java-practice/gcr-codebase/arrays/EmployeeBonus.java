package array;
import java.util.*;
public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		array initialize
		double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

//        variables for answer
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
//        loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();
//            conditions
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input!!!!");
                i--; 
                continue;
            }
            salary[i] = sal;
            yearsOfService[i] = years;
        }
//        calculations
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        // Output
        System.out.println("Company Bonus Summary....");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
	}

}
