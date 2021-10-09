
package Ejercicio3;


public class Main_Ej3 {

  
    public static void main(String[] args) {
       
        Metodo_Ej3 Primero = new Metodo_Ej3();
//        
//        Primero.crearOperacion();

//Metodo_Ej3 Primero = new Metodo_Ej3(10,30);

Primero.setNumero1(10);
Primero.setNumero2(50);
        
        System.out.println("La suma de los numeros da: "+ Primero.sumar());
        System.out.println("La resta de los numeros da: "+ Primero.restar());
        System.out.println("La multiplicacion de los numeros da: "+ Primero.multiplicar());
        System.out.println("La division de los numeros da: "+ Primero.dividir());
        
        
        
    }
    
}
