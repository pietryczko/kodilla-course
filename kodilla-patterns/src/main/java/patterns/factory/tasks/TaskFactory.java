package patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPINGTASK";
    public static final String PAINTING = "PAINTINGTASK";
    public static final String DRIVING = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Order 1", "Carrot", 2);
            case PAINTING -> new PaintingTask("Task 1", "White", "Car");
            case DRIVING -> new DrivingTask("Course 1", "Poznan", "Bus");
            default -> null;
        };
    }
}
