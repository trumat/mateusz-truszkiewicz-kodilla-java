package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("TheForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("TheForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        if(calculator.add(5,4) == 9){
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        if(calculator.subtract(5,4) == 1){
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }
}
