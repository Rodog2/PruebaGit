
package mascotaApp.Comparadores;

import java.util.Comparator;
import mascotaApp.Entidades.Mascota;


public class Comparadores {
    
     public static Comparator<Mascota> ordenarPorDescend = new Comparator<Mascota>() {
         @Override
         public int compare(Mascota t, Mascota t1) {
         return t1.getNombre().compareTo(t.getNombre());
         }
     };
     
     
     public static Comparator<Mascota> ordenarPorApodoDescend = new Comparator<Mascota>() {
         @Override
         public int compare(Mascota t, Mascota t1) {
         return t1.getApodo().compareTo(t.getApodo());
         }
     };
     
}
