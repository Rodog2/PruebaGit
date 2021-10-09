
package mascotaApp;

;

import java.time.LocalDate;
import mascotaApp.Comparadores.Comparadores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import mascotaApp.Entidades.Mascota;
import mascotaApp.Entidades.Usuario;
import mascotaApp.Enum.RazaPerruna;
import mascotaApp.Enum.SexoHumano;
import mascotaApp.Servicio.ServicioMascota;
import java.time.LocalDate;
import mascotaApp.Comparadores.Comparadores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import mascotaApp.Entidades.Mascota;
import mascotaApp.Entidades.Usuario;
import mascotaApp.Enum.SexoHumano;
import mascotaApp.Servicio.ServicioMascota;

public class MascotaApp {

  
    public static void main(String[] args) {
        
//        ServicioMascota sm = new ServicioMascota();
//        
//    sm.fabricaMascotas(2);
//     
//    sm.mostrarArrayMascotas();
//
//    sm.actualizarApodo(4);



//    ArrayList<Mascota> ArrayMascotas = new ArrayList();
//    
//    
//    ArrayMascotas.add(new Mascota("Chiquito","Chiqui","Beagle"));
//    ArrayMascotas.add(new Mascota("Olivia","Oli","Caniche"));
//        for (Mascota aux: ArrayMascotas) {
//            System.out.println(aux);
//        }
//        
//     Collections.sort(ArrayMascotas, Comparadores.ordenarPorApodoDescend);
//     
//        
//        for (Mascota aux : ArrayMascotas) {
//            System.out.println(aux);
//        }
//        
        
//        TreeSet <Mascota> setMascota = new TreeSet(Comparadores.ordenarPorApodoDescend);
//        
//        setMascota.add(new Mascota("Olivia","Oli","Caniche"));
//        setMascota.add(new Mascota("Camila","Cami","Cruza"));
//        setMascota.add(new Mascota("Chiquito","Chiqui","Beagle"));
//        setMascota.add(new Mascota("Issis","Issis","Ovejero"));
//        
//        for (Mascota aux : setMascota) {
//            System.out.println(aux);
//        }
//        String razaImput= "BEAGLE";
//        
//        for (RazaPerruna aux : RazaPerruna.values()) {
//            if (aux.toString().equals(razaImput))
//            System.out.println("La raza Imput es igual a la raza enum: "+ aux);
//        }

        Usuario u1 = new Usuario("Rodrigo","Castillo",35143893,LocalDate.of(1990,4,21),"Argentina",SexoHumano.HOMBRE);

        System.out.println(u1.toString());
            
        Mascota m1 = new Mascota();
        
    }
}
 
        
        
    

