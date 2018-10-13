package com.kodilla.spring.portfolio;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToDo(String task) {
        toDoList.addTask(task);
    }

    public void addInProgress(String task) {
        inProgressList.addTask(task);
    }

    public void addDone(String task) {
        doneList.addTask(task);
    }

    public ArrayList<String> showToDo() {
        ArrayList<String> tasks = toDoList.getTasks();
        tasks.stream()
                .forEach(System.out::println);
        return tasks;
    }

    public ArrayList<String> showInProgress() {
        ArrayList<String> tasks = inProgressList.getTasks();
        tasks.stream()
                .forEach(System.out::println);
        return tasks;
    }

    public ArrayList<String> showDone() {
        ArrayList<String> tasks = doneList.getTasks();
        tasks.stream()
                .forEach(System.out::println);
        return tasks;
    }
}
