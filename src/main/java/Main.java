import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create TaskManager instance
        TaskManager taskManager = new TaskManager();

        // Add sample tasks
        taskManager.addTask(new Task("1", "Homework 1", "Pending", "2024-05-20", "Complete Chapter 1 exercises"));
        taskManager.addTask(new Task("2", "Assignment 1", "Pending", "2024-05-25", "Write a research paper"));
        taskManager.addTask(new Task("3", "Project 1", "Completed", "2024-06-05", "Develop a web application"));

        // Get tasks for a student
        List<Task> studentTasks = taskManager.getTasksForStudent("s223608412");
        System.out.println("Tasks for student s223608412:");
        for (Task task : studentTasks) {
            System.out.println(task.getTaskName() + " - " + task.getStatus());
        }

        // Filter tasks by status
        List<Task> pendingTasks = taskManager.filterTasksByStatus("Pending");
        System.out.println("\nPending tasks:");
        for (Task task : pendingTasks) {
            System.out.println(task.getTaskName() + " - " + task.getStatus());
        }

        // Update task status
        taskManager.updateTaskStatus("1", "Completed");
        System.out.println("\nUpdated task status:");
        for (Task task : taskManager.getTasksForStudent("123456")) {
            System.out.println(task.getTaskName() + " - " + task.getStatus());
        }

        // Create CommunicationManager instance
        CommunicationManager communicationManager = new CommunicationManager();

        // Send a message
        communicationManager.sendMessage("Hello, how are you?");

        // Receive a message
        String receivedMessage = communicationManager.receiveMessage();
        System.out.println("\nReceived message: " + receivedMessage);

        // Create ProgressTracker instance
        ProgressTracker progressTracker = new ProgressTracker();

        // Track progress
        progressTracker.trackProgress("1", 50);

        // Generate report
        progressTracker.generateReport();
    }
}