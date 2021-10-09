
package Ejercicio9_12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.time.Month;

public class Persona {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    
    Scanner sc= new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private int year;
    private int month;
    private int day;
    private Date fecha;
     
    
  
    Date fechaActual = new Date();

    public Persona(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void crearPersona() throws ParseException{
        System.out.println("Ingrese el nombre de la persona");
        this.nombre = sc.nextLine();
        
//        System.out.println("Ingrese el año de nacimiento");
//        this.year = sc.nextInt()-1900;
//        sc.nextLine();
//        System.out.println("Ingrese el mes de nacimiento");
//        month = sc.nextInt()-1;
//        sc.nextLine();
//        System.out.println("Ingrese el dia de nacimiento");
//        day = sc.nextInt();  
//        
//        Date fecha = new Date(year,month,day);
//        
//        this.fecha = fecha;
/// ---------------------------------------------------------------------------------------
// Este método es para ingresar una fecha con un formato especifico y lo adjunta a fecha

        System.out.println("Ingrese la fecha de nacimiento. dd/mm/yyyy");
        String fechaNacimiento = sc.nextLine();
       
      this.fecha = formato.parse(fechaNacimiento);
        // Esto es para imprimir la fecha en el formato creado de SimpleDateFormat
        
//        System.out.println(formato.format(fecha));
    }
    
    public int calcularEdad(){
       
     // Esta forma es para calcular la edad con if anidados
        
        int edad=0;
        edad = fechaActual.getYear() - fecha.getYear();
        int mes, dia;
        mes = fechaActual.getMonth() - fecha.getMonth();
        if (mes<0){
            edad = edad-1;
        } else if (mes>0){
            edad = edad;
        } else if (mes==0){
            dia = fechaActual.getDate()- fecha.getDate();
            if (dia<0){
                edad = edad -1;
            } else edad = edad;
        }
        return edad;
    }
    
    public boolean menorQue(int edad){
        
        boolean rdo;
        
        if (edad > calcularEdad()){
            rdo = false;
        } else rdo = true;
        
        return rdo;
    }
    
    public void mostrarPersona(){
        System.out.println("El nombre de la persona es: "+this.nombre);
        System.out.println("La fecha de nacimiento es: "+formato.format(fecha));
         
    }
    
      @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fecha=" + formato.format(fecha) + '}';
    }
    
    
    
}
