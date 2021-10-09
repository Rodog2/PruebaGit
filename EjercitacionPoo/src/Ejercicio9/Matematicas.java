
package Ejercicio9;


public class Matematicas {
    
    private double num1;
    private double num2;
    
    
    public Matematicas(){
}
    
    public Matematicas(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void setNum1(double num1){
        this.num1= num1;
    }
    
    public void setNum2(double num2){
        this.num2 = num2;
    }
    
    public double getNum1(){
        return num1;
    }
    
    public double getNum2(){
        return num2;
    }
    
//    Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
    
    public double devolverMayor(){
        double mayor;
        
        if (num1>=num2){
            mayor = num1;
        } else mayor = num2;
        return mayor;
    }
    
//    Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
    
    public double calcularPotencia(){
        int menor;
        double mayor = devolverMayor();
        mayor= Math.floor(mayor);
        if (mayor==num1){
            menor = (int)num2;
        } else menor = (int)num1;
        double resultado = Math.pow((int)mayor, menor);

        return resultado;
    }
    
//    Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
    
    public double calcularRaiz(){
          double menor;
        double mayor = devolverMayor();
       
        if (mayor==num1){
            menor = num2;
        } else menor = num1;
        menor = Math.floor(menor);
        double resultado = Math.sqrt(menor);

        return resultado;
 
    }
    
    
}
