package employee_wages.services;

import employee_wages.model.CompanyEmpWage;

public interface IEmployeeWageService {

    void computeWage(CompanyEmpWage company);
}