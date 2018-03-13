package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "ShoppingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String DRIVINGTASK = "DrivingTask";

    public final Task addNewTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping in the countryside", "Milk", 10);
            case PAINTINGTASK:
                return new PaintingTask("House painting", "White", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Getting to the customer","Railway station", "Audi");
            default:
                return null;
        }
    }
}
