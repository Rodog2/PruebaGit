
package Ejercicio6;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in).useDelimiter("\n");
         
        ServicioCafetera serv = new ServicioCafetera();
//        
//        Cafetera1 cafetera = serv.crearCafetera();
        
//        System.out.println(cafetera.toString());
//        
//        serv.llenarCafetera(cafetera);
//        
//         System.out.println(cafetera.toString());
//         
//         System.out.println("Ingrese el tamaño de la casa");
//         int tamanio= sc.nextInt();
//         sc.nextLine();
//         
//         serv.servirTaza(tamanio, cafetera);
//         
//         System.out.println(cafetera.toString());
//         
//         
//         serv.vaciarCafetera(cafetera);
//          System.out.println(cafetera.toString());
//        
//          serv.llenarCafetera(cafetera);
//          System.out.println(cafetera.toString());
     
//          System.out.println("Ingrese una cantidad de litros para agregar a la cafetera");
//          int litrosParaLlenar = sc.nextInt();
//          serv.agregarCafe(litrosParaLlenar, cafetera);
//          System.out.println(cafetera.toString());
          
          
         
          
          
          System.out.println(serv.sumar(10, 20));
          
//          serv.menu(cafetera);
         
          System.out.println("El numero 1 es mayor al 2?"+ serv.esMayor(10,5));
    }

}
