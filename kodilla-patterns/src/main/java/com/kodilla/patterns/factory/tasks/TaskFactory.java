package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String shoppingtask = "ShoppingTask";
    public static final String paintingtask = "PaintingTask";
    public static final String drivingTask = "DrivingTask";

    public final Task addNewTask(final String taskClass) {
        switch (taskClass) {
            case shoppingtask:
                return new ShoppingTask("Shopping in the countryside", "Milk", 10);
            case paintingtask:
                return new PaintingTask("House painting", "White", "Wall");
            case drivingTask:
                return new DrivingTask("Getting to the customer","Railway station", "Audi");
            default:
                return null;
        }
    }
}
