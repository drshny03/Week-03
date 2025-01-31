package com.tit.day02.stackandqueue.queueusingstacks;

import java.util.Stack;

public class QueueImplementation {

    Stack<Integer> enStack ;
    Stack<Integer> deStack;


    public QueueImplementation() {
        enStack = new Stack<>();
        deStack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(Integer item) {
        enStack.push(item);
    }

    // Dequeue operation
    public Integer dequeue() {
        if (deStack.isEmpty()) {
            if (enStack.isEmpty()) {
                throw new RuntimeException("Queue is empty!");
            }
            while (!enStack.isEmpty()) {
                deStack.push(enStack.pop());
            }
        }
        return deStack.pop();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return enStack.isEmpty() && deStack.isEmpty();
    }

    // Peek the front element
    public Integer peek() {
        if (deStack.isEmpty()) {
            while (!enStack.isEmpty()) {
                deStack.push(enStack.pop());
            }
        }
        return deStack.peek();
    }


}





