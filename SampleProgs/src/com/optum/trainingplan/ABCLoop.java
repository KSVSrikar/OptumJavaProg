package com.optum.trainingplan;

public class ABCLoop {

    public static char[] Print(){
        int num = 65;
        char[] abc = new char[26];
        for(int i = 0; i < 26; i++){
            abc[i] = (char) (i + num);
        }
        return abc;
    }

}
