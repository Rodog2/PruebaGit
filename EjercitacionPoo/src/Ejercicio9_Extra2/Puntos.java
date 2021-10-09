
package Ejercicio9_Extra2;

import java.util.Scanner;


public class Puntos {
    
     Scanner sc= new Scanner(System.in).useDelimiter("\n");
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Puntos(){    
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
  public void crearPuntos(){
      System.out.println("Ingrese la coordenada x del primer punto");
      this.x1= sc.nextInt();
      System.out.println("Ingrese la coordenada y del primer punto");
  
      this.y1= sc.nextInt();
      
      System.out.println("Ingrese la coordenada x del segundo punto");
    
      this.x2= sc.nextInt();
      
      System.out.println("Ingrese la coordenada y del segundo punto");
  
      this.y2= sc.nextInt();
      
      
  }
  
  public double calcularDistancia(){
      // Raiz cuadrada de ((X2- X1)^2 - (Y2 - Y1)^2)
      // sqrt ( double a)

      double resultado;
      resultado = Math.sqrt((double)(((x2-x1)*(x2-x1))-((y2-y1)*(y2-y1))));
   
      return resultado;
  }
    
    
}
