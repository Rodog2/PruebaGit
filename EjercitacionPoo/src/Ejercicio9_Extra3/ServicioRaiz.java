
package Ejercicio9_Extra3;

import java.text.DecimalFormat;


public class ServicioRaiz {
    
    DecimalFormat df = new DecimalFormat("##.##");
  
    public double getDiscriminante(Raices C){
//        (b^2)-4*a*c 
        double resultado = (C.getB()*C.getB())-(4*C.getA()*C.getC());
        return resultado;
    }
    
//   Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    
    public boolean tieneRaices(Raices C){
        boolean rdo;
        if (getDiscriminante(C)>0){
            rdo = true;
        }else rdo =false;
        return rdo;
    }
//    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
//para que esto ocurra, el discriminante debe ser igual que 0
    
    public boolean tieneRaiz(Raices C){
        boolean rdo;
        if (getDiscriminante(C)==0){
            rdo=true;
        }else rdo=false;
        return rdo;
    }
//    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 
//posibles soluciones. 
    public void obtenerRaices(Raices C) {
//         (-b±√((b^2)-(4*a*c)))/(2*a) 

        double rdo1, rdo2;

        double a = (double) C.getA();
        double b = (double) C.getB();
        double c = (double) C.getC();
        rdo1 = (-b + Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a);
        rdo2 = -(double) C.getB() - Math.sqrt((double) (C.getB() * C.getB()) - (4 * C.getA() * C.getC()));

        System.out.println("El resultado 1 es: " + rdo1);

        System.out.println("El resultado 2 es: " + rdo2);
    }
        
//    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. 
//Es en el caso en que se tenga una única solución posible.
    
    public double obtenerRaiz(Raices C) {
       double rdo1=0;
        if (tieneRaiz(C) == true) {
            rdo1 = (-C.getB() + Math.sqrt(((C.getB() * C.getB()) - (4 * C.getA() * C.getC())))) / (2 * C.getA());
        }
        return rdo1;
    }

//    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
//caso de no existir solución, se mostrará un mensaje.
    public void calcular(Raices C){
        if (tieneRaices(C)==true){
            obtenerRaices(C);
        } else if (tieneRaiz(C)== true){
            obtenerRaiz(C);
        }else System.out.println("La ecuación trabaja con números complejos");
        
    }
    
}
