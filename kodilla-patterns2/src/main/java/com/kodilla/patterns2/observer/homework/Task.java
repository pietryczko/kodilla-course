package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Task implements Observable {
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String taskName;

    public Task(String taskName) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.taskName = taskName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void registerObserver(com.kodilla.patterns2.observer.homework.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (com.kodilla.patterns2.observer.homework.Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(com.kodilla.patterns2.observer.homework.Observer observer) {
        observers.remove(observer);
    }
}
