package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("I'm happy");
        board.inProgressList.tasks.add("I'm lucky");
        board.doneList.tasks.add("I'm rich");

        //Then
        Assert.assertEquals("I'm happy", board.toDoList.tasks.get(0));
        Assert.assertEquals("I'm lucky", board.inProgressList.tasks.get(0));
        Assert.assertEquals("I'm rich", board.doneList.tasks.get(0));
        System.out.println(board);
    }
}
