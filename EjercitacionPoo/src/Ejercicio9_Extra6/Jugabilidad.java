
package Ejercicio9_Extra6;

import java.util.Arrays;
import java.util.Scanner;


public class Jugabilidad {
   
    
//    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
//el valor que ingresó el usuario y encontradas en 0
     Scanner sc= new Scanner(System.in).useDelimiter("\n");
     
     
    public void crearJuego(Ahorcado A){
        System.out.println("Ingrese una palabra para guardar en el ahorcado");
//        String palabra = sc.nextLine(); 
        String palabra = "parsimonia";
        // Pasamos la palabra a minusculas para guardarla en el set
        palabra = palabra.toLowerCase();
        A.setPalabra(palabra);
        System.out.println("Ingrese la cantidad de oportunidades que tendrá el jugador");
//        A.setOportunidades(sc.nextInt());
         A.setOportunidades(5);
        // Seteamos la cantidad de letras con la longitud de la palabra
        A.setCantLetras(A.getPalabra().length());
        // Creamos un nuevo vector que va a contener cada letra de la palabra
        String vector [] = new String[A.getPalabra().length()];
        for (int i=0; i<A.getCantLetras();i++){
            vector[i]= A.getPalabra().substring(i,(i+1));
        }
//          for (int i=0; i<A.getCantLetras();i++){
//              System.out.print("[ "+vector[i]+" ]");
//        }
          System.out.println("");
          // El vector que acabamos de crear lo setemos en el atributo vector del objeto Ahorcado
        A.setVector(vector);
        // Inicializamos el atributo encontradas en 0
        A.setEncontradas(0);
        
        // Creamos un nuevo vector1 y lo inicializamos en "__" para pasarlo al vetor prueba
        String [] vector1 = new String [A.getCantLetras()];
        for (int i=0;i<A.getCantLetras();i++){
            vector1[i]= "__";
        }
        A.setPrueba(vector1);
    }
    
//    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    
    public int longitud(Ahorcado A){
        int longitud= A.getVector().length;
       return longitud;   
    }
    
//    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    
    public void buscar(String letra,Ahorcado A){
        int contIgualdad=0;
        for (int i=0;i<A.getCantLetras();i++){
            if (letra.equals(A.getVectorEspecifico(i))){
            contIgualdad += +1;    
            }
        }
        
        if (contIgualdad >0){
            System.out.println("La letra ingresada es parte de la palabra");
        } else
            System.out.println("La letra ingresada no es parte de la palabra");
        
    }
    
//    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
    
    public void encontradas(String letra, Ahorcado A, int cont){
      // Inicializamos la variable rdo en falso, porque damos por hecho que no está la letra ingresada en la palabra
//        boolean rdo= false;        
        // Creamos contIgualdad que suma 1 cada vez que la letra está en la palabra
        // contTotal es la cantidad de letras de la palabra
        // ContFaltante, es igual a contTotal- contIgualdad. Son las letras que me faltan
        int contIgualdad=0, contTotal=A.getCantLetras(), contFaltante= 0;
        
        for (int i=0; i<A.getCantLetras();i++){
            
            if (letra.equals(A.getVectorEspecifico(i))){
                contIgualdad += +1;
            }
        }
        contFaltante= contTotal-contIgualdad;
        // Seteamos el atributo encontradas igual a encontradas + cont Igualdad, para saber cuantas encontramos
        // Y que el valor de las encontradas se vaya guardando y sumando con cada vuelta.
        A.setEncontradas(A.getEncontradas()+contIgualdad);
        if (contIgualdad>0){
//            rdo=true;
            // Si no se cumple la condición, quiere decir que si la letra no está en la palabra.
            // SE le resta uno a la oportunidad y se guarda el nuevo valor.
            // Por eso se usa set, para asignarle le nuevo valor.
        } else A.setOportunidades(A.getOportunidades()-1);
         
         // Este bucle es específico para mostrar que letras se van encontrando
         
//        System.out.println("");
//        for (int i=0;i<A.getCantLetras();i++){
//            if (letra.equals((A.getVectorEspecifico(i)))){
//                A.setEspecificoPrueba(i, letra);
//            }
//            System.out.print(A.getPrueba()[i]+"  ");
//            }
//        
//        System.out.println("");
//        System.out.println("");
// Ya no lo uso esto porque creé el método de mostrar el vector prueba
        
        
//        return rdo;
    }
    // Método paa mostrar el vector prueba
    public void mostrarVectorPrueba(Ahorcado A, String letra){
          System.out.println("");
        for (int i=0;i<A.getCantLetras();i++){
            if (letra.equals((A.getVectorEspecifico(i)))){
                A.setEspecificoPrueba(i, letra);
            }
            System.out.print(A.getPrueba()[i]+"  ");
            }
        
        System.out.println("");
        System.out.println("");
    }
    
//    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    
    public void intentos(Ahorcado A){
        System.out.println("Las oportunidades restantes son: "+ A.getOportunidades());
    }

    
}
