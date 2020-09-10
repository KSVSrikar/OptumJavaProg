package com.optum.trainingplan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraySum {

    private int sum;
    private  int[] Arr;

    public ArraySum(int sum, int[] Arr) {
        this.sum = sum;
        this.Arr = Arr;
    }

    public ArrayList<String> findPair()
    {
        // create Hash Map
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<String> output = new ArrayList<>();
        // keep count for checking if no pair
        int c = 0;
        for (int i = 0; i < Arr.length; i++)
        {
            // check if pair (A[i], sum-A[i]) exists

            // if difference is seen before, print the pair
            if (map.containsKey(sum - Arr[i]))
            {
                c++;
                output.add("" +
                        map.get(sum - Arr[i]) + ", " + i);
            }

            // store in map
            map.put(Arr[i], i);
        }

        // No pair exists
        if(c == 0){
            output.add("No Pair");
        }
        return output;
    }
}
