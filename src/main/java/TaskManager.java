import java.util.ArrayList;
import java.util.List;

// Task class to represent a task
class Task {
    private String taskId;
    private String taskName;
    private String status;
    private String deadline;
    private String instructions;

    // Constructor
    public Task(String taskId, String taskName, String status, String deadline, String instructions) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.deadline = deadline;
        this.instructions = instructions;
    }

    // Getters and setters
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}

// TaskManager class to manage tasks
class TaskManager {
    private List<Task> tasks;

    // Constructor
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Method to add task
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to get all tasks for a given student ID
    public List<Task> getTasksForStudent(String studentId) {
        List<Task> studentTasks = new ArrayList<>();
        // Logic to filter tasks for the given student ID
        // For demonstration, returning all tasks
        studentTasks.addAll(tasks);
        return studentTasks;
    }

    // Method to filter tasks by status
    public List<Task> filterTasksByStatus(String status) {
        List<Task> filteredTasks = new ArrayList<>();
        // Logic to filter tasks by status
        // For demonstration, returning all tasks
        filteredTasks.addAll(tasks);
        return filteredTasks;
    }

    // Method to update task status
    public void updateTaskStatus(String taskId, String status) {
        // Logic to update task status
        // For demonstration, updating task status
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId)) {
                task.setStatus(status);
                break;
            }
        }
    }
}

// CommunicationManager class to manage communication
class CommunicationManager {
    // Placeholder method for sending a message
    public void sendMessage(String message) {
        // Placeholder logic to send a message
    }

    // Placeholder method for receiving a message
    public String receiveMessage() {
        // Placeholder logic to receive a message
        return "Placeholder message";
    }
}

// ProgressTracker class to track progress
class ProgressTracker {
    // Placeholder method for tracking progress
    public void trackProgress(String taskId, int progressPercentage) {
        // Placeholder logic to track progress
    }

    // Placeholder method for generating reports
    public void generateReport() {
        // Placeholder logic to generate reports
    }
}
