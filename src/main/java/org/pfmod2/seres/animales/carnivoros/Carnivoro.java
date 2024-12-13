package org.pfmod2.seres.animales.carnivoros;

import org.pfmod2.seres.animales.Animal;

public abstract class Carnivoro extends Animal {
    public Carnivoro(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean esComestible, double velocidadAnimal, double alimentacionAnimal) {
        super(idServivo, pesoServivo, estaVivo, idUbicacion, esComestible, velocidadAnimal, alimentacionAnimal);
    }
}
