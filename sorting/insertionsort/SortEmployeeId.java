package com.tit.day03.sorting.insertionsort;

import java.util.Arrays;

public class SortEmployeeId {

   public static void insertionSort(int []ar)
   {
            for(int i = 1; i<ar.length; i++)
            {
                int temp = ar[i];
                int j = i-1;
                while(j>=0 && temp < ar[j])
                {
                    ar[j+1] = ar [j];
                    j--;
                }

                ar[j+1] = temp;
            }
   }

    public static void main(String[] args)
    {


        int[] array = {88,34,01,18,07};

        System.out.println("Unsorted Array" + Arrays.toString(array));

        insertionSort(array);

        System.out.println("Sorted Array" + Arrays.toString(array));


    }
}
