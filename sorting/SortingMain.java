package com.tit.day06.runtimeanalysis.sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingMain {

    public static void main(String[] args) {

        SortingMethods sortingMethods = new SortingMethods();
        int[] sizes = {1000, 10000, 1000000};
        Random rand = new Random();

        for (int n : sizes) {
            int[] data = new int[n];

            // Generate random dataset
            for (int i = 0; i < n; i++) {
                data[i] = rand.nextInt(n * 10); // Random values
            }

            System.out.println("Dataset Size: " + n);

            // Bubble Sort (O(N²)) - Very Slow for Large Data
            if (n <= 10000) { // Avoid running for large N
                int[] bubbleData = Arrays.copyOf(data, data.length);
                long startTime = System.nanoTime();
                sortingMethods.bubbleSort(bubbleData);
                long bubbleTime = System.nanoTime() - startTime;
                System.out.println("Bubble Sort Time: " + bubbleTime / 1e6 + " ms");
            } else {
                System.out.println("Bubble Sort: Unfeasible for N = " + n);
            }

            // Merge Sort (O(N log N)) - Efficient
            int[] mergeData = Arrays.copyOf(data, data.length);
            long startTime = System.nanoTime();
            sortingMethods.mergeSort(mergeData, 0, mergeData.length - 1);
            long mergeTime = System.nanoTime() - startTime;
            System.out.println("Merge Sort Time: " + mergeTime / 1e6 + " ms");

            // Quick Sort (O(N log N)) - Efficient but Unstable
            int[] quickData = Arrays.copyOf(data, data.length);
            startTime = System.nanoTime();
            sortingMethods.quickSort(quickData, 0, quickData.length - 1);
            long quickTime = System.nanoTime() - startTime;
            System.out.println("Quick Sort Time: " + quickTime / 1e6 + " ms");


        }

    }
}
