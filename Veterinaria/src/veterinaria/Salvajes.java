
package veterinaria;

import java.time.LocalDate;

public class Salvajes extends Animales{
    public String habitat;
    public String especie;
    public int peligrosidad;
    
    public Salvajes(String codigo, String nombre, int pesoKg, LocalDate fechaIngreso, String habitat, String especie, int nivelPeligrosidad){
        super(codigo, nombre, pesoKg, fechaIngreso);
        this.habitat = habitat;
        this.especie = especie;
        this.peligrosidad = nivelPeligrosidad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    @Override
    public String toString() {
        return "Salvajes{" + "habitat=" + habitat + ", especie=" + especie + ", peligrosidad=" + peligrosidad + '}';
    }
    
}
