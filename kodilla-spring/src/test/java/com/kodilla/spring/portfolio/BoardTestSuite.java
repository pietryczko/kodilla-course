package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().addTask("Done Task :)");
        board.getToDoList().addTask("Task to do");
        board.getInProgressList().addTask("Task in progress");

        //Then
        assertEquals("Done Task :)", board.getDoneList().getTasks().get(0));
        assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Task to do", board.getToDoList().getTasks().get(0));
    }
}
