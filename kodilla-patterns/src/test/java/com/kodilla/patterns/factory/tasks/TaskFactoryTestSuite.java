package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.addNewTask(TaskFactory.DRIVINGTASK);

        //Then
        Assert.assertEquals("Getting to the customer", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.addNewTask(TaskFactory.PAINTINGTASK);

        //Then
        Assert.assertEquals("House painting", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.addNewTask(TaskFactory.SHOPPINGTASK);

        //Then
        Assert.assertEquals("Shopping in the countryside", shoppingTask.getTaskName());
        Assert.assertFalse(shoppingTask.isTaskExecuted());
    }
}
