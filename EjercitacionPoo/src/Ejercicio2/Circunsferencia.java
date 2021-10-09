
package Ejercicio2;

import static java.lang.Math.PI;
import java.util.Scanner;


public class Circunsferencia {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private double Radio;

  

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }
    
    
    public double crearCircunsferencia(){
        this.Radio = sc.nextDouble();
       
        return Radio;
    }
    
    public double area(double Radio){
        
        double area = Math.PI * Radio * Radio;
        
        return area;
    }
    
    public double perimetro(double Radio){
        
        double perimetro = Math.PI * 2 * Radio;
        
        return perimetro;
        
    }
    
    
}
