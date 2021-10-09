
package Ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el valor de la base del rectangulo");
        int base = sc.nextInt();
        
        
        System.out.println("Ingrese el valor de la altura del rectángulo");
        sc.nextLine();
        int altura = sc.nextInt();
        
        Metodo_Ej4 rect = new Metodo_Ej4(base,altura);
        
      //  rect.crearRectangulo(base,altura);
        
        System.out.println("La altura del rectángulo es "+rect.getAltura());
        System.out.println("La base del rectángulo es "+rect.getBase());
        
        // Podemos setear la altura y a base en cualquier momento con .set y nos cambia
//        rect.setAltura(20);
//        rect.setBase(20);
//        
//        System.out.println("La altura del rectángulo es "+rect.getAltura());
//        System.out.println("La base del rectángulo es "+rect.getBase());
        
        rect.calculoSuperficie();
        
        rect.calculoPerimetro();
        
        System.out.println("La superficie del rectángulo es: "+rect.calculoSuperficie());
        System.out.println("El perímetro del rectángulo es: "+rect.calculoPerimetro());
        // Llamamos al método para dibujar el rectángulo
        rect.dibujarRectangulo();
        
        
    }
    
}
