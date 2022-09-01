package TP11;
public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente Cuenta1 = new CuentaCorriente("Alarcon Ezequiel", 7000);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Villafañe Sofia",1500);

        System.out.println("Datos de las cuentas");
        System.out.println(Cuenta1.toString() + " Saldo actual = " + Cuenta1.getSaldo());
        System.out.println(Cuenta2.toString() + " Saldo actual = " + Cuenta2.getSaldo());
        System.out.println();

        Cuenta1.Transferencias(Cuenta2, 2500);
        System.out.println("La transferencia se ha realizado");
        System.out.println("La cuenta 1 realizo una transferencia de $2500 a la cuenta 2");
        System.out.println();

        System.out.println("La cuenta de " + Cuenta1.toString() + " tiene un monto de " + Cuenta1.getSaldo());
        System.out.println("La cuenta de " + Cuenta2.toString() + " tiene un monto de " + Cuenta2.getSaldo());
    }
}