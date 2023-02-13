package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyFacade companyFacade;
    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    public void testCompanyFacadeFindCompanyByName() throws NoDataException {
        //Given
        Company company = new Company("Test Company");
        companyDao.save(company);
        Company company1 = new Company("Test1 Company");
        companyDao.save(company1);
        Company company2 = new Company("CD Projekt");
        companyDao.save(company2);

        //When
        List<Company> companies = companyFacade.findCompanyByName("Test");
        List<Company> oneCompany = companyFacade.findCompanyByName("CD");

        //Then
        Assertions.assertEquals(2, companies.size());
        Assertions.assertEquals(1, oneCompany.size());

        //CleanUp
        companyDao.delete(company);
        companyDao.delete(company1);
        companyDao.delete(company2);
    }

    @Test
    public void testFoundEmployeeByLastName() throws NoDataException {
        //Given
        Employee employee = new Employee("Jan", "Kowalski");
        Employee employee1 = new Employee("Jan", "Nowak");
        Employee employee2 = new Employee("Jan", "Kowalczyk");
        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);

        //When
        List<Employee> oneEmployee = employeeFacade.findEmployeeByName("Nowak");
        List<Employee> twoEmployees = employeeFacade.findEmployeeByName("Kowal");

        //Then
        Assertions.assertEquals(1, oneEmployee.size());
        Assertions.assertEquals(2, twoEmployees.size());

        //CleanUp
        employeeDao.delete(employee);
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
    }
}
