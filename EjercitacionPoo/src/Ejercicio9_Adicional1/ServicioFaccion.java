
package Ejercicio9_Adicional1;


public class ServicioFaccion {
    
    
    
    
    public Fraccion sumarFraccion(Fraccion f1, Fraccion f2){
        
        int denominador;
        
        if (f1.getDenominador()%f2.getDenominador()==0 || f2.getDenominador()%f1.getDenominador()==0){
          if (f1.getDenominador()>=f2.getDenominador()){
              denominador = f1.getDenominador();
          } else denominador = f2.getDenominador();
        } else {
            denominador = f1.getDenominador()*f2.getDenominador();
        } 
        
     int numerador;
     
     numerador = ((denominador/f1.getDenominador())*f1.getNumerador())+((denominador/f2.getDenominador())*f2.getNumerador());
            
    
     
     do {
         if ((numerador%2)==0 && (denominador%2)==0){
             numerador = numerador /2;
             denominador= denominador/2;
         }
     } while ((numerador%2)==0 && (denominador%2)==0);  
     
     do {
         if ((numerador%3)==0 && (denominador%3)==0){
             numerador = numerador /3;
             denominador= denominador/3;
         }
     } while ((numerador%3)==0 && (denominador%3)==0); 
     
       do {
         if ((numerador%5)==0 && (denominador%5)==0){
             numerador = numerador /5;
             denominador= denominador/5;
         }
     } while ((numerador%3)==5 && (denominador%5)==0); 
     
     return new Fraccion(numerador, denominador);
    }
    
    
    public Fraccion restarFraccion(Fraccion f1,Fraccion f2){
        
         int denominador;
        
        if (f1.getDenominador()%f2.getDenominador()==0 || f2.getDenominador()%f1.getDenominador()==0){
          if (f1.getDenominador()>=f2.getDenominador()){
              denominador = f1.getDenominador();
          } else denominador = f2.getDenominador();
        } else {
            denominador = f1.getDenominador()*f2.getDenominador();
        } 
        
     int numerador;
     
     numerador = ((denominador/f1.getDenominador())*f1.getNumerador())-((denominador/f2.getDenominador())*f2.getNumerador());
            
     
     
     do {
         if ((numerador%2)==0 && (denominador%2)==0){
             numerador = numerador /2;
             denominador= denominador/2;
         }
     } while ((numerador%2)==0 && (denominador%2)==0);  
     
     do {
         if ((numerador%3)==0 && (denominador%3)==0){
             numerador = numerador /3;
             denominador= denominador/3;
         }
     } while ((numerador%3)==0 && (denominador%3)==0); 
     
       do {
         if ((numerador%5)==0 && (denominador%5)==0){
             numerador = numerador /5;
             denominador= denominador/5;
         }
     } while ((numerador%3)==5 && (denominador%5)==0); 
     
     return new Fraccion(numerador,denominador);
    }
    
    public Fraccion multiplicarFraccion(Fraccion f1, Fraccion f2){
        
        int numerador,denominador;
        
        numerador = f1.getNumerador()*f2.getNumerador();
        denominador = f1.getDenominador()* f2.getDenominador();
        
        do {
         if ((numerador%2)==0 && (denominador%2)==0){
             numerador = numerador /2;
             denominador= denominador/2;
         }
     } while ((numerador%2)==0 && (denominador%2)==0);  
     
     do {
         if ((numerador%3)==0 && (denominador%3)==0){
             numerador = numerador /3;
             denominador= denominador/3;
         }
     } while ((numerador%3)==0 && (denominador%3)==0); 
     
       do {
         if ((numerador%5)==0 && (denominador%5)==0){
             numerador = numerador /5;
             denominador= denominador/5;
         }
     } while ((numerador%3)==5 && (denominador%5)==0); 
        
        return new Fraccion(numerador, denominador);
    }
    
    public Fraccion dividirFraccion(Fraccion f1, Fraccion f2){
        
        int numerador,denominador;
        
        numerador = f1.getNumerador()*f2.getDenominador();
        denominador = f1.getDenominador()* f2.getNumerador();
        
        do {
         if ((numerador%2)==0 && (denominador%2)==0){
             numerador = numerador /2;
             denominador= denominador/2;
         }
     } while ((numerador%2)==0 && (denominador%2)==0);  
     
     do {
         if ((numerador%3)==0 && (denominador%3)==0){
             numerador = numerador /3;
             denominador= denominador/3;
         }
     } while ((numerador%3)==0 && (denominador%3)==0); 
     
       do {
         if ((numerador%5)==0 && (denominador%5)==0){
             numerador = numerador /5;
             denominador= denominador/5;
         }
     } while ((numerador%3)==5 && (denominador%5)==0); 
        
        return new Fraccion(numerador, denominador);
    }
    
}
