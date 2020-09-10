package com.optum.trainingplan;

import java.util.Arrays;

public class SecondLargest {
    private int[] arr;

    public SecondLargest(int[] arr) {
        this.arr = arr;
    }

    public String FindSecLargest(){
        Arrays.sort(arr);
        return "" + arr[arr.length-2];
    }

}
