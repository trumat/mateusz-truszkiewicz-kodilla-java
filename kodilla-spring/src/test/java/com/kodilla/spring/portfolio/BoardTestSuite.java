package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addToDo("Task to do");
        board.addInProgress("Task in progress");
        board.addDone("Done task");

        List<String> testTasksToDo = new ArrayList<>();
        testTasksToDo.add("Task to do");

        List<String> testTasksInProgress = new ArrayList<>();
        testTasksInProgress.add("Task in progress");

        List<String> testTasksDone = new ArrayList<>();
        testTasksDone.add("Done task");

        List<String> resultTasksToDo = board.showToDo();
        List<String> resultTasksInProgress = board.showInProgress();
        List<String> resultTasksDone = board.showDone();
        //Then
        Assert.assertEquals(testTasksToDo, resultTasksToDo);
        Assert.assertEquals(testTasksInProgress, resultTasksInProgress);
        Assert.assertEquals(testTasksDone, resultTasksDone);
    }
}
