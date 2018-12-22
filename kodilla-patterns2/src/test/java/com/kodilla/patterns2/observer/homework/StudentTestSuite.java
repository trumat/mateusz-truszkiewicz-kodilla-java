package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        Student student1 = new Student("student1", mentor1);
        Student student2 = new Student("student2", mentor1);
        Student student3 = new Student("student3", mentor2);
        //When
        student1.submitExercise(new Exercise("3.2", "link"));
        student1.submitExercise(new Exercise("3.3", "link"));
        student2.submitExercise(new Exercise("18.1", "link"));
        student2.submitExercise(new Exercise("18.2", "link"));
        student3.submitExercise(new Exercise("15.3", "link"));
        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}
