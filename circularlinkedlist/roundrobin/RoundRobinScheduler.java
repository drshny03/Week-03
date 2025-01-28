package com.tit.day01.linkedlist.circularlinkedlist.roundrobin;

public class RoundRobinScheduler {


    private Process head = null;
    private Process tail = null;

    // Add a new process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    // Remove a process by Process ID after execution
    public void removeProcess(int processId) {
        if (head == null) return;

        Process temp = head;
        Process prev = null;

        do {
            if (temp.processId == processId) {
                if (temp == head) {
                    if (head == tail) { // Only one process
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
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate round-robin scheduling
    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        Process current = head;
        int totalTime = 0;
        int totalProcesses = 0;

        // Calculate total number of processes
        Process temp = head;
        do {
            totalProcesses++;
            temp = temp.next;
        } while (temp != head);

        while (head != null) {
            System.out.println("\nExecuting process: " + current.processId);

            // Execute the process for the given time quantum or less
            if (current.burstTime <= timeQuantum) {
                totalTime += current.burstTime;
                current.turnAroundTime = totalTime;
                current.waitingTime = totalTime - current.burstTime;

                System.out.println("Process " + current.processId + " completed.");
                removeProcess(current.processId);

                if (head == null) break;

                current = current.next;
            } else {
                totalTime += timeQuantum;
                current.burstTime -= timeQuantum;
                current = current.next;
            }

            // Display the current state of the queue
            displayProcesses();
        }

        // Calculate and display average waiting time and turnaround time
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;

        do {
            totalWaitingTime += temp.waitingTime;
            totalTurnAroundTime += temp.turnAroundTime;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / totalProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnAroundTime / totalProcesses);
    }

    // Display the list of processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        System.out.println("Current Processes:");
        Process temp = head;
        do {
            System.out.println("[Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime +
                    ", Priority: " + temp.priority + "]");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Add processes to the queue
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 12, 3);

        System.out.println("Initial Process Queue:");
        scheduler.displayProcesses();

        // Simulate the round-robin scheduling with a time quantum of 4
        scheduler.simulate(4);
    }
}
