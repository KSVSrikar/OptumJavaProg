package com.optum.trainingplan;

public class RectArea {

    private float h;
    private float b;

    public RectArea(float h, float b) {
        this.h = h;
        this.b = b;
    }

    public float AreaCalc(){
        return h*b;
    }

}
