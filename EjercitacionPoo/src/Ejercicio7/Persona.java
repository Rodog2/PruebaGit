
package Ejercicio7;

import java.util.Scanner;

public class Persona {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
//     s atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura
     
     private String nombre;
     private int edad;
     private String sexo;
     private double peso;
     private double altura;
     
     public Persona(){
         
     }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Scanner getSc() {
        return sc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void mostrarPersona(){
        System.out.println("El nombre de la persona es "+nombre);
        System.out.println("LA edad de la persona es: "+ edad);
        System.out.println("El sexo de la persona es: "+ sexo);
        System.out.println("El peso de la persona es: "+peso);
        System.out.println("La altura de la persona es: "+ altura);
    }

//    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
//función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//(incluidos), significa que el peso está por debajo de su peso ideal y la función
//devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
//significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
//hacer uso de constantes para devolver estos valores. 
    private final int Peso_ideal= 0;
    private final int Sobrepeso = 1;
    private final int Menor_peso_ideal = -1;
    
    public int calcularIMC(){
        double IMC= peso*10000 /(altura*altura);
        System.out.println(IMC);
        int resultado=0;
        if (IMC<20){
            resultado = Menor_peso_ideal;
        } else if(IMC>=20 && IMC<=25){
            resultado= Peso_ideal;
        }else if(IMC>25){
        resultado= Sobrepeso;            
        }
        return resultado;
    }
//    
//    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano
    
    public boolean esMayorDeEdad() throws PersonaException{
       
        
        boolean resultado;
        if (edad >=18){
            resultado= true;
        } else resultado = false;
        return resultado;
    }
    
}
