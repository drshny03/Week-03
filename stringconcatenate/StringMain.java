package com.tit.day06.runtimeanalysis.stringconcatenate;

import static java.lang.System.out;

class StringMain
{
    public static void main(String[] args)
    {
        StringConcatenation stringConcatenation = new StringConcatenation();
        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes)
        {
            System.out.println("Operations Count: " + n);

            // String (O(N²)) - Inefficient
            long startTime = System.nanoTime();
            stringConcatenation.testString(n);
            long stringTime = System.nanoTime() - startTime;
            System.out.println("String Time: " + stringTime / 1e6 + " ms");

            // StringBuilder (O(N)) - Fastest
            startTime = System.nanoTime();
            stringConcatenation.testStringBuilder(n);
            long stringBuilderTime = System.nanoTime() - startTime;
            System.out.println("StringBuilder Time: " + stringBuilderTime / 1e6 + " ms");

            // StringBuffer (O(N)) - Thread-Safe
            startTime = System.nanoTime();
            stringConcatenation.testStringBuffer(n);
            long stringBufferTime = System.nanoTime() - startTime;
            System.out.println("StringBuffer Time: " + stringBufferTime / 1e6 + " ms");


        }
    }
}

