package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveWithLastName() {
        //Given
        Employee owenJones = new Employee("Owen", "Jones");
        Employee margaretJones = new Employee("Margaret", "Jones");
        Employee sarahMacintyre = new Employee("Sarah", "MacIntyre");

        //When
        employeeDao.save(owenJones);
        employeeDao.save(margaretJones);
        employeeDao.save(sarahMacintyre);

        int owenJonesId = owenJones.getId();
        int margaretJonesId = margaretJones.getId();
        int sarahMacintyreId = sarahMacintyre.getId();

        List<Employee> readEmployees = employeeDao.retrieveWithLastName("Jones");

        //Then
        Assert.assertEquals(2, readEmployees.size());

        //CleanUp

        try {
            employeeDao.delete(owenJonesId);
            employeeDao.delete(margaretJonesId);
            employeeDao.delete(sarahMacintyreId);
        } catch (Exception e) {
            //Do nothing
        }
    }

    @Test
    public void testRetrieveNameStartingWith() {
        //Given
        Company successfulIndustries = new Company("Successful Industries");
        Company futureTech = new Company("FutureTech");
        Company futureCorp = new Company("FutureCorp");

        //When
        companyDao.save(successfulIndustries);
        companyDao.save(futureTech);
        companyDao.save(futureCorp);

        int successfulIndustriesId = successfulIndustries.getId();
        int futureTechId = futureTech.getId();
        int futureCorpId = futureCorp.getId();

        List<Company> readCompanies = companyDao.retrieveNameStartingWith("Fut");

        //Then
        Assert.assertEquals(2, readCompanies.size());

        //CleanUp
        try {
            companyDao.delete(successfulIndustriesId);
            companyDao.delete(futureTechId);
            companyDao.delete(futureCorpId);
        } catch (Exception e) {
            //Do nothing
        }
    }
}