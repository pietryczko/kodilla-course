package patterns.factory.tasks;

public class DrivingTask implements Task{

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {

    }

    @Override
    public void getTaskName() {

    }

    @Override
    public void isTaskExecuted() {

    }
}
