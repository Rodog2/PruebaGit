/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package Ejercicio9;

import java.text.DecimalFormat;


public class Main_Ej9 {

    public static void main(String[] args) {
   
        DecimalFormat df= new DecimalFormat("#.00");
        Matematicas Op = new Matematicas();
        
        double num1 = (Math.random()*10+1);
        double num2 = (Math.random()*10+1);
        
        Op.setNum1(num1);
        System.out.println("El número 1 es: "+df.format(Op.getNum1()));
        Op.setNum2(num2);
        System.out.println("El número 2 es: "+ df.format(Op.getNum2()));
        
        // Llamamos al metodo devolver mayor para saber cual es mayor
        System.out.println("El mayor número de los dos es: "+df.format(Op.devolverMayor()));
        
        //Llamamos al metodo de las potencias
        System.out.println("La potencia del mayor valor y el menor valor es: "+Op.calcularPotencia());
       
        //Llamamos al metodo para calcular la raiz cuadrada
        System.out.println("La raiz cuadrada del menor valor es: "+ df.format(Op.calcularRaiz()));
    }
    
}
