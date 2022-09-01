package TP11;

public class CuentaCorriente {

    private double saldo;
    private String nombreTitular;
    private long numeroCuenta = (long)(Math.random()*100000+1);

    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    public CuentaCorriente(final CuentaCorriente c){
        nombreTitular = c.nombreTitular;
        saldo = c.saldo;
        numeroCuenta = c.numeroCuenta;
    }

    public void setIngresos(double a) {
        saldo = a + saldo;
    }
    public double setReintegros (double a){
        saldo = saldo - a;
        return saldo;
    }
    /*Getter --> permite obtener saldo y datos generales */
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Nombre del Titular = " + nombreTitular + '\'' +
                ", Numero de la Cuenta = " + numeroCuenta;
    }

    public void Transferencias(CuentaCorriente c, double monto) {
        setReintegros(monto);
        c.setIngresos(monto);
    }
}