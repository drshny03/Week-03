package com.tit.day04.challengeproblem;

public class SearchMain {


    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        // Linear Search for missing positive integer
        LinearSearch linearSearch = new LinearSearch();
        int missingPositive = linearSearch.findFirstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missingPositive);

        // Binary Search for target index
        BinarySearch binarySearch = new BinarySearch();
        int targetIndex = binarySearch.search(arr, target);
        System.out.println("Target Index (after sorting): " + targetIndex);
    }
}
