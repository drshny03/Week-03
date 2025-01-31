package com.tit.day02.stackandqueue.slidingwindow;
import java.util.Arrays;
public class SlidingWindowMaxMain {


    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        SlidingWindowMax solution = new SlidingWindowMax();
        int[] result = solution.maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximum: " + Arrays.toString(result));
    }

}
