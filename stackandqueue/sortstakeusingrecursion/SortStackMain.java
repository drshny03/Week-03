package com.tit.day02.stackandqueue.sortstakeusingrecursion;


import java.util.Stack;
public class SortStackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        SortStackRecursively sorter = new SortStackRecursively();
        sorter.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
