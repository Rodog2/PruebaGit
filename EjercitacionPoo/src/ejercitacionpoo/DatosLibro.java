
package ejercitacionpoo;

import java.util.Scanner;


public class DatosLibro {
       int ISBN;
    String Titulo;
    String Autor;
    int numPaginas;
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarLibro(){
        
        System.out.println("Ingrese el numero de ISBN");
        
        this.ISBN = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el título del libro");
        this.Titulo = sc.nextLine();
        System.out.println("Ingrese el nombre del autor");
        this.Autor= sc.nextLine();
        System.out.println("Ingrese la cantidad de páginas del libro");
        this.numPaginas= sc.nextInt();
        
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public Scanner getSc() {
        return sc;
    }
    
    
    
    
}
