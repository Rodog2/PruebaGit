//Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
//operar. Crear los métodos correspondientes a la clase Entidad.
//Crear un arreglo con 4 objetos de la clase
//Crear los siguientes métodos:
// Calcular área
// Calcular perímetro
// Mostrar los datos del triángulo que tenga el área de mayor superficie

package Ejercicio9_Adicional5;

import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ServiceTriangulo servicio= new ServiceTriangulo();
       
        Triangulo [] arrayT = new Triangulo[4];

        
        for (int i = 0; i < arrayT.length; i++) {
            
            arrayT[i] = new Triangulo(sc.nextInt(),sc.nextInt());
            
        }
        
        for (Triangulo a : arrayT) {
            System.out.println(a.toString());
        }
        Triangulo t1= arrayT[0];
        Triangulo t2= arrayT[1];
        Triangulo t3= arrayT[2];
        Triangulo t4= arrayT[3];
        
        System.out.println(t4.toString());
        
        servicio.calcularArea(arrayT);
        
        System.out.println("El triangulo con mayr area es: "+ servicio.mostrarTrianguloMasArea(arrayT));
        
    }
    
    
}
