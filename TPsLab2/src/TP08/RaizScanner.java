package TP08;
import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = lectura.nextInt();
        int resultado = (int) Math.sqrt(numero);
        System.out.println("La raiz de " + numero + " es = " +resultado);
    }
}
