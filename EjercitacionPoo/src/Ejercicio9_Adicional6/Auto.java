
package Ejercicio9_Adicional6;

import java.time.LocalDate;
import java.util.Date;


public class Auto {
    
    private String nombre;
    private LocalDate fecha;
    private String color;
    private String modelo;
    private int KM;
    
    
    public Auto(){
        
    }

    public Auto(String nombre, LocalDate fecha, String color, String modelo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.color = color;
        this.modelo = modelo;
        this.KM = 7500;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKM() {
        return KM;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + nombre + ", fecha=" + fecha + ", color=" + color + ", modelo=" + modelo + ", KM=" + KM + '}';
    }
    
    
    
}
