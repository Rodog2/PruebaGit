/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0. 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 
posibles soluciones. 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
delante de -b
 */
package Ejercicio9_Extra3;


public class NewMain {

   
    public static void main(String[] args) {
       
        Raices R1 = new Raices(2,10,5);
        ServicioRaiz S1 = new ServicioRaiz();
        
        //Llamamos el metodo getDriscriminante y lo imprimimos por pantalla para ve el resultado
//        System.out.println(S1.getDiscriminante(R1));
//        
//        System.out.println("Tiene dos soluciones? :"+ S1.tieneRaices(R1));
//        System.out.println("Tiene una única solución? :"+S1.tieneRaiz(R1));
        
//        S1.obtenerRaices(R1);
//        
        if (S1.obtenerRaiz(R1)==0){
            System.out.println("La ecuación no tiene un resultado");
        }else S1.obtenerRaiz(R1);
        
        S1.calcular(R1);
    }
    
}
