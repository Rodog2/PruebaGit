
package ejercitacionpoo;


public class EjercitacionPoo {

   
    public static void main(String[] args) {
      
//     Libro L1 = new Libro(1234,"La casa","Rodrigo Castillo",300);
     
//       int ISBN;
//    String Titulo;
//    String Autor;
//    int numPaginas;



//        System.out.println("Número ISBN: "+ L1.getISBN());
//        System.out.println("El titulo es: "+ L1.getTitulo());
//        System.out.println("El autor es: "+ L1.getAutor());
//        System.out.println("Las páginas son: "+ L1.getNumPaginas());
        

DatosLibro L1 = new DatosLibro();
MostrarLibro libro = new MostrarLibro();

L1.llenarLibro();

libro.mostrarLibro(L1.getISBN(),L1.getTitulo(),L1.getAutor(),L1.getNumPaginas());






        
        
        
        



        
    }
    
}
