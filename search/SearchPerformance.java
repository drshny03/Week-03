package com.tit.day06.runtimeanalysis.search;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SearchPerformance { // Generate a random array of size N
    public static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n * 10);
        }
        return arr;
    }

    // Linear Search in Array (O(N))
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Measure time for Array Search
    public static long measureArraySearch(int[] arr, int target) {
        long startTime = System.nanoTime();
        linearSearch(arr, target);
        long elapsedTime = System.nanoTime() - startTime;
        return elapsedTime / 1_000_000; // Convert to milliseconds
    }

    // Measure time for HashSet Search (O(1))
    public static long measureHashSetSearch(HashSet<Integer> hashSet, int target) {
        long startTime = System.nanoTime();
        hashSet.contains(target);
        long elapsedTime = System.nanoTime() - startTime;
        return elapsedTime / 1_000_000;
    }

    // Measure time for TreeSet Search (O(log N))
    public static long measureTreeSetSearch(TreeSet<Integer> treeSet, int target) {
        long startTime = System.nanoTime();
        treeSet.contains(target);
        long elapsedTime = System.nanoTime() - startTime;
        return elapsedTime / 1_000_000;
    }
}
