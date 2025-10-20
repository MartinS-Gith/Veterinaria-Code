
package veterinaria;

import java.time.LocalDate;

public class Animales {
    public String codigo;
    public String nombre;
    public int pesoKg;
    public LocalDate fechaIngreso;

    public Animales(String codigo, String nombre, int pesoKg, LocalDate fechaIngreso){
        this.codigo = codigo;
        this.nombre = nombre;
        this.pesoKg = pesoKg;
        this.fechaIngreso = fechaIngreso;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
        
    public int getPesoKg(){
        return pesoKg;
    }
    
    public void setPesoKg(int pesoKg){
        this.pesoKg = pesoKg;
    }
    
    public LocalDate getFechaIngreso(){
        return fechaIngreso;
    }
    
    public void setFechaIngreso(LocalDate fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Animales{" + "codigo=" + codigo + ", nombre=" + nombre + ", pesoKg=" + pesoKg + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
}
