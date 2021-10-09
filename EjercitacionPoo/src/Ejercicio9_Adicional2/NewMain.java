
package Ejercicio9_Adicional2;

import java.util.Date;
import java.util.GregorianCalendar;


public class NewMain {

    
    public static void main(String[] args) {
        
        
      ServicioTiempo servicio = new ServicioTiempo();
      
        Tiempo dia1 = new Tiempo(23,59,20);
        
        System.out.println(dia1.mostrarHora());
        
      // Dos formas de crear el objeto
      
//        Tiempo cronometro2 = new Tiempo();
//       
//       servicio.crearTiempo(cronometro2);
//       
//        System.out.println(cronometro2.mostrarHora());
       
//       Tiempo cronometro1 = servicio.crearTiempo();
//        
//        System.out.println(cronometro1.mostrarHora());
        
servicio.cronometro(dia1);


    }
    
}
