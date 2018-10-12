package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculatorOperations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(5.0, 20.0);
        double subResult = calculator.sub(5.0, 20.0);
        double mulResult = calculator.mul(5.0, 20.0);
        double divResult = calculator.div(5.0, 20.0);
        //Then
        Assert.assertEquals(25.0, addResult, 0.0);
        Assert.assertEquals(-15.0, subResult, 0.0);
        Assert.assertEquals(100.0, mulResult, 0.0);
        Assert.assertEquals(0.25, divResult, 0.0);
    }
}
