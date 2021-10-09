
package Ejercicio6;

import java.util.Scanner;
/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
18
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/

public class Nespresso {

  
    public static void main(String[] args) {
    
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
         
         // Creamos el objeto con el constructor vacio
         // Cafetera C = new Cafetera();
         
         // Llenamos el objeto con el constructor con parámetros
         Cafetera C = new Cafetera(20,10);
        // Llamamos al método para llenar la cafetera
         C.llenarCafetera();
         System.out.println("Capacidad de Cafetera: "+C.getCapacidadMaxima()+" litros");
         System.out.println("La cafetera se encuentra con "+C.getCantidadActual()+" litros");
         
         // Llamamos al método para servir una tasa
         System.out.println("Ingrese el tamaño de la tasa a servir");
         int tamanioTasa = sc.nextInt();
         C.servirTaza(tamanioTasa);
         
         //Llamamos al método vaciar cafetera
         
         C.vaciarCafetera();
         
         // Llamamos al metodo agregar cafe.
         
         System.out.println("Ingrese la cantidad de litros que quiere agregar a la cafetera");
         int agregar = sc.nextInt();
         C.agregarCafe(agregar);
         
    }
    
}
