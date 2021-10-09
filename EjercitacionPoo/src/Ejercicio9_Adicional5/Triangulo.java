
package Ejercicio9_Adicional5;


public class Triangulo {
    
    private int lado1;
    private int lado2 = lado1;
    private int lado3;

    public Triangulo(int lado1, int lado3) {
        this.lado1 = lado1;
        this.lado3 = lado3;
        this.lado2 = lado1;
    }

    public Triangulo() {
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
    
    
    
    
}
