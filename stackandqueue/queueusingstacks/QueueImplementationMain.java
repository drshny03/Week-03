package com.tit.day02.stackandqueue.queueusingstacks;

public class QueueImplementationMain {

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.peek());    // 2
        System.out.println(queue.dequeue()); // 2

        queue.enqueue(4);
       System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 4
    }
}
