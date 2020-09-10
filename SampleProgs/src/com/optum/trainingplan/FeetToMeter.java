package com.optum.trainingplan;

public class FeetToMeter {

    private int ft;

    public FeetToMeter(int ft) {
        this.ft = ft;
    }

    public float Convert(){
        return ft*0.305f;
    }

}
