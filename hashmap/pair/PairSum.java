package com.tit.day02.hashmap.pair;


import java.util.HashMap;
import java.util.Map;
public class PairSum
{

    public void findPair(int [] array, int targetSum)
    {
            Map<Integer, Integer> map  = new HashMap<>();

            boolean found  = false;

            for (int i = 0; i<array.length; i++)
            {
                int remainSum = targetSum-array[i];
                if(map.containsKey(remainSum))
                {
                    System.out.println(remainSum + " "+ array[i]);
                    found = true;
                    return;
                }
                map.put(array[i], i);
            }
            if(!found)
            {
                System.out.println("No Pair Found");
            }


    }

            public static void main(String[] args)
            {

                int [] array = {1,3,5,2,3,8,0,3};
                int targetSum = 5;

                PairSum pairSum = new PairSum();
                pairSum.findPair(array, targetSum);
            }

}

