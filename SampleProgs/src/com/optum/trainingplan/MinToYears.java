package com.optum.trainingplan;

public class MinToYears {

    private int min;

    public MinToYears(int min) {
        this.min = min;
    }

    public String Convert(){
        int y = min/525600;
        min = min % 525600;
        int d = min/1440;

        return "" + y + ", " + d;
    }

}
