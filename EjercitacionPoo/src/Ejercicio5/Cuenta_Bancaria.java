
package Ejercicio5;

import java.util.Scanner;


public class Cuenta_Bancaria {
    
//    numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual.
    private  Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;
    private double interes;

    public Cuenta_Bancaria() {
    }

    public Cuenta_Bancaria(int numeroCuenta, long DNI, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }
    
    public void crearCuenta(){
        System.out.println("Ingrese el número de cuenta");
        this.numeroCuenta = sc.nextInt();
        System.out.println("Ingrese el DNI del titular");
        this.DNI = sc.nextLong();
        System.out.println("Ingrese el saldo de la cuenta");
        this.saldoActual =sc.nextDouble();
        
    }
    
    
}
