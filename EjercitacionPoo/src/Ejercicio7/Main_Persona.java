
package Ejercicio7;


public class Main_Persona {

  
    public static void main(String[] args) {
       
        // Creamos la persona 1
//        CrearPersona PP1 = new CrearPersona();
//        
//        Persona P1 = PP1.crearPersona();
//        
//        P1.mostrarPersona();
        
//        Persona P1 = new Persona("Rodrigo", 31, "M", 78.6, 171.3);
//        
//        // Creamos la persona 2
//        
//        CrearPersona PP2 = new CrearPersona();
//        
//        Persona P2 = PP2.crearPersona();
//        
//        P2.mostrarPersona();
        
//        Persona P2 = new Persona("Carlos", 23, "M",70.2,173.2);
//        
//        //Creamos la persona 3
////        
//         CrearPersona PP3 = new CrearPersona();
//        
//        Persona P3 = PP3.crearPersona();
//        
//        P3.mostrarPersona();
        
//        Persona P3 = new Persona("Marcela",40,"F",63.2,164);
//        
//        //Creamos la persona 4
//         CrearPersona PP4 = new CrearPersona();
//        
//        Persona P4 = PP4.crearPersona();
//        
//        P4.mostrarPersona();
        
//        Persona P4 = new Persona("Florencia",15,"F",54,154.2);
//        
//        int contBajoPeso = 0, contSobrePeso = 0, contPesoIdeal = 0;
//        int contMayor =0, contMenor =0;
//        
//        String IMC = "";
//        switch (P1.calcularIMC()) {
//            case -1:
//                IMC = "Menor a 20 (Peso debajo del promedio)";
//                contBajoPeso += +1;
//                break;
//            case 1:
//                IMC = "Mayor a 25 (Sobre Peso)";
//                contSobrePeso += +1;
//                break;
//            case 0:
//                IMC = "Entre 20 y 25 (Peso Ideal)";
//                contPesoIdeal += +1;
//                break;
//        }
//        
//        P1.mostrarPersona();
//        System.out.println("El indice de masa corporal de "+P1.getNombre()+" es de "+IMC);
//        System.out.println("La persona es Mayor de 18 años? "+ P1.esMayorDeEdad());
//        if (P1.esMayorDeEdad()==true){
//            contMayor += +1;
//        } else contMenor += +1;
//        
//            switch (P2.calcularIMC()) {
//            case -1:
//                IMC = "Menor a 20 (Peso debajo del promedio)";
//                contBajoPeso += +1;
//                break;
//            case 1:
//                IMC = "Mayor a 25 (Sobre Peso)";
//                contSobrePeso += +1;
//                break;
//            case 0:
//                IMC = "Entre 20 y 25 (Peso Ideal)";
//                contPesoIdeal += +1;
//                break;
//        }
//        
//        P2.mostrarPersona();
//        System.out.println("El indice de masa corporal de "+P2.getNombre()+" es de "+IMC);
//        System.out.println("La persona es Mayor de 18 años? "+ P2.esMayorDeEdad());
//        if (P2.esMayorDeEdad()==true){
//            contMayor += +1;
//        } else contMenor += +1;
//        
//           switch (P3.calcularIMC()) {
//            case -1:
//                IMC = "Menor a 20 (Peso debajo del promedio)";
//                contBajoPeso += +1;
//                break;
//            case 1:
//                IMC = "Mayor a 25 (Sobre Peso)";
//                contSobrePeso += +1;
//                break;
//            case 0:
//                IMC = "Entre 20 y 25 (Peso Ideal)";
//                contPesoIdeal += +1;
//                break;
//        }
//        
//        P3.mostrarPersona();
//        System.out.println("El indice de masa corporal de "+P3.getNombre()+" es de "+IMC);
//        System.out.println("La persona es Mayor de 18 años? "+ P3.esMayorDeEdad());
//        if (P3.esMayorDeEdad()==true){
//            contMayor += +1;
//        } else contMenor += +1;
//        
//           switch (P4.calcularIMC()) {
//            case -1:
//                IMC = "Menor a 20 (Peso debajo del promedio)";
//                contBajoPeso += +1;
//                break;
//            case 1:
//                IMC = "Mayor a 25 (Sobre Peso)";
//                contSobrePeso += +1;
//                break;
//            case 0:
//                IMC = "Entre 20 y 25 (Peso Ideal)";
//                contPesoIdeal += +1;
//                break;
//        }
//        
//        P4.mostrarPersona();
//        System.out.println("El indice de masa corporal de "+P4.getNombre()+" es de "+IMC);
//        System.out.println("La persona es Mayor de 18 años? "+ P4.esMayorDeEdad());
//        if (P4.esMayorDeEdad()==true){
//            contMayor += +1;
//        } else contMenor += +1;
//      
//       
//        System.out.println("La cantidad de personas con sobre peso son: "+((double)contSobrePeso/4*100)+"%");
//        System.out.println("El porcentaje de personas con peso ideal es: "+((double)contPesoIdeal/4*100)+"%");
//        System.out.println("El porcentaje de personas con peso bajo es: "+((double)contBajoPeso/4*100)+"%");
//        
//        System.out.println("El porcentaje de personas mayores de edad es de: "+((double)contMayor/4*100)+"%");
//        System.out.println("El porcentaje de personas menores de edad es de: "+((double)contMenor/4*100)+"%");
//  
        
//-------------------------------------------------------------------------------------------------------------------
// Java Excepciones. Ejercicio 1

Persona p1 = null;

// ESta excepción utiliza la clase PersonaException que creamos, con el constructor vario y con el mensaje por defecto
// Lo que hace es crear un nuevo objeto "PersonaException" y lo agarra con el catch y lo guarda en la variable e
// Luego muestra el mensaje con getMessage();

//        try {
//            if (p1 == null){
//                throw new PersonaException("La persona creada debe tener datos");
//            } else p1.mostrarPersona();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    


// En este caso agarramos la excepcion e imprimimos un mensaje por pantalla directamente
  try {
       p1.mostrarPersona();
        } catch (Exception e) {
           System.out.println("La persona debe tener datos cargados");
        }



    }
    
}
