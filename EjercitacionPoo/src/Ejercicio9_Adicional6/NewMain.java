/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9_Adicional6;

/**
 *
 * @author rodri
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioAuto servicio = new ServicioAuto();
        
        Auto A = servicio.cargarDatos();
        
        
        
       
        
        System.out.println(A.toString());
        
    }
    
}
