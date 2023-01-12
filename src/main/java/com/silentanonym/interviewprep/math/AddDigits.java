package com.silentanonym.interviewprep.math;

public class AddDigits {

    // Digital Root
    public int addDigits(int num) {
        if(num == 0) return 0;
        int mod9 = num % 9;
        return mod9 == 0 ? 9 : mod9;
    }
}
