package com.dumai.FizzBuzz;

s
public class FizzBuzz {
    public FizzBuzz() {
    }

    public static String de(int nb) {
        String s = "";
        if (nb % 3 == 0) {
            s = "Fizz";
        }
        else if (nb % 5 == 0) {
            s = "Buzz";
        }
        return s;
    }
}
