package org.pfmod2.seresvivos;

public class Herbivoro extends SerVivo {
    private int velocidad;
    private double alimentacion;
    private String especie;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(double alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
