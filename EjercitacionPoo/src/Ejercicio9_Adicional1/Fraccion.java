
package Ejercicio9_Adicional1;


public class Fraccion {
    
    private int denominador;
    private int numerador;
    
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }
    
    public String mostrarFraccion(){
        
       if (this.numerador >=0){
           return    "\n  "+      
                this.numerador+ "\n"+
                "----- \n  " + 
                + this.denominador;
       } else  { return    "\n "+      
                this.numerador+ "\n"+
                "----- \n  " + 
                + this.denominador;}
    }
    
}
