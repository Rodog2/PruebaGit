
package Ejercicio5;

public class Cuenta_Servicio {

    
    
    public void ingresar(Cuenta_Bancaria C1, double ingreso){
    
        double saldoActual = C1.getSaldoActual() + ingreso;
        
        C1.setSaldoActual(saldoActual);
        
    }    
//    Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.

    public void retirar(Cuenta_Bancaria C1, double retiro) {
        if ((C1.getSaldoActual() - retiro) < 0) {
            System.out.println("Usted solo ha podido retirar " + C1.getSaldoActual());
            C1.setSaldoActual(0);
        } else {
            double saldoActual = C1.getSaldoActual() - retiro;
            C1.setSaldoActual(saldoActual);
        }
    }
    
//    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
    
    public void extraccionRapida(Cuenta_Bancaria C1){
        if ((C1.getSaldoActual()*0.8)<0){
            C1.setSaldoActual(0);
        } else {
            double saldoActual= C1.getSaldoActual() * 0.8;
            C1.setSaldoActual(saldoActual);
        }
    }
    
////     Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//    
    public void consultarSaldo(Cuenta_Bancaria C1){
        
        System.out.println("Su saldo actual es: "+ C1.getSaldoActual());
        
    }
//    
////    Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
//    
    public void consultarDatos(Cuenta_Bancaria C1){
        System.out.println("Numero de cuenta 1: "+C1.getNumeroCuenta());
        System.out.println("DNI titular cuenta 1: "+C1.getDNI());
        System.out.println("Saldo cuenta 1: "+ C1.getSaldoActual());
        
    }
    
    
}
