package com.optum.trainingplan;

public class Fibonacci {

    private int terms;

    public Fibonacci(int terms) {
        this.terms = terms;
    }

    public int[] Fseries(){
        int[] arr = new int[terms];
        if(terms == 1){
            arr[0] = 1;
        } else
            if(terms == 2) {
                arr[0] = 1;
                arr[1] = 1;
            }else {
                arr[0] = 1;
                arr[1] = 1;
                for(int i = 2; i < terms; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
        }
        return arr;
    }
}
