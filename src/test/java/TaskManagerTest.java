import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TaskManagerTest {
    
    @Test
    public void testGetTasksForStudent() {
        // Create TaskManager instance
        TaskManager taskManager = new TaskManager();
        
        // Add sample tasks
        taskManager.addTask(new Task("1", "Homework 1", "Pending", "2024-05-20", "Complete Chapter 1 exercises"));
        taskManager.addTask(new Task("2", "Assignment 1", "Pending", "2024-05-25", "Write a research paper"));
        taskManager.addTask(new Task("3", "Project 1", "Completed", "2024-06-05", "Develop a web application"));
        
        // Test getTasksForStudent method
        List<Task> tasks = taskManager.getTasksForStudent("123456");
        Assert.assertEquals(3, tasks.size());
        
        // Test the content of the retrieved tasks
        Task task1 = tasks.get(0);
        Assert.assertEquals("Homework 1", task1.getTaskName());
        Assert.assertEquals("Pending", task1.getStatus());
        Assert.assertEquals("2024-05-20", task1.getDeadline());
        Assert.assertEquals("Complete Chapter 1 exercises", task1.getInstructions());
        
        Task task2 = tasks.get(1);
        Assert.assertEquals("Assignment 1", task2.getTaskName());
        Assert.assertEquals("Pending", task2.getStatus());
        Assert.assertEquals("2024-05-25", task2.getDeadline());
        Assert.assertEquals("Write a research paper", task2.getInstructions());
        
        Task task3 = tasks.get(2);
        Assert.assertEquals("Project 1", task3.getTaskName());
        Assert.assertEquals("Completed", task3.getStatus());
        Assert.assertEquals("2024-06-05", task3.getDeadline());
        Assert.assertEquals("Develop a web application", task3.getInstructions());
    }

    // Add more test cases for other methods if needed
}
