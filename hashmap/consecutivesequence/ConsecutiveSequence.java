package com.tit.day02.hashmap.consecutivesequence;

import java.util.HashSet;
public class ConsecutiveSequence {



    public int findLongestConsecutive(int[] nums)
    {
        if (nums.length == 0) return 0;

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : nums)
        {
            if (!numSet.contains(num - 1)) { // Check if it's the start of a sequence
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1))
                {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }



    public static void main(String[] args)
    {
        int[] nums = {100, 4, 200, 1, 3, 2};

        ConsecutiveSequence solution = new ConsecutiveSequence();
        int longestSequence = solution.findLongestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + longestSequence);
    }

}
