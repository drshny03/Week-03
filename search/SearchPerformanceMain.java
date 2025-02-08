package com.tit.day06.runtimeanalysis.search;

import java.util.HashSet;
import java.util.TreeSet;

public class SearchPerformanceMain
{
    public static void main(String[] args)
    {
        SearchPerformance searchPerformance = new SearchPerformance() ;
        int[] sizes = {1000, 100000, 1000000};

        for (int n : sizes)
        {
            int[] array = searchPerformance.generateRandomArray(n);
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Insert elements into HashSet and TreeSet
            for (int num : array) {
                hashSet.add(num);
                treeSet.add(num);
            }

            int target = array[n / 2]; // Choose a middle element to search

            System.out.println("Dataset Size: " + n);

            long arrayTime = searchPerformance.measureArraySearch(array, target);
            System.out.println("Array Search Time: " + arrayTime + " ms");

            long hashSetTime = searchPerformance.measureHashSetSearch(hashSet, target);
            System.out.println("HashSet Search Time: " + hashSetTime + " ms");

            long treeSetTime = searchPerformance.measureTreeSetSearch(treeSet, target);
            System.out.println("TreeSet Search Time: " + treeSetTime + " ms");

        }
        }
}
