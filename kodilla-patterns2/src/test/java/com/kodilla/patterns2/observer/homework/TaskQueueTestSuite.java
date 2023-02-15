package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskQueueTestSuite {

    @Test
    public void testQueue() {
        //Given
        Task facadeTasks = new FacadeTasks();
        Task observerTasks = new ObserverTasks();
        Mentor janKowalski = new Mentor("Jan Kowalski");
        Mentor andrzejNowak = new Mentor("Andrzej Nowak");
        facadeTasks.registerObserver(janKowalski);
        observerTasks.registerObserver(janKowalski);
        facadeTasks.registerObserver(andrzejNowak);
        //When
        facadeTasks.addTask("Task 1 to facade Submodule");
        facadeTasks.addTask("Task 2 to facade Submodule");
        observerTasks.addTask("Task 1 to observer Submodule");
        facadeTasks.addTask("Task 3 to facade Submodule");
        observerTasks.addTask("Task 2 to observer Submodule");
        //Then
        Assertions.assertEquals(5, janKowalski.getTasksCount());
        Assertions.assertEquals(3, andrzejNowak.getTasksCount());
    }
}
