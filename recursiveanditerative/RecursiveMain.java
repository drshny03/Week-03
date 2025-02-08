package com.tit.day06.runtimeanalysis.recursiveanditerative;

import static java.lang.System.out;

public class RecursiveMain
{
  public static void main(String[] args)
    {
        long startTime;
        long endTime;
        long totalTime;

        //create object of fibonacci class
        Fibonacci fibonacci = new Fibonacci();
        int number = 30;
        //calculate fibonacci number by iterative method
        startTime = System.nanoTime();
        fibonacci.fibonacciIterative(number);
        endTime = System.nanoTime();

        //total time taken by iterative method
        totalTime = endTime-startTime;
        out.println("time taken by iterative method in millisecond- "+totalTime/1e6);

        //calculate fibonacci number by recursive method
        startTime = System.nanoTime();
        fibonacci.fibonacciRecursive(number);
        endTime = System.nanoTime();

        //total time taken by recursive method
        totalTime = endTime-startTime;
        out.println("time taken by recursive method in millisecond- "+totalTime/1e6);
    }

}
