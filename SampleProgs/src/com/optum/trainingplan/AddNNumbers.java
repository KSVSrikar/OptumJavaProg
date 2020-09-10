package com.optum.trainingplan;

public class AddNNumbers {

    private int[] arr;

    public AddNNumbers(int[] arr) {
        this.arr = arr;
    }

    public int AddArray(){
        int sum = 0;
        for(int i = 0; i  < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
