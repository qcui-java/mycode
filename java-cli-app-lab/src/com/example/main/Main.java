package com.example.main;

import com.example.service.TaskManager;
import java.util.Scanner;

/**
 * Runs a CLI to-do list application.
 */
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("To-Do List CLI (add <task>, complete <index>, view, exit)");

        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                running = false;
            } else if (input.equalsIgnoreCase("view")) {
                taskManager.displayTasks();
            } else if (input.startsWith("add ")) {
                String description = input.substring(4).trim();
                if (!description.isEmpty()) {
                    taskManager.addTask(description);
                    System.out.println("Task added.");
                } else {
                    System.out.println("Please provide a task description.");
                }
            } else if (input.startsWith("complete ")) {
                try {
                    int index = Integer.parseInt(input.substring(9).trim());
                    taskManager.completeTask(index);
                    System.out.println("Task completed.");
                } catch (NumberFormatException e) {
                    System.out.println("Please provide a valid task index.");
                }
            } else {
                System.out.println("Invalid command. Use: add <task>, complete <index>, view, exit");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}

