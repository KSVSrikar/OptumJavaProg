package com.optum.trainingplan;

public class Swap {

    private int a;
    private int b;

    public Swap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String BeforeSwap(){
        return "" + a + ", " + b;
    }

    public String AfterSwap(){
        int c = a + b;
        a = b;
        b = c - b;
        return "" + a + ", " + b;
    }

}
