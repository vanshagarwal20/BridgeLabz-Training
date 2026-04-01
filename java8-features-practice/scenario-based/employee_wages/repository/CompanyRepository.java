package employee_wages.repository;
import java.util.*;

import employee_wages.model.CompanyEmpWage;

public class CompanyRepository {

    private List<CompanyEmpWage> companies = new ArrayList<>();

    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    public List<CompanyEmpWage> getAllCompanies() {
        return companies;
    }

    public CompanyEmpWage getCompanyByName(String name) {
        for (CompanyEmpWage company : companies)
        {
            if (company.getCompanyName().equalsIgnoreCase(name))
                return company;
        }
        return null;
    }
}