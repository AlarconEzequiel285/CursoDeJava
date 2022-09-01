package TP10;
import java.util.Scanner;

public class AdivinarNum {

    public static void main(String[] args) {
        double numerorandom = (Math.floor(Math.random() * 100 + 1));
        Scanner lectura = new Scanner(System.in);
        //System.out.println(numerorandom);
        //Usado de prueba para ver como se comportaba el algoritmo al adivinar el numero
        int intentos = 0;
        int numuser;
        do {
            System.out.println("Introduzca un número");
            numuser = lectura.nextInt();
            if (numerorandom > numuser) {
                System.out.println("Su numero ingresado es menor, intente de nuevo");
                intentos++;
            } else if (numerorandom < numuser) {
                System.out.println("Su numero ingresado es mayor, intente de nuevo");
                intentos++;
            } else if (numerorandom == numuser) {
                break;
            }
        } while (numerorandom != numuser);
        System.out.println("Nice!, su numero de intentos es " + intentos);
    }
}
