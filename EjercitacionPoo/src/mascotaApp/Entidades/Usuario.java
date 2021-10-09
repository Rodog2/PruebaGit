package mascotaApp.Entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import mascotaApp.Enum.SexoHumano;

public class Usuario {

    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate nacimiento;
    private String pais;
    private SexoHumano sexo;
//    private Mascota mascota;
//    private List<Mascota> lista;

    public Usuario(){
        
    }

    public Usuario(String nombre, String apellido, int dni, LocalDate nacimiento, String pais, SexoHumano sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getMesNacimiento(LocalDate fecha){
        return fecha.getMonthValue();
    }
    public int getDiaNacimiento(LocalDate fecha){
        return fecha.getDayOfMonth();
    }
    public int getAnioNacimiento(LocalDate fecha){
        return fecha.getYear();
    }
    
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + '}';
    }
    
    
    
}
