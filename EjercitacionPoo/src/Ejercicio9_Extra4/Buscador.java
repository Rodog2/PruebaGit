package Ejercicio9_Extra4;

import java.util.Scanner;

public class Buscador {
    
     Scanner sc= new Scanner(System.in).useDelimiter("\n");
     
    public void crearNif(Nif C) {
        long resto;
        do {
            System.out.println("Ingrese el número de documento");

            C.setDNI(sc.nextLong());
            resto = C.getDNI() % 23;
            if (C.getDNI() < 0 || C.getDNI()>99999999) {
                System.out.println("El numero de documento no es válido");
            }
        } while (C.getDNI() < 0 || C.getDNI()>99999999 );
        String letra1 = buscarLetra(resto);
        C.setLetra(letra1);
        System.out.println(letra1);

    }

    public String buscarLetra(long resto) {
        String letra="";
        String vector[] = new String[23];
       
        vector[0] = "T";
        vector[1] = "R";
        vector[2] = "W";
        vector[3] = "A";
        vector[4] = "G";
        vector[5] = "M";
        vector[6] = "Y";
        vector[7] = "F";
        vector[8] = "P";
        vector[9] = "D";
        vector[10] = "X";
        vector[11] = "B";
        vector[12] = "N";
        vector[13] = "J";
        vector[14] = "Z";
        vector[15] = "S";
        vector[16] = "Q";
        vector[17] = "V";
        vector[18] = "H";
        vector[19] = "L";
        vector[20] = "C";
        vector[21] = "K";
        vector[22] = "E";
         for (int i=0;i<24;i++){
            if (i==resto){
                letra =vector[i];
            }
        }
       
        return letra;
    }
//    Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F)
    
    public void mostrar(Nif C){
        // Convertimos la variable LONG del DNI en una variable String
        String DNI = String.valueOf(C.getDNI());
        // Creamos un vector para poder guardar los valores de STRING DNI
       String vector[] = new String [8];
       String Final = "";
       
       // En el vector empezamos de atrás para adelante, guardando al final el último numero del DNI 
       // Y cuando se acabe la longitud, que se guarde el valor 0.
       for (int i=7;i>=0;i--){
           if ((DNI.length()-1+i-7)>=0){
               vector[i]= DNI.substring(DNI.length()-1+i-7,DNI.length()+i-7);
           }else vector[i]= "0";
       }
       // Creamos una variable String para guardar el valor del vector. Asi se van a guardar 0 y luego el DNI.
        for (int i=0;i<8;i++){
            Final = Final + vector[i];
        }
        // LE agregamos el valor de la letra al final a la variable.
        Final = Final + "-"+C.getLetra();
        System.out.println(Final);
        
    }
    
    
}
