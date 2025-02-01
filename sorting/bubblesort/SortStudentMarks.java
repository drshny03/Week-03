package com.tit.day03.sorting.bubblesort;

import java.util.Arrays;

public class SortStudentMarks {

    public static void bubbleSort(int[] ar)
    {
        int n = ar.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    ar[j] = ar[j] - ar[j + 1];
                    ar[j + 1] = ar[j] + ar[j + 1];
                    ar[j] = ar[j + 1] - ar[j];
                }
            }
        }

    }


    public static void main(String[] args)
    {


        int[] array = {30,25,15,88,90};

        System.out.println("Unsorted Array" + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Sorted Array" + Arrays.toString(array));


    }

}

