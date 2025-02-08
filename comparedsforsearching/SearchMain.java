package com.tit.day06.runtimeanalysis.comparedsforsearching;

import java.util.Arrays;
import java.util.Random;

public class SearchMain
{
    public static void main(String[] args)
    {
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm() ;
        int[] sizes = {1000, 10000, 1000000};
        Random rand = new Random();

        for (int n : sizes) {
            int[] data = new int[n];

            // Generate random dataset
            for (int i = 0; i < n; i++)
            {
                data[i] = rand.nextInt(n * 10); // Random values
            }

            int target = data[rand.nextInt(n)]; // Pick a random target from the array

            // Measure Linear Search time
            long startTime = System.nanoTime();
            searchAlgorithm.linearSearch(data, target);
            long linearTime = System.nanoTime() - startTime;

            // Sorting before Binary Search (O(N log N))
            Arrays.sort(data);

            // Measure Binary Search time
            startTime = System.nanoTime();
            searchAlgorithm.binarySearch(data, target);
            long binaryTime = System.nanoTime() - startTime;

            // Print results
            System.out.println("Dataset Size: " + n);
            System.out.println("Linear Search Time: " + linearTime / 1e6 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1e6 + " ms");

        }
    }
}
