
package Ejercicio9_Adicional1;


public class NewMain {


    public static void main(String[] args) {
      
        ServicioFaccion servicio = new ServicioFaccion();
        
        Fraccion f1 = new Fraccion(2,3);
        
        Fraccion f2= new Fraccion(12,7);
        
        System.out.println("Fracción 1: "+ f1.mostrarFraccion());
        System.out.println("Fracción 2: "+ f2.mostrarFraccion());
        
        Fraccion sumaFraccion = servicio.sumarFraccion(f1, f2);
        System.out.println("La suma de la fracción es: \n" +sumaFraccion.mostrarFraccion());
        System.out.println("");
        
        Fraccion f4= servicio.restarFraccion(f1, f2);
        System.out.println("La resta de las fraciones es: \n "+ f4.mostrarFraccion());
      System.out.println("");
        Fraccion f3 = servicio.multiplicarFraccion(f1, f2);
        
        System.out.println("La multiplicación de las fracciones es: \n "+ f3.mostrarFraccion());
        System.out.println("");
        Fraccion dividirFraccion = servicio.dividirFraccion(f1, f2);
        System.out.println("La division de las fracciones es: \n"+ dividirFraccion.mostrarFraccion());
        
    }
    
}
