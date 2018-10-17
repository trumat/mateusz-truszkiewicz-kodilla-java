package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.DRIVING_TASK);

        String taskName = task.getTaskName();
        System.out.println(taskName);

        String taskExecution = task.executeTask();
        System.out.println(taskExecution);

        boolean isExecuted = task.isTaskExecuted();

        //Then
        Assert.assertEquals("Driving task", taskName);
        Assert.assertEquals("Driving to store using bike", taskExecution);
        Assert.assertTrue(isExecuted);
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.PAINTING_TASK);

        String taskName = task.getTaskName();
        System.out.println(taskName);

        String taskExecution = task.executeTask();
        System.out.println(taskExecution);

        boolean isExecuted = task.isTaskExecuted();

        //Then
        Assert.assertEquals("Painting task", taskName);
        Assert.assertEquals("Painting blue elephants", taskExecution);
        Assert.assertTrue(isExecuted);
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task task = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);

        String taskName = task.getTaskName();
        System.out.println(taskName);

        String taskExecution = task.executeTask();
        System.out.println(taskExecution);

        boolean isExecuted = task.isTaskExecuted();

        //Then
        Assert.assertEquals("Shopping task", taskName);
        Assert.assertEquals("Buying 100.0 hats", taskExecution);
        Assert.assertTrue(isExecuted);
    }
}
