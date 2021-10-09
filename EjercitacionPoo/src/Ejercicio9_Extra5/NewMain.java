/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
package Ejercicio9_Extra5;

import java.util.Scanner;


public class NewMain {

   
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in).useDelimiter("\n");
        String mes[] = new String [12];
        
        mes[0] = "enero";
        mes[1] = "febrero";
        mes[2] = "marzo";
        mes[3] = "abril";
        mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
        mes[8] = "septiembre";
        mes[9] = "octubre";
        mes[10] = "noviembre";
        mes[11] = "diciembre";
        
        String mesSecreto = mes[2];
        String eleccion;
        do {
            System.out.println("Ingrese el nombre de un mes para acertar");

            do {
                eleccion = sc.nextLine();
                eleccion = eleccion.toLowerCase();
                if (eleccion.equals("enero") || eleccion.equals("febrero") || eleccion.equals("marzo") || eleccion.equals("abril") || eleccion.equals("mayo")
                        || eleccion.equals("junio") || eleccion.equals("julio") || eleccion.equals("agosto") || eleccion.equals("septiembre")
                        || eleccion.equals("octubre") || eleccion.equals("noviembre") || eleccion.equals("diciembre")) {
                    break;
                } else {
                    System.out.println("La opción ingresada no es correcta");
                
                }

            } while ((eleccion.equals("enero") == false || eleccion.equals("febrero") == false || eleccion.equals("marzo") == false || eleccion.equals("abril") == false || eleccion.equals("mayo") == false
                    || eleccion.equals("junio") == false || eleccion.equals("julio") == false || eleccion.equals("agosto") == false || eleccion.equals("septiembre") == false
                    || eleccion.equals("octubre") == false || eleccion.equals("noviembre") == false || eleccion.equals("diciembre") == false));

       
            System.out.println("Su elección fue: " + eleccion);
            if (eleccion.equals(mesSecreto)) {
                System.out.println("Usted ha acertado");
                break;
            } else {
                System.out.println("Usted NO ha acertado");
      
            }
            

        } while (eleccion.equals(mesSecreto) == false);


    }
    
  
    
}
