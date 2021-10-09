
package Ejercicio9_Adicional2;

import java.util.Scanner;


public class Tiempo {
 
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private int hora;
    private int minutos;
    private int segundos;
    
    
    public Tiempo(){
        
    }
   
    public Tiempo(int hora, int minutos, int segundos){
        
        this.hora = hora;
        this.minutos = minutos;
        this.segundos=segundos;
    }

    public int gethora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHora(int dia) {
        this.hora = dia;
    }

    public void setMinutos(int mes) {
        this.minutos = mes;
    }

    public void setSegundos(int anio) {
        this.segundos = anio;
    }
    
    public String mostrarHora(){
        return "La hora es: "+hora+" horas, "+minutos+" minutos, "+segundos+" segundos";
        
        
    }
    
    
}
