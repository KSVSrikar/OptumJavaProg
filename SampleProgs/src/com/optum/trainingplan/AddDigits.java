package com.optum.trainingplan;

public class AddDigits {

    private int num;

    public AddDigits(int num) {
        this.num = num;
    }

    public int FindsumofDigits(){
        int x = num;
        int sum = 0;
        while(x>0){
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }

}
