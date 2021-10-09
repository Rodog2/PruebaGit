
package Ejercicio8;

import java.util.Scanner;

public class Main_Ej8 {

 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Cadena F = new Cadena();
        
        System.out.println("Ingrese una palabra o frase cualquiera");
        String frase = "Hola como estas";
        frase = frase.toLowerCase();
        
        F.setFrase(frase);
        // Mostramos la frase
        System.out.println(F.getFrase());
        // Mostramos la longitud de la frase
        System.out.println(F.getLongitud());
        // Llamamos al método para mostrar vocales
//        System.out.println("La frase ["+frase+"], tiene "+F.mostrarVocales()+" vocales");
      // Llamamos al metodo para invertir la frase
//        System.out.println("La frase ingresada invertida es "+F.invertirFrase());
       
       // Llamamos al metodo para buscar una letra repetida
//        System.out.println("Ingrese una letra a buscar en la frase ingresada previamente");
//        String letra = sc.nextLine();
//        System.out.println("La letra ingresada se encuentra repetida "+F.vecesRepetido(letra)+" veces");
       
        // LLamamos al método para compar longitud de frases
//        System.out.println("Ingrese una frase cualquiera");
//        String nuevaFrase = sc.nextLine();
//        System.out.println("Las longitudes de las frases son iguales? "+ F.compararLongitud(nuevaFrase));
        
        //Llamamos a la función unirFrases
        
//        System.out.println("Ingrese una frase cualquiera para unir a la anterior frase");
//        String fraseAUnir = sc.nextLine();
//        System.out.println("Con las fraases unidas se obtiene "+F.unirFrases(fraseAUnir));
        
        
        // Llamamos a la función que reemplaza las "a" por el valor ingresado por el usuario 
//        System.out.println("Ingrese una letra, valor o caracter con el que quiera reemplazar las A");
//        String cambio = sc.nextLine();
//        System.out.println("La frase con los cambios realizados es "+F.reemplazar(cambio));


        // Llamamos al metodo que nos indica si la cadena contiene un determinado valor
        System.out.println("Ingrese un valor o caracter a buscar en la frase");
        String buscador= sc.nextLine();
        System.out.println("El caracter ingresado, se encuentra en la frase? "+ F.contiene(buscador));
        


        
        
        
        
        
        
        
        
    }
    
}
