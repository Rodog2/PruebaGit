
package Ejercicio6;


public class Cafetera1 {

    private Integer capacMaxima;
    private Integer capacActual;
    
    public Cafetera1(){
    }
    
    
    public Cafetera1(int capActual, int capMaxima){
        this.capacActual=  capActual;
        this.capacMaxima = capMaxima;
    }

    public Integer getCapacMaxima() {
        return capacMaxima;
    }

    public void setCapacMaxima(Integer capacMaxima) {
        this.capacMaxima = capacMaxima;
    }

    public Integer getCapacActual() {
        return capacActual;
    }

    public void setCapacActual(Integer capacActual) {
        this.capacActual = capacActual;
    }

    @Override
    public String toString() {
        return "Cafetera1{" + "capacMaxima=" + capacMaxima + ", capacActual=" + capacActual + '}';
    }
    
    
    
    
}
