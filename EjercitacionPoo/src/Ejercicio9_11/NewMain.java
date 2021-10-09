/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date(); 
Si necesiten acá tienen más información en clase Date: Documentación Oracle
 */
package Ejercicio9_11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class NewMain {

   
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in).useDelimiter("\n");
       // El simple dat format es para que salga por pantalla la fecha simplificada 
        SimpleDateFormat parseador = new SimpleDateFormat("dd-MM-yy");
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
        
       int day, month, year;
       
        System.out.println("Ingrese el año");
        year= 116;
       //sc.nextLine();
        System.out.println("Ingrese el mes");
        month= 2;
       //  sc.nextLine();
        System.out.println("Ingrese el dia");
        day = 20;

       
        Date fecha = new Date(year,month,day);
        
        System.out.println(fecha);
        
        Date fechaActual= new Date();
        
        System.out.println("Los años de diferencia entre la fecha actual y la fecha ingresada es :"+(fechaActual.getYear()-fecha.getYear()));
        
        System.out.println(formateador.format(fechaActual));
        System.out.println(parseador.format(fechaActual));
        
        
        
        
        

    }
    
}
