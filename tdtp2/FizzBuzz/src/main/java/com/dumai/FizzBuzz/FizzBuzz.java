package com.dumai.FizzBuzz;


public class FizzBuzz {
    public FizzBuzz() {
    }

    public static String de(int nb) {
        String s = "";
        if (nb % 3 == 0) {
            s = "Fizz";
        }
        return s;
    }
}
