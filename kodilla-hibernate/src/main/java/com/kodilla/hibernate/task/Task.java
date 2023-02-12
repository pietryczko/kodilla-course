package com.kodilla.hibernate.task;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "Task.retrieveLongTasks",
                query = "FROM Task WHERE duration > 10"
        ),
        @NamedQuery(
                name = "Task.retrieveShortTasks",
                query = "FROM Task WHERE duration <= 10"
        ),
        @NamedQuery(
                name = "Task.retrieveTaskWithDurationLongerThan",
                query = "FROM Task WHERE duration > :DURATION"
        ),
})
@NamedNativeQuery(
        name = "Task.retrieveTasksWithEnoughTime",
        query = "SELECT * FROM TASKS" +
                " WHERE DATEDIFF(DATE_ADD(CREATED, INTERVAL DURATION DAY), NOW()) > 5",
        resultClass = Task.class
)
@Entity
@Table(name = "TASKS")
public class Task {

    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskList taskList;

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    public Task() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    @ManyToOne(cascade = CascadeType.MERGE)
    public TaskList getTaskList() {
        return taskList;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails tfd1) {
    }

    public void setTaskList(TaskList taskList) {
    }
}