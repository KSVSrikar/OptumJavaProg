package com.optum.trainingplan;

public class EvenOrOdd {

    private int num;

    public EvenOrOdd(int num) {
        this.num = num;
    }

    public String Determine(){
        if(num%2==0){
            return "E";
        }else{
            return "O";
        }
    }

}
