import java.util.List;

public class Layer2Driver {
    public static void main(String[] args) {
        // Create instances of Layer 3 functions
        TaskManager taskManager = new TaskManager();
        
        // Call methods of Layer 3 functions to test integration
        List<Task> tasks = taskManager.getTasksForStudent("123456");
        System.out.println("Tasks for student 123456:");
        for (Task task : tasks) {
            System.out.println(task.getTaskName() + " - " + task.getStatus());
        }
        
        // Add more integration tests for other Layer 3 functions if needed
    }
}