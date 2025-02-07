package com.tit.day04.searching.binarysearch;

public class PeakElement {


    public static int findPeakElement(int[] arr)
    {
        int left = 0, right = arr.length - 1;

        while (left < right)
        {
            int mid = (left + right) / 2;

            if (arr[mid] > arr[mid + 1])
            {
                right = mid;
            } else
            {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1,4,3};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element: " + arr[peakIndex]);
    }
}
