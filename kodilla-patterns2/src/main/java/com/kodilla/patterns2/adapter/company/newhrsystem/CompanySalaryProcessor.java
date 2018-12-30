package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

public class CompanySalaryProcessor implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Base salary: " + employee.getBaseSalary());
            sum = sum.add(employee.getBaseSalary());
            System.out.println("Sum: " + sum);
        }
        return sum;
    }
}
