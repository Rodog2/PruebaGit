
package Ejercicio9_Adicional5;


public class ServiceTriangulo {
    
    public void calcularArea(Triangulo [] t){
        
        System.out.println("Area del primer triangulo");
        
        Triangulo t1= t[0];
        Triangulo t2= t[1];
        Triangulo t3= t[2];
        Triangulo t4= t[3];
        int area1= (t1.getLado1()*t1.getLado3())/2;
        int area2= (t2.getLado1()*t2.getLado3())/2;
        int area3= (t3.getLado1()*t3.getLado3())/2;
        int area4= (t4.getLado1()*t4.getLado3())/2;
        System.out.println(area1);
        System.out.println("Area del segundo triangulo: "+area2);
        System.out.println("Area del tercer triangulo: "+area3);
        System.out.println("Area del cuarto triangulo: "+area4);
        
    }
    
    
    public int mostrarTrianguloMasArea(Triangulo[] t) {

        Triangulo t1 = t[0];
        Triangulo t2 = t[1];
        Triangulo t3 = t[2];
        Triangulo t4 = t[3];
        int area1 = (t1.getLado1() * t1.getLado3()) / 2;
        int area2 = (t2.getLado1() * t2.getLado3()) / 2;
        int area3 = (t3.getLado1() * t3.getLado3()) / 2;
        int area4 = (t4.getLado1() * t4.getLado3()) / 2;

        int mayor = 0;

        if (area1 > area2 && area1 > area2 && area1 > area3) {
            mayor = area1;
        } else if (area2 > area1 && area2 > area3 && area2 > area4) {
            mayor = area2;
        } else if (area3 > area1 && area3 > area2 && area3 > area4) {
            mayor = area3;
        } else if (area4 > area1 && area4 > area2 && area4 > area3) {
            mayor = area4;
        }

        return mayor;
    }

    
    
    
}
