package com.tit.day02.hashmap.twosum;

import java.util.HashMap;
import java.util.Map;
public class TwoSum {

            private Map<Integer, Integer >  map;

            public TwoSum()
            {
                map = new HashMap<>();
            }

            public  int [] findindices (int[]  array, int targetSum)
            {
                int length = array.length;

                for(int i = 0; i<length; i++)
                {
                    int remain = targetSum- array[i];

                    if(map.containsKey(remain))
                    {
                        int [] result = {map.get(remain),i};
                        return result;
                    }
                    map.put(array[i],i);

                }
                return new int[]{-1,-1};

            }

}

