package com.optum.trainingplan;

public class TempConvert {

    private float far;

    public TempConvert(float far) {
        this.far = far;
    }

    public float ConverttoCel(){
         return (((far - 32)*5)/9);
    }

}
