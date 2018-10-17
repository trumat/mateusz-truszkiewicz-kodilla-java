package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public Task makeTask(String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Driving task", "store", "bike");
            case PAINTING_TASK:
                return new PaintingTask("Painting task", "blue", "elephants");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping task", "hat", 100);
            default:
                return null;
        }
    }
}
