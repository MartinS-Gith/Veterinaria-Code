package veterinaria;

import java.time.LocalDate;

public class Domesticos extends Animales {
    public String raza;
    public String especie;
    public Boolean vacunado;

    public Domesticos(String codigo, String nombre, int pesoKg, LocalDate fechaIngreso, String raza, String especie, Boolean vacunado){
        super(codigo, nombre, pesoKg, fechaIngreso);
        this.raza = raza;
        this.especie = especie;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return super.toString() + "Domesticos{" + "raza=" + raza + ", especie=" + especie + ", vacunado=" + vacunado + '}';
    }

}
