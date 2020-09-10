package com.optum.trainingplan;

public class EMICalc {

    private int P;
    private float rpa;
    private int m;

    public EMICalc(int p, float rpa, int m) {
        P = p;
        this.rpa = rpa;
        this.m = m;
    }

    public float Calculate(){
        float r = rpa/1200;
        float x = (float) ((P*r*Math.pow((1+r),m))/(Math.pow((1+r), m) - 1));
        return x*12;
    }
}
