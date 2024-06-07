package Week2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskScheduler {
    private Queue<String> taskQueue;

    public TaskScheduler() {
        taskQueue = new LinkedList<>();
    }

    // Add a task to the queue
    public void addTask(String task) {
        taskQueue.offer(task);
        System.out.println("Task added: " + task);
    }

    // Remove a completed task from the queue
    public void removeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks to remove. The queue is empty.");
        } else {
            String removedTask = taskQueue.poll();
            System.out.println("Task removed: " + removedTask);
        }
    }

    // Display the current tasks in the queue
    public void displayTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("The queue is empty. No tasks to display.");
        } else {
            System.out.println("Current tasks in the queue: " + taskQueue);
        }
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Display tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
           scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String task = scanner.nextLine();
                    scheduler.addTask(task);
                    break;
                case 2:
                    scheduler.removeTask();
                    break;
                case 3:
                    scheduler.displayTasks();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the Task Scheduler.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
