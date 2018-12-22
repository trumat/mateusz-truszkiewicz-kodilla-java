package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + ": new exercise submitted by " + student.getName()
                + " (exercises pending: " + student.getExercises().size() + ")");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
