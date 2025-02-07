package com.tit.day04.searching.linearsearch;

public class FirstNegativeNumber {

    public static void main(String[] args) {
        int[] array = {3, 5, 8, 1, 5, 7, -3};

        int index = negativeNumber(array);

        if(index == -1)
        {
            System.out.println("No Negative Numbers");
        }
        else
        {
            System.out.println("Index Of Negative Number is : "+index);
        }
    }

    private static int negativeNumber(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < 0)
            {
                return i;
            }

        }
        return -1;
    }
}
