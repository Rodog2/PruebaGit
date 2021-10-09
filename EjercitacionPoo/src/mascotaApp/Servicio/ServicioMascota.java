
package mascotaApp.Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import mascotaApp.Entidades.Mascota;

public class ServicioMascota {
    
     private Scanner sc; 
    private ArrayList<Mascota> mascotas;
    
    
    public ServicioMascota(){
        this.mascotas = new ArrayList();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Mascota crearMascota(){
       
        System.out.println("Ingrese el nombre de la mascota");
        String nombre = sc.next();
        
        System.out.println("Ingrese el apodo de la mascota");
        String apodo = sc.next();
        
         System.out.println("Ingrese el tipo de la mascota");
        String tipo = sc.next();
        
//         System.out.println("Ingrese el color de la mascota");
//        String color = sc.next();
//        
//         System.out.println("Ingrese la edad de la mascota");
//        int edad  = sc.nextInt();
//        
//        System.out.println("Tiene cola?? Si o No");
//        Boolean cola = true;
//        
//         System.out.println("Ingrese la raza de la mascota");
//        String raza = sc.next();

        
        return new Mascota(nombre,apodo,tipo);
    }
    
    public void agregarMascota(Mascota m){
        this.mascotas.add(m);
    }
    
    public void mostrarArrayMascotas(){
        
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println(this.mascotas.size());
    }    
    /**
     * 
     * @param cantidad es la cantidad de mascotas a crear
     */
    public void fabricaMascotas(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            agregarMascota(crearMascota());
            
        }
    }
    
    public void actualizarApodo(int index){
        try {
         Mascota m = mascotas.get(index);
        System.out.println("Ingrese el nuevo apodo");
        String apodo= sc.nextLine();
       m.setApodo(apodo);
        } catch (Exception e) {
            System.out.println("Los datos ingresados no son validos");
        }
    }
    /**
     * 
     * @param Este método es para actualizar la mascota de la posición "index"
     */
     public void actualizarMascota(int index){
         
         Mascota m= crearMascota();
         this.mascotas.set(index, m);
         
        }
    
     public void removerMascota(int index){
         
         if (index <= mascotas.size()){
             mascotas.remove(index);
         }else System.out.println("El indice ingresado no es correcto");
         
     }
    
}
