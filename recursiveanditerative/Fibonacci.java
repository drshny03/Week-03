package com.tit.day06.runtimeanalysis.recursiveanditerative;

public class Fibonacci {

    //constructor
    public Fibonacci(){}

    //method to calculate fibonacci by recursion
    public int fibonacciRecursive(int number)
    {
        if (number <= 1) return number;
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }
    //method to calculate fibonacci by iterative method
    public int fibonacciIterative(int n)
    {
        int first = 0, second = 1, sum;
        for (int i = 2; i <= n; i++)
        {
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }


}
