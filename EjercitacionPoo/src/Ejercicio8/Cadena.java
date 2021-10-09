
package Ejercicio8;

public class Cadena {
    
    private String frase;
    private int longitud;
    
    public Cadena(String frase){
        this.frase = frase;
        this.longitud= frase.length();
    }
    
    public Cadena(){
        
    }
    
    public void setFrase(String frase){
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase(){
        return frase;
    }
    
    public int getLongitud(){
        return longitud;
    }
//    
//    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada

    public int mostrarVocales() {
        int contVocales = 0;
        for (int i = 0; i < longitud - 1; i++) {
            if ((frase.substring(i,(i+1)).equals("a")) || (frase.substring(i,(i+1)).equals("e")) || (frase.substring(i,(i+1)).equals("i")) || (frase.substring(i,(i+1)).equals("o")) || (frase.substring(i,(i+1)).equals("u"))) {
                contVocales += +1;
            }
        }
        return contVocales;
    }
//    
//    Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public String invertirFrase(){
        String fraseInvertida="";
        String vector[]= new String [frase.length()];
        
        for (int i=0;i<(frase.length());i++){
            vector[i]= frase.substring((frase.length()-i-1),(frase.length()-i));
            fraseInvertida = fraseInvertida+ vector[i];
        }
         fraseInvertida = "["+fraseInvertida+"]";
        return fraseInvertida;
    }
    
//    Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
//ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces
    
    public int vecesRepetido(String letra){
        int vecesRepetida=0;
     for (int i=0;i<frase.length();i++){
       if (frase.substring(i,(i+1)).equals(letra)){
           vecesRepetida += +1;
       }       }   
            
           return vecesRepetida; 
        }
    
//    Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario
    
    public boolean compararLongitud(String frase){
        boolean igualdad;
        if (this.frase.length()== frase.length()){
            igualdad =true;
        }else igualdad =false;
        return igualdad;
    }
    
//    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante
     
    public String unirFrases(String frase){
      String unionFrases = this.frase + " "+  frase;
//       unionFrases = this.frase.concat(frase);
        return unionFrases;    
    }
//    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante
    
    public String reemplazar(String letra){
        
        String retorno = this.frase.replaceAll("a", letra);
        
        return retorno;
    }
    
//    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
    public boolean contiene(String letra) {
//        contains(CharSequence s)	En este caso CharSequense es sinónimo de String.
boolean retorno = this.frase.contains(letra);

return retorno;
    }
    
}