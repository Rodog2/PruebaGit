package mascotaApp.Entidades;

import mascotaApp.Enum.RazaPerruna;
import mascotaApp.Enum.SexoAnimal;
import mascotaApp.Interface.AccionMascota;

public class Mascota <T> implements AccionMascota {

    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private T raza;
    private SexoAnimal sexo;
   

    public Mascota(){
        
        
    }

    public Mascota(String nombre, String apodo, String tipo){
        this.nombre=nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, T raza, SexoAnimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.sexo = sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public T getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", sexo="+sexo+ '}';
    }

    @Override
    public int molestarDuenio() {
      return 10;
        
    }
    
    
    
}
