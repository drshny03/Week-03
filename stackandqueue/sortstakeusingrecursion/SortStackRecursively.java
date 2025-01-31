package com.tit.day02.stackandqueue.sortstakeusingrecursion;

import java.util.Stack;
public class SortStackRecursively { // Function to sort the stack
    public void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty())
        {
            int top = stack.pop(); // Remove top element
            sortStack(stack); // Recursively sort the rest
            insertInSortedOrder(stack, top); // Insert the element at correct position
        }

    }

    // Helper function to insert an element at the correct position
    private void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element); // Push if empty or correct order found
        } else {
            int temp = stack.pop(); // Remove top element
            insertInSortedOrder(stack, element); // Recursive call
            stack.push(temp); // Push back the popped element
        }
    }
}