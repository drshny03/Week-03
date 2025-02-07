package com.tit.day04.searching.binarysearch;

public class RotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left =0;
        int right = arr.length-1;
        while(left<right)
        {
            int mid = (left+right)/2;
            if(arr[mid]>arr[right])
            {
                 left = mid+1;
            }
            if(arr[mid]<arr[right])
            {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int rotationPoint = findRotationPoint(arr);
        System.out.println("Rotation Point Index: " + rotationPoint);
        System.out.println("Smallest Element: " + arr[rotationPoint]);
    }
}
