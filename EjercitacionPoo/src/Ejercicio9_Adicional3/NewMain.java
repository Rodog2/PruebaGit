/*
Crear una clase Pass, donde declaremos los siguientes atributos:
 pass : Del tipo String
 nombre: Del tipo String
 dni: Del tipo int.
Métodos para desarrollar:
 Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no
por teclado)
 Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
 Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
 Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
 A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios

*/
package Ejercicio9_Adicional3;

import java.util.Scanner;


public class NewMain {

 
    public static void main(String[] args) {
       
//        ServicioPass servicio1 = new ServicioPass();
Scanner sc = new Scanner(System.in).useDelimiter("\n");
ServicioPass s1 = new ServicioPass();
        
        Pass p1 = new Pass("1234","Usuario",000000);
        String opcion;
        int cont=0;
        do {
        System.out.println("MENU DE OPCIONES:");
        System.out.println("A- Ingresar contraseña");
        System.out.println("B- Ver nivel de contraseña");
        System.out.println("C- Modificar Contraseña");
        System.out.println("D- Modificar Nombre");
        System.out.println("E- Modificar DNI");
        System.out.println("F- Ver datos");
        System.out.println("G- Salir");
        opcion = sc.nextLine();
        opcion = opcion.toLowerCase();
        switch (opcion){
            case "a":
                cont++;
                s1.crearContrasenia(p1);
                break;
            case "b":
                if (cont==0){
                    System.out.println("Primero debe ingresar una contraseña");
                    break;
                } else{
                s1.analizarPass(p1);
                break; }
            case "c":
                 if (cont==0){
                    System.out.println("Primero debe ingresar una contraseña");
                    break;
                } else{
                s1.modificarContraseña(p1);
                break;}
            case "d":
                 if (cont==0){
                    System.out.println("Primero debe ingresar una contraseña");
                    break;
                } else{
                s1.modificarNombre(p1);
                break;}
            case "e":
                 if (cont==0){
                    System.out.println("Primero debe ingresar una contraseña");
                    break;
                } else{
                s1.modificarDNI(p1);
                break;}
                   
            case "f":
                System.out.println(p1.toString());
                break;
        }
        
        } while (opcion.equals("g")==false);
       
        
        
        
        
        
//        s1.crearContrasenia(p1);
//        
//        System.out.println(p1.toString());
//        
//        s1.analizarPass(p1);
//        
//        s1.modificarNombreyDNI(p1);
//        System.out.println(p1.toString());
    }
    
}
