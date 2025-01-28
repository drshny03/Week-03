package com.tit.day01.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerMain {


    private TaskNode head = null;
    private TaskNode tail = null;
    private TaskNode current = null;

    // Add task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    // Add task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    // Add task at a specific position
    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);

        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (count == position - 1) {
            newTask.next = temp.next;
            temp.next = newTask;
            if (temp == tail) {
                tail = newTask;
                tail.next = head;
            }
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    // Remove task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head, prev = null;

        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    if (head == tail) { // Only one task
                        head = tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View the current task and move to the next task
    public void viewAndMoveToNextTask() {
        if (current == null) {
            current = head;
        }

        if (current != null) {
            System.out.println("Current Task: [ID: " + current.taskId + ", Name: " + current.taskName +
                    ", Priority: " + current.priority + ", Due Date: " + current.dueDate + "]");
            current = current.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks in the list
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        System.out.println("Tasks:");
        do {
            System.out.println("[ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate + "]");
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by priority
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println("[ID: " + temp.taskId + ", Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate + "]");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority + ".");
        }
    }

    public static void main(String[] args) {
        TaskSchedulerMain scheduler = new TaskSchedulerMain();

        // Adding tasks
        scheduler.addTaskAtEnd(1, "Task 1", 3, "2025-01-30");
        scheduler.addTaskAtBeginning(2, "Task 2", 2, "2025-01-29");
        scheduler.addTaskAtEnd(3, "Task 3", 1, "2025-02-01");
        scheduler.addTaskAtPosition(2, 4, "Task 4", 4, "2025-01-31");

        // Displaying all tasks
        scheduler.displayAllTasks();

        // Viewing current task and moving to next
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        // Searching tasks by priority
        scheduler.searchTaskByPriority(2);

        // Removing a task
        scheduler.removeTaskById(2);

        // Displaying all tasks after removal
        scheduler.displayAllTasks();
    }
}
