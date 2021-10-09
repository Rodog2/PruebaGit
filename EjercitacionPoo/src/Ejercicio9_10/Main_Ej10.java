/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package Ejercicio9_10;

import java.util.Arrays;

public class Main_Ej10 {

   
    public static void main(String[] args) {
      
        
        double array1 [] = new double [50];
        double array2 []= new double [20];
        
        for (int i=0; i<50; i++){
            array1[i] = Math.floor(Math.random()*10*100)/100;   
        }
        
        System.out.println(Arrays.toString(array1));
        
        // Ordenamos el vector en orden ascendente
        Arrays.sort(array1);
        // Lo imprimimos por pantalla
        System.out.println(Arrays.toString(array1));
        
        // Función para copiar un array. La segunda parte es la nueva longitud del arreglo
        // Por eso primero copiamos los 20 primeros números, aunque solo necesitemos 10, para darle la longitud 20
        // Luego de eso, llenamos los últimos 10 numeros con 0.5 con la función fill
        array2= Arrays.copyOf(array1, 20);
        Arrays.fill(array2,10,20,0.5);
        
//        for (int i=0;i<10;i++){
//            array2[i]= array1[i];
//        }
        
        
        System.out.println(Arrays.toString(array2));
        
        
        
    }
    
 
    }
    

