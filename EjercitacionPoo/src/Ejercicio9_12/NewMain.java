/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos: 
Ejemplo Date como atributo: DateAtributo
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.21
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro 
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
 */
package Ejercicio9_12;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class NewMain {

  
    public static void main(String[] args) throws ParseException {
       Scanner sc= new Scanner(System.in).useDelimiter("\n");
       
       // Para pasar los valores desde el mail, creamos la variable Nombre y la variable fecha.
//        System.out.println("Ingrese el nombre");
//        String nombre = sc.nextLine();
//        
//// Este código crea una variable fecha con el formato "xxxx-xx-xx" y se le puede asignar
//        // A la clase fecha directamente
//        
//        System.out.println("Ingrese la fecha de nacimiento. Ejemplo: 1990-12-12");
//        String fecha1 = sc.nextLine();
//        
//        java.sql.Date fecha=java.sql.Date.valueOf(fecha1);
//        
//         Persona P1 = new Persona(nombre,fecha);
//        
//         System.out.println(P1.toString());

Persona P1 = new Persona();

P1.crearPersona();

        System.out.println(P1.toString());

        System.out.println("La edad de la persona es: "+P1.calcularEdad());
    
        System.out.println("Ingresa una edad para comparar con la persona");
        int edad = sc.nextInt();
        System.out.println("La edad de la persona ingresada es menor que la guardada? "+P1.menorQue(edad));
        
        P1.mostrarPersona();
        
        
    }
    
}


// Para convertir un String a Fecha !!!!! 

////Añadir estas importaciones
//import java.text.SimpleDateFormat;  
//import java.util.Date; 
//
//Scanner leer = new Scanner(System.in);
//String fecha;
//try {
//   System.out.println("Ingresa un fecha con el formato (año-mes-dia)")
//   fecha = leer.nextLine(); //El usuario ingresa la fecha a parsear
//   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); //Formato de conversión
//   Date fechaConvertida = format.parse(fecha); //Se parsea la fecha
//   System.out.println("La fecha convertida es: "+fechaConvertida);
//} catch (Exception e) {
//   System.err.println("No se ha podido convertir la fecha");
//}