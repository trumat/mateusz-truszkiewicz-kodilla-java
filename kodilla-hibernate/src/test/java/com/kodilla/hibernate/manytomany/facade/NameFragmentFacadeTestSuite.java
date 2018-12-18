package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NameFragmentFacadeTestSuite {
    @Autowired
    private NameFragmentFacade nameFragmentFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindCompaniesWithNameContaining() {
        //Given
        Company successfulIndustries = new Company("Successful Industries");
        Company futureTech = new Company("FutureTech");
        Company futureCorp = new Company("FutureCorp");

        //When
        companyDao.save(successfulIndustries);
        companyDao.save(futureTech);
        companyDao.save(futureCorp);

        List<Company> retrievedCompanies = nameFragmentFacade.findCompaniesWithNameContaining("%ture%");

        //Then
        Assert.assertEquals(2, retrievedCompanies.size());

        //CleanUp
        companyDao.delete(successfulIndustries);
        companyDao.delete(futureTech);
        companyDao.delete(futureCorp);
    }

    @Test
    public void testFindEmployeesWithLastNameContaining() {
        //Given
        Employee owenSmith = new Employee("Owen", "Smith");
        Employee margaretBluth = new Employee("Margaret", "Bluth");
        Employee sarahRothschild = new Employee("Sarah", "Rothschild");

        //When
        employeeDao.save(owenSmith);
        employeeDao.save(margaretBluth);
        employeeDao.save(sarahRothschild);

        List<Employee> retrievedEmployees = nameFragmentFacade.findEmployeesWithLastNameContaining("%th%");

        //Then
        Assert.assertEquals(3, retrievedEmployees.size());

        //CleanUp
        employeeDao.delete(owenSmith);
        employeeDao.delete(margaretBluth);
        employeeDao.delete(sarahRothschild);
    }
}
