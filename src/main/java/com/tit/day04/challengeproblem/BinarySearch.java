package com.tit.day04.challengeproblem;

import java.util.Arrays;

public class BinarySearch {


    public int search(int[] arr, int target) {
        Arrays.sort(arr);   // Sort the array before applying binary search
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
}
