package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        if (!isExecuted) {
            isExecuted = true;
        }

        if (quantity <= 0) {
            return "Buying nothing";
        } else if (quantity == 1.0) {
            return "Buying 1 " + whatToBuy;
        } else {
            return "Buying " + quantity + " " + whatToBuy + "s";
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
