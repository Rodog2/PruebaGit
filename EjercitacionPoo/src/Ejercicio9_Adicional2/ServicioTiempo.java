
package Ejercicio9_Adicional2;

import java.util.Scanner;


public class ServicioTiempo {
   
      Scanner sc = new Scanner(System.in).useDelimiter("\n");
   
      
      public void crearTiempo(Tiempo t1){
        System.out.println("Ingrese la hora:");
         t1.setHora(sc.nextInt());
        sc.reset();
        System.out.println("Ingrese los minutos");
        t1.setMinutos(sc.nextInt());
        sc.reset();
        System.out.println("Ingrese los segundos:");
        t1.setSegundos(sc.nextInt());
        
    }
      
       public Tiempo crearTiempo(){
        System.out.println("Ingrese la hora:");
         int hora = (sc.nextInt());
        sc.reset();
        System.out.println("Ingrese los minutos");
        int minutos= (sc.nextInt());
        sc.reset();
        System.out.println("Ingrese los segundos:");
        int segundos = (sc.nextInt());
        
        return new Tiempo(hora,minutos,segundos);
    }
    
    public void cronometro(Tiempo t1){
        
        int h=t1.gethora(), m=t1.getMinutos(), s=t1.getSegundos();
        
        do {
            System.out.println(h+": "+m+": "+s);
             try {
                Thread.sleep(1000);
            } catch (Exception e) {
// Mensaje en caso de que falle
            }
             if (s<60){
                 s= s+ 1;
             } else {
                 s = 0;
                 if(m <59){
                 m = m + 1;    
                 } else{
                     m = 0;
                     if (h<23){
                         h = h + 1;
                     } else h= 0;
                 }
             }
        } while (h != 0);
       

        
        
    }
}
