package com.dumai.FizzBuzz;

public class FizzBuzz {
    public FizzBuzz() {
    }

    public static String de(int nb) {
        String s = "";
        if(nb%5 == 0 && nb%3 == 0){
            s= "FizzBuzz";
            return s;
        }
        else if (nb % 3 == 0) {
            s = "Fizz";
            return s;
        }
        else if (nb % 5 == 0) {
            s = "Buzz";
            return s;
        }
        else{
            s = String.valueOf(nb);
        }
        return s;
    }
}
