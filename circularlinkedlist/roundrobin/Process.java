package com.tit.day01.linkedlist.circularlinkedlist.roundrobin;

public class Process {

    int processId;
    int burstTime;
    int priority;
    int waitingTime = 0;
    int turnAroundTime = 0;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
