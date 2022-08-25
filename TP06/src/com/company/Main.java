package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int numero = lectura.nextInt();
        System.out.println("Math.sin: "+Math.sin(numero));
        System.out.println("Math.cos: "+Math.cos(numero));
        System.out.println("Math.tan: "+Math.tan(numero));
        System.out.println("Math.atan: "+Math.atan(numero));
        System.out.println("Math.exp: "+Math.exp(numero));
        System.out.println("Math.log: "+Math.log(numero));
        System.out.println("Math.PI: "+ Math.PI*numero);
        System.out.println("Math.E: "+Math.E*numero);

        System.out.println("Ingrese otro numero");
        int numero2 = lectura.nextInt();
        System.out.println("Math.atan2: "+Math.atan2(numero,numero2));
    }
}
