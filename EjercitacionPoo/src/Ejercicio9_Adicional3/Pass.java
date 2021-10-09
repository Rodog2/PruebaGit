
package Ejercicio9_Adicional3;


public class Pass {
    
    private String pass;
    private String nombre;
    private int DNI;
    
    public Pass(String pass, String nombre, int DNI){
        this.pass = pass;
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Pass{" + "pass=" + pass + ", nombre=" + nombre + ", DNI=" + DNI + '}';
    }
    
    
    
    
}
