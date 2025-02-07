package com.tit.day04.challengeproblem;

public class LinearSearch {


    public int findFirstMissingPositive(int[] arr) {


        // Place each number in its correct position if possible
        for (int i = 0; i < arr.length; i++)
        {
            while (arr[i] > 0 && arr[i] <= arr.length && arr[arr[i] - 1] != arr[i])
            {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Find the first missing positive number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
