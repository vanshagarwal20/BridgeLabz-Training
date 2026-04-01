package scenario_based;

import java.util.*;

public class EmployeeWageComputation {
//	Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;
//    Employee data
    int totalWorkingDays = 0;
    int totalWorkingHours = 0;
    int totalSalary = 0;
//    Method to check attendance
    int checkAttendance() {
        Random random = new Random();
        return random.nextInt(3); // 0 - Absent, 1 - Full Time, 2 - Part Time
    }

//     Method to get working hours based on attendance
    int getWorkHours(int attendance) {
        switch (attendance) {
            case 1:
                return FULL_DAY_HOURS;
            case 2:
                return PART_TIME_HOURS;
            default:
                return 0;
        }
    }

//     Method to calculate daily wage
    int calculateDailyWage(int hours) {
        return hours * WAGE_PER_HOUR;
    }

//     Method to calculate monthly wage
    void calculateMonthlyWage() {

        while (totalWorkingDays < MAX_WORKING_DAYS &&totalWorkingHours < MAX_WORKING_HOURS) {
            totalWorkingDays++;
            int attendance = checkAttendance();
            int hoursWorked = getWorkHours(attendance);
            totalWorkingHours += hoursWorked;
            int dailyWage = calculateDailyWage(hoursWorked);
            totalSalary += dailyWage;
            System.out.println("Day " + totalWorkingDays + " | Hours Worked: " + hoursWorked + " | Daily Wage: ₹" + dailyWage);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation employee = new EmployeeWageComputation();
        employee.calculateMonthlyWage();
        System.out.println("Final Wage Summary!!!");
        System.out.println("Total Working Days : " + employee.totalWorkingDays);
        System.out.println("Total Working Hours: " + employee.totalWorkingHours);
        System.out.println("Total Monthly Wage: ₹" + employee.totalSalary);
    }

}
