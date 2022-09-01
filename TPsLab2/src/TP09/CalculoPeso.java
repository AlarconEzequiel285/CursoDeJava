package TP09;
import java.util.Scanner;

public class CalculoPeso {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese su estatura en cm");
        int estatura = lectura.nextInt();
        Scanner lectura2 = new Scanner(System.in);
        System.out.println("Introduzca M si es mujer o H si es hombre");
        String genero = lectura2.nextLine();

        int pesoideal;
        if (genero.equals("M")) {
            pesoideal = estatura - 120;
        } else {
            pesoideal = estatura - 110;
        }
        System.out.println("Su peso ideal es: " + pesoideal);
    }
}
