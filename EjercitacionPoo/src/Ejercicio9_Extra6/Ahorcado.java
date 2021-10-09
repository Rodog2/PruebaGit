/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9_Extra6;

import java.util.Arrays;

/**
 *
 * @author rodri
 */
public class Ahorcado {
    
    private String palabra;
    private String [] vector;
    private int cantLetras;
    private int oportunidades;
    private int encontradas;
    // El vector prueba es el vector que se inicializa en "__" para mostrar toda la palabra
    // de incógnita. A medida que se descubra cada letra, se irá descubriendo la palabra
    private String [] prueba; 
    public Ahorcado(){
        
    }

    public Ahorcado(String palabra, int oportunidades) {
        this.vector = new String[palabra.length()];
        for (int i=0; i<palabra.length();i++){
            this.vector[i]= palabra.substring(i,(i+1));
        }
          for (int i=0; i<palabra.length();i++){
              System.out.println("[ "+vector[i]+" ]");;
        }
        this.cantLetras = palabra.length();
        this.oportunidades = oportunidades;
        this.encontradas = 0;
        // Acá creamos el vector prueba con length igual a la palabra 
        this.prueba= new String [palabra.length()];        
    }
// Seteamos el vector de prueba con todos lugares ___, para que me muestre la palabra vacia sin descubrir
    public void setPrueba(String[] vector) {
        this.prueba = vector;
    }
    // este set es para ir cambiando el vector cada vez que se descubre una letra 
    public void setEspecificoPrueba(int i, String letra){
        this.prueba[i] =  letra;
    }
    
    public String [] getPrueba(){
        return prueba;
    }
    // Este get es para obtener una ubicación específica del vector prueba.
     public String getPruebaEspecifico (int i){
        return prueba[i];
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    // A este Set solamente le podemos pasar un vector y lo asigna al vector atributo
    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public String[] getVector() {
        
        return vector;
    }
    
    // Get para obtener una ubicación específica del vector que contiene la palabra
    public String getVectorEspecifico (int i){
        return vector[i];
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getEncontradas() {
        return encontradas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", vector=" + vector + ", cantLetras=" + cantLetras + ", oportunidades=" + oportunidades + ", encontradas=" + encontradas + '}';
    }
     
    
    
}
