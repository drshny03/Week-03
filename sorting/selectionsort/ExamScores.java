package com.tit.day03.sorting.selectionsort;

import java.util.Arrays;

public class ExamScores {

    public static void selctionSort(int [] ar)
    {
         for(int i = 0; i <ar.length-1; i++)
         {
             int smallestIndex = i;

             for(int j = i+1; j<ar.length; j++)
             {
                 if(ar[smallestIndex]>ar[j])
                 {
                     smallestIndex = j;
                 }
             }
            int temp = ar[i];
             ar[i] = ar[smallestIndex];
             ar[smallestIndex]= temp;
         }
    }


    public static void main(String[] args)
    {


        int[] array = {30,25,15,88,90};

        System.out.println("Unsorted Array" + Arrays.toString(array));

        selctionSort(array);

        System.out.println("Sorted Array" + Arrays.toString(array));


    }
}
