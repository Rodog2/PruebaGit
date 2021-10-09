
package Ejercicio9_Adicional6;
import java.time.LocalDate;
import java.util.Scanner;

public class ServicioAuto {
    
   
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    
    public Auto cargarDatos(){
        
//         private String nombre;
//    private Date fecha;
//    private String color;
//    private String modelo;
        System.out.println("Ingrese el nombre");
        String nombre= (sc.nextLine());
        System.out.println("Ingrese la fecha de vencimiento del carnet");
      int dia= sc.nextInt();
      sc.reset();
      int mes= sc.nextInt();
      sc.reset();
      int anio=sc.nextInt();
        LocalDate fecha= (LocalDate.of(anio,mes,dia));
        sc.nextLine();
        System.out.println("Ingrese el color del auto");
        String color = (sc.nextLine());
        System.out.println("Ingrese el modelo del vehículo");
        String modelo = (sc.nextLine()); 
        return new Auto(nombre,fecha,color,modelo);
    }
    
    
    public void mostrarDatos(Auto A){
        
        
    }
    
    
    
    
}


