package com.tit.day02.hashmap.subarrays;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubarrays {

    public void findZeroSumSubarryas(int[] nums)
    {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;

//        sumMap.put(0,-1);

        for(int i = 0; i<nums.length; i++)
        {
            sum = sum +nums[i];

            if(sumMap.containsKey(sum))
            {
                System.out.println("Subarray found from index "+(sumMap.get(sum)+1)+"to"+i);
            }
            sumMap.put(sum,i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-7,3,1,3,1,-4,-2,-2};

        ZeroSumSubarrays solution = new ZeroSumSubarrays();

        solution.findZeroSumSubarryas(nums);
    }



}
