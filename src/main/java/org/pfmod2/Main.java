package org.pfmod2;

import org.pfmod2.ubicaciones.Isla;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Isla islaLocal = Configuracion.inicializarIsla();
        islaLocal.imprimirSeresVivos();
        islaLocal.imprimirUbicaciones();
    }
}

