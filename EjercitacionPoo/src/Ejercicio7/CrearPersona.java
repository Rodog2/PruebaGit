
package Ejercicio7;

import java.util.Scanner;


public class CrearPersona {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
 
     
     public Persona crearPersona(){
         
         System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.nextLine();
         System.out.println("Ingrese la edad de la persona");
        int edad = sc.nextInt();
        sc.nextLine();
         System.out.println("Ingrese el sexo de la persona. M, F u O");
         String sexo;
         do {
             sexo = sc.nextLine();
             if ((sexo.equals("M")==false) && (sexo.equals("F")==false) && (sexo.equals("O")==false)){
                 System.out.println("La opción elegida no es correcta");
             }
         } while ((sexo.equals("M")==false) && (sexo.equals("F")==false) && (sexo.equals("O")==false));
         
         System.out.println("Ingrese el peso de la persona");
        double peso = sc.nextDouble();
         System.out.println("Ingrese la altura de la persona");
        double altura = sc.nextDouble();  
        return new Persona(nombre,edad,sexo,peso,altura);
         
     }
    
}
