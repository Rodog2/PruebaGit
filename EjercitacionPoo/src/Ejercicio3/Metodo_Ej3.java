
package Ejercicio3;

import java.util.Scanner;


public class Metodo_Ej3 {
    
    private int numero1;
    private int numero2;

  private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Metodo_Ej3(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
 
    
    public Metodo_Ej3(){
        
        
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = sc.nextInt();
    }
    
    public int sumar(){
        int suma = numero1 + numero2;
        return suma;
    }
    
   public int restar(){
        int resta = numero1 - numero2;
        return resta;
    }
   
    public double multiplicar() {

        if (numero1 != 0 && numero2 != 0) {
            double resultado = (double) numero1 * numero2;

            return resultado;
        } else {
            System.out.println("Los numeros ingresados no deben ser cero");
        }
        return 0;
    }
    
    
    public double dividir(){
        
       if (numero2 ==0){
           System.out.println("El divisor no puede ser 0");
           return 0;
       }else {
            double resultado = (double)numero1 / numero2;
        return resultado;
       }
       
    }



}
           
           
   
   

