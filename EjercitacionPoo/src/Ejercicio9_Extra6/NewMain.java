/*
 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Ejemplo vector como atributo: VectorAtributo
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
25
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades

 */
package Ejercicio9_Extra6;

import java.util.Arrays;
import java.util.Scanner;


public class NewMain {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
        
        
        // Creamos el objeto ahorcado
        Ahorcado A1 = new Ahorcado();
        //Creamos el servicio que contendrá los métodos de modificación
        Jugabilidad J1= new Jugabilidad();
        
        // Llamamos al método del servicio para introducir la palabra y las oportunidades del juego
        J1.crearJuego(A1);
        for (int i=0;i<20;i++){
        System.out.println("");
    }
        // Creamos un vector (letrasIngresadas) que va a ir guardando las letras ingresadas por el usuario, para verificar
        // que no se repitan
        String [] letrasIngresadas = new String [A1.getOportunidades()+A1.getCantLetras()];
        // El vector letrasIngresadas va a contener elementos igual a las letras de la palabra y a las oportunidades.
        // Porque son la cantidad total de elementos que puede ingresar el usuario antes de que termine el juego
        Arrays.fill(letrasIngresadas, "_");
        int contador=0, verificador = 0, cont=0;
       
        String letra;
         // Llamamos al método del servicio para saber la longitud de la palabra que ingresamos al ahorcado
            System.out.println("La cantidad de letras de la palabra ingresada es " + J1.longitud(A1));
            // Nos muestra las oportunidades totales que tiene el jugador
            System.out.println("Las oportunidades para encontrar son: " + A1.getOportunidades());
            //---------------------------------------------------------------------------------------
            String ingresadas="";
            
            J1.mostrarVectorPrueba(A1, "__");
            // Iniciamos el primer bucle do, que va a ser el que nos pida las letras a ir ingresando
            // Y nos vaya diciendo si está en la palabra ingresada o no y modifica todos los valores
        do {
            // ESte segundo bucle Do es para verificar que no se repita la letra ingresada por el usuario
            // El problema de que se repita es que el método va sumar 1 a el atributo encontrada si se repite
            // y eso no debería ser así.
            do{
// Pedimos ingresar una letra para saber si está en la palabra buscada
            System.out.println("Ingrese una letra para buscar en el ahorcado");
            letra = sc.nextLine();
            letra = letra.toLowerCase();
            //El verificador lo igualamos a 0 acá, para que con cada vuelta se vuelva 0 y no sea un bucle infinito
            // Si queda en un valor mayr a 0 no sale nunca del while
            verificador=0;
            // Creamos un bucle para saber si la letra ingresada está repetida o no. 
            // 
            for (int i=0;i< A1.getOportunidades()+A1.getCantLetras();i++){
                if (letrasIngresadas[i].equals(letra)){
                    System.out.println("No se puede ingresar la letra "+ letra+ " nuevamente");
                    verificador += +1;
            }}
            } while (verificador > 0 );
            
            System.out.println("Letras ingresadas hasta el momento");
            ingresadas = ingresadas + " / " + letra;
            System.out.println(ingresadas);
            // Si salió del bucle do, quiere decir que la letra no se repite, por lo tanto se asigna al vector letrasIngresadas
            // Utilizamos un contador para determinar la ubicción dentro del vector, para poder irlse sumando 1
            // y que pueda cambiar
            letrasIngresadas[contador] = letra;
            contador += +1;
            
            // Este método busca solamente me muestra un mensaje si la letra está en la palabra nada mas
            J1.buscar(letra, A1);
            
//Llamamos al metodo para ingresar una letra, buscarla y restar una oportunidad
//        System.out.println("Ingrese una letra para buscar en el ahorcado");
//        String letra1 = sc.nextLine();
//        letra1= letra1.toLowerCase();

// Le cambié el boolean del método encontradas para que no devuelva nada.
            J1.encontradas(letra, A1, cont);
            // Creamos un método para mostrar el vector de prueba
            J1.mostrarVectorPrueba(A1, letra);
//            System.out.println("Se ha encontrado una letra?: " + J1.encontradas(letra, A1, cont));
            System.out.println("------------------------------------------------------------------------");
            System.out.println("ENCONTRADAS: "+A1.getEncontradas()+ "//  OPORTUNIDADES RESTANTES: "+A1.getOportunidades());
            System.out.println("------------------------------------------------------------------------");
           
            // Llamamos al metodo del servicio que nos muestra las oportunidades restantes.
//            J1.intentos(A1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
// Mensaje en caso de que falle
            }
          
cont=1;
        } while (A1.getOportunidades() > 0 && (A1.getEncontradas() < A1.getCantLetras()));
        
        if (A1.getOportunidades()== 0){
            System.out.println("Lo siento, se le han terminado las oportunidades");
        }
        if (A1.getEncontradas()== A1.getCantLetras()){
            System.out.println("FELICITACIONES, HA ADIVINADO LA PALABRA");
        }
    }
    
}
