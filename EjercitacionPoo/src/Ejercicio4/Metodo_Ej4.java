
package Ejercicio4;


public class Metodo_Ej4 {
    
    private int base;
    private int altura;
   
    // Método para crear recgantulo con un subprograma
    public void crearRectangulo(int a, int b){
        
        this.base = a;
        this.altura = b;
    
    }
// Metodo construcción con variables de paso
    public Metodo_Ej4(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
//Metodo de costrucción vacio
    public Metodo_Ej4() {
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    // Metodo para calcular superficie. Como ya están guardados los valores de base y altura
//    no hace falta pasárselos nuevamente
    public int calculoSuperficie(){
        int resultado = base * altura;
        
        return resultado;
    }
    // Metodo para calcular el perímetro
    public int calculoPerimetro(){
        int resultado = (base + altura ) * 2;
        return resultado;
    }
    
    public void dibujarRectangulo(){
        
        for (int i=0; i<altura;i++){
            for (int j=0; j<base;j++){
                if (i==0 || i== (altura-1)){
                    System.out.print(" * ");
                } else if (j==0 || j== (base-1)){
                    System.out.print(" * ");
                } else System.out.print("   ");
            }
            System.out.println("");
        }
        
        
    }
    
    
}
