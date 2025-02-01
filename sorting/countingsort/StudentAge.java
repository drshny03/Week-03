package com.tit.day03.sorting.countingsort;

import java.util.Arrays;

public class StudentAge {


    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 12, 16, 10};
        countingSort(ages);
        System.out.println(Arrays.toString(ages));
    }

    private static void countingSort(int[] age) {
        int length = age.length;

        //find largest element
        int largest = age[0];
        for (int currentAge : age){
            if(largest < currentAge){
                largest = currentAge;
            }
        }
        //create array to store frequency
        int[] count = new int[largest+1];
        //count frequency
        for (int i=0; i<length; i++){
            count[age[i]]++;
        }

        //store element to orignal array
        int index =0;
        for(int i=0; i<=largest; i++){
            while(count[i] > 0){
                age[index++] = i;
                count[i]--;
            }
        }
    }

    }
