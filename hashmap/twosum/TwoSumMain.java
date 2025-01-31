package com.tit.day02.hashmap.twosum;

public class TwoSumMain {

    public static void main(String ar[])
    {
        int []array = {4,5,2,3,1,9,4};
        int targetSum = 8;
        TwoSum  twoSum = new TwoSum();

        int [] result  = twoSum.findindices(array,targetSum);

        if(result[0]==-1 || result [1] == -1)
        {
            System.out.println("NO Indices Found");
        }
        else {
            System.out.println("Indices are - "+result[0]+" "+ result[1]);
        }
    }
}
