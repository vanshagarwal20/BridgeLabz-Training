package employee_wages.model;

import java.util.*;

public class CompanyEmpWage {

    private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;
    private List<Integer> dailyWages = new ArrayList<>();

    public CompanyEmpWage(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours)
    {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public String getCompanyName()
    { 
    	return companyName; 
    }
    public int getWagePerHour() 
    { 
    	return wagePerHour; 
    }
    public int getMaxWorkingDays() 
    { 
    	return maxWorkingDays; 
    }
    public int getMaxWorkingHours() { 
    	return maxWorkingHours;
    }

    public void setTotalWage(int totalWage) 
    { this.totalWage = totalWage; 
    }
    public int getTotalWage() 
    { 
    	return totalWage;
    }

    public void addDailyWage(int wage) 
    { 
    	dailyWages.add(wage);
    }
    public List<Integer> getDailyWages() 
    {
    	return dailyWages;
    }
    
    @Override
    public String toString() {
        return "Company Name: " + companyName +
               ", Total Wage: " + totalWage;
    }


}