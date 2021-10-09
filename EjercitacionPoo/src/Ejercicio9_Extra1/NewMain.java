/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Ejercicio9_Extra1;

public class NewMain {
  
    public static void main(String[] args) {
       
        Cancion A1 = new Cancion("Lo mejor", "Rodrigo Castillo");
        
        System.out.println(A1.toString());
        
    }
    
}
