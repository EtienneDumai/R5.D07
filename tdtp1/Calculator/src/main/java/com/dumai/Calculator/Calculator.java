package com.dumai.Calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    Calculator(){}
    public int add(int opG, int opD){
        return opG + opD;
    }
    public int divide(int opG, int opD){
        return opG / opD;
    }
    public Set<Integer> ensembleschiffres(int pNombre){
        Set<Integer> res = new HashSet<>();
        long n = Math.abs((long) pNombre); // évite le débordement pour Integer.MIN_VALUE

        if (n == 0) {
            res.add(0);
            return res;
        }
        while (n > 0) {
            res.add((int) (n % 10));
            n /= 10;
        }
        return res;

    }

}
