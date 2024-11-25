package org.pfmod2.ubicaciones;

import org.pfmod2.seres.SerVivo;
import org.pfmod2.seres.animales.carnivoros.Lobo;
import org.pfmod2.seres.animales.omnivoros.Raton;

import java.sql.SQLOutput;
import java.util.*;

public class Isla {

    private static final String NOMBRE_ISLA = "La isla de la Infantasia";
    private static HashMap<Integer, Ubicacion> ubicaciones;
    private static HashMap<Integer, SerVivo> seresvivos;

    public static HashMap retornarUbicaciones(){
        return ubicaciones;
    }
    public Isla(HashMap<Integer, Ubicacion> ubicaciones, HashMap<Integer, SerVivo> seresvivos) {
        this.ubicaciones = ubicaciones;
        this.seresvivos = seresvivos;
    }

    public static void imprimirSeresVivos(){
        Random randomPresa = new Random();
        List<Integer> idSerVivoList = seresvivos.keySet().stream().toList();
        int intRandompresa = idSerVivoList.get(randomPresa.nextInt(idSerVivoList.size()));
        System.out.println(intRandompresa);
        System.out.println(seresvivos.get(intRandompresa));
        if (seresvivos.get(intRandompresa) instanceof Raton){
            System.out.println("Fue raton, intentamos comer, estado de la presa: " + seresvivos.get(intRandompresa).getEstaVivo());
            probarComerLobo(seresvivos.get(intRandompresa));
        }
        for(Map.Entry<Integer, SerVivo> raton: seresvivos.entrySet()){

        }
    }

    public static void probarDesplazarLobo(){
        seresvivos.forEach((idSerVivo, serVivo) ->{
            if (serVivo instanceof Lobo){
                System.out.println(String.format("Ubicacion original -> %d ", serVivo.getIdUbicacion()));
                ((Lobo) serVivo).desplazarse();
                System.out.println(String.format("Nueva Ubicacion -> %d  ", serVivo.getIdUbicacion()));
            }
        });
    }

    public static void probarComerLobo(SerVivo raton){

        seresvivos.forEach((idPresa, presa) ->{
            if ((presa instanceof Raton)){
                System.out.println(String.format("Estado de la presa %b -> ", presa.getEstaVivo()));
                seresvivos.forEach((idLobo, cazador) -> {
                    if (cazador instanceof Lobo){
                        ((Lobo) cazador).comer(presa);
                    }
                });
            }
        });
    }
    public static void imprimirUbicaciones(){
        ubicaciones.forEach((key, value) ->{
            System.out.println(String.format("IdUbicacion -> %d, SeresVivos -> %d", key, seresvivos.entrySet().stream().
                    filter(serVivo -> serVivo.getValue().getIdUbicacion() == key).count()));
        });
    }

}

