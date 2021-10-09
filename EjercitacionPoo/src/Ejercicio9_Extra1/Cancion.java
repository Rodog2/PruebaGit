
package Ejercicio9_Extra1;


public class Cancion {
    
    private String titulo;
    private String autor;
    
    public Cancion(){
        
    }
    
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
}
