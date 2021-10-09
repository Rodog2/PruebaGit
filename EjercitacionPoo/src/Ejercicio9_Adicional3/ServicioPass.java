

package Ejercicio9_Adicional3;

import java.util.Scanner;

public class ServicioPass {
    
      Scanner sc = new Scanner(System.in).useDelimiter("\n");
      
      
    public void crearContrasenia(Pass p){
        System.out.println("Ingrese la contraseña");
        String pass = sc.nextLine();
        
        do {
             if(pass.length()>10){
                 System.out.println("La contraseña debe tener menos de 10 caracteres");
                 System.out.println("Ingrese una nueva contraseña");
                 pass = sc.nextLine();
             } 
        } while (pass.length()>10);
            
      p.setPass(pass);
    }
    
    public void modificarContraseña(Pass p){
         String pass = p.getPass();
        String comprobacion="";
        do{
             System.out.println("Ingrese su contraseña actual");
        comprobacion = sc.nextLine();
            if (comprobacion.equals(pass)){
                System.out.println("Ingrese la nueva contraseña");
                p.setPass(sc.nextLine());
                
            } else System.out.println("La contaseña ingresada no es correcta");
        } while (comprobacion.equals(pass)==false);
        
        
    }
    
    public void analizarPass(Pass p){
        String c = p.getPass();
        int cont=0, contA=0;
        
        for (int i = 0; i < c.length(); i++) {
            if (c.substring(i, i+1).equals("z")){
                cont++;
            }
            if ((c.substring(i,(i+1)).equals("a"))){
                contA++;
            }
            
        }
        if (cont>0 && contA<2){
            System.out.println("La contraseña es nivel MEDIO");
        } 
        if (cont>0 && contA>=2){
            System.out.println("La contraseña es nivel ALTO");
        }
        if (cont==0 && contA<2){
            System.out.println("La contraseña es nivel BAJO");
        }
    }
    
    public void modificarNombre(Pass p){
        String pass = p.getPass();
        String comprobacion="";
       
        
        do{
             System.out.println("Ingrese su contraseña para modificar datos");
        comprobacion = sc.nextLine();
            if (comprobacion.equals(pass)){
                System.out.println("Ingrese el nuevo nombre de usuario");
                p.setNombre(sc.nextLine());
               
            } else System.out.println("La contaseña ingresada no es correcta");
        } while (comprobacion.equals(pass)==false);
        
    }
    
     public void modificarDNI(Pass p){
        String pass = p.getPass();
        String comprobacion="";
       
        
        do{
             System.out.println("Ingrese su contraseña para modificar datos");
        comprobacion = sc.nextLine();
            if (comprobacion.equals(pass)){
            
                System.out.println("Ingrese el nuevo DNI");
                p.setDNI(sc.nextInt());
            } else System.out.println("La contaseña ingresada no es correcta");
        } while (comprobacion.equals(pass)==false);
        
    }
    
}
