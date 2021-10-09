
package Ejercicio6;

import java.util.Scanner;


public class ServicioCafetera {

    Scanner sc= new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera1 crearCafetera(){
        
        System.out.println("Ingrese la capacidad maxima");
        int capMaxima= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la capacidad actual");
        int capActual= sc.nextInt();
        return new Cafetera1(capActual, capMaxima);    
    
    }
    public void llenarCafetera(Cafetera1 cafetera){
        
        cafetera.setCapacActual(cafetera.getCapacMaxima());
    }
//    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza
    
    public void servirTaza(int num, Cafetera1 cafetera){
       
        int resto= cafetera.getCapacActual()-num;
        
        if ((cafetera.getCapacActual()-num)>=0){
            cafetera.setCapacActual(cafetera.getCapacActual()-num);
            System.out.println("La tasa no se llenó y a la cafetera le sobra: "+ (resto));
        } else {
            System.out.println("La tasa se llenó con: "+ cafetera.getCapacActual());
            cafetera.setCapacActual(0);
        }   
    }
    
    
    public void vaciarCafetera(Cafetera1 cafetera){
        cafetera.setCapacActual(0);
    }
//    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada
    
    public void agregarCafe(int tasa, Cafetera1 cafetera){
        //       ( 10                  + 20 ) <= 50
        
        int actual = cafetera.getCapacActual();
        int maximo = cafetera.getCapacMaxima();
        
        if ((actual+tasa)<=maximo){
            cafetera.setCapacActual(actual+tasa);
            //                cap Actual =   10          +     20 
        } else {
            cafetera.setCapacActual(maximo);
            // CapActual       =             50
        }
    }
    
    public int sumar(int num1, int num2){
        int suma;
        suma = num1+ num2;
        return (suma);
    }
    
    public boolean esMayor(int num1, int num2){
        boolean devolucion;
        if (num1 >num2){
            return devolucion = true;
        } else devolucion= false;
        
        return devolucion;
    }
    
    public void menu(Cafetera1 cafetera){
        
        int opcion;
          do {            
              System.out.println("MENU");
              System.out.println("1. llenar cafetera");
              System.out.println("2. vaciar cafetera");
              System.out.println("3. Servir Cafe");
              System.out.println("4. Llenar con tasa");
              System.out.println("9. Salir");
             opcion =sc.nextInt();
             
             switch(opcion){
                 case 1:
                     llenarCafetera(cafetera);
                     System.out.println(cafetera.toString());
                     break;
                 case 2:
                     vaciarCafetera(cafetera);
                     System.out.println(cafetera.toString());
             }
        } while (opcion!= 9);
        
    }
    
    
    
    
}
