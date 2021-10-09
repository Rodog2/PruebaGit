
package Ejercicio6;


public class Cafetera {
    
//    Desarrolle una clase Cafetera con los atributos
//capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
//cantidadActual (la cantidad actual de café que hay en la cafetera)
    
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera(){
        
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
    
//    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima. 
    
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
//    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza
    
    public void servirTaza(int contenido){
        int resto= 0;
        if ((cantidadActual-contenido)<=0){
            resto = cantidadActual;
            cantidadActual=0;
            System.out.println("La tasa de capacidad "+contenido+" litros, se ha llenado hasta "+resto);
        } else cantidadActual = cantidadActual - contenido;
        System.out.println("La tasa ha sido llenada");
         
        System.out.println("La cantidad Actual de la cafetera es "+cantidadActual+ " litros");
    }
//    
//    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
  
    public void vaciarCafetera(){
        this.cantidadActual = 0;
        System.out.println("La cafetera se encuentra vacia");
    }
//    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
    
    public void agregarCafe(int cantidad){
       if ((cantidadActual+cantidad)>capacidadMaxima){
           cantidadActual = capacidadMaxima;
           System.out.println("La cafetera se encuentra llena con "+cantidadActual+ " litros");
       } else {cantidadActual = cantidadActual + cantidad;
        System.out.println("La cafetera se encuentra con "+cantidadActual+ " litros");}
    }
    
    
}
