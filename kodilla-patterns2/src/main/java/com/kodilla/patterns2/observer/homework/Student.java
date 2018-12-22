package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Student implements Observable{
    private final String name;
    private final Mentor mentor;
    private Deque<Exercise> exercises = new ArrayDeque<>();

    public Student(String name, Mentor mentor) {
        this.name = name;
        this.mentor = mentor;
    }

    public void submitExercise(Exercise exercise) {
        exercises.addLast(exercise);
        notifyMentor();
    }

    @Override
    public void notifyMentor() {
        mentor.update(this);
    }

    public String getName() {
        return name;
    }

    public Deque<Exercise> getExercises() {
        return exercises;
    }
}
