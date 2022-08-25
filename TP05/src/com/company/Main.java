package com.company;

public class Main {

    public static void main(String[] args) {
        double frac1 = 6.0/5.0;
        double frac2 = 2.0/3.0;
        double frac3 = 7.0/2.0;
        double frac4 = 2.0/30.0;
        double frac5 = 1.0/3.0;
        double resultado = Math.round((frac1 - frac2 * frac3 + frac4) / (frac5 / 5));

        System.out.println(resultado);
    }
}
