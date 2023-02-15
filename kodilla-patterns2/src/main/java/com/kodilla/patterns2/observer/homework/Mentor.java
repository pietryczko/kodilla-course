package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int tasksCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Task task) {
        System.out.println(mentorName + " New task to review: " + task.getTaskName() + "\n" +
                "(total: " + task.getTasks().size() + " tasks");
        tasksCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getTasksCount() {
        return tasksCount;
    }
}
