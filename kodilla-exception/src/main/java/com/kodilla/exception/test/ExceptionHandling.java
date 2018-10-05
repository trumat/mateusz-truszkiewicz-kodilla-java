package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            System.out.println(challenge.probablyIWillThrowException(3, 1));
        } catch (Exception e){
            System.out.println("Something went wrong, error: " + e);
        } finally {
            System.out.println("Exception or not, I will be here");
        }
    }
}
