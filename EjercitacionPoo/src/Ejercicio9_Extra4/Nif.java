
package Ejercicio9_Extra4;

import java.util.Scanner;


public class Nif {
     Scanner sc= new Scanner(System.in).useDelimiter("\n");
    private long DNI;
    private String letra;

    public Nif() {
    }

    public Nif(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }
    
    
    
}
