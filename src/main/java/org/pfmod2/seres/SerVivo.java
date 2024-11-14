
package org.pfmod2.seres;

import org.pfmod2.ubicaciones.Ubicacion;

public abstract class SerVivo {
    protected int idSerVivo;
    protected Ubicacion ubicacion;
    protected double pesoSerVivo;
    protected boolean estaVivo;
    public SerVivo(int idSerVivo, Ubicacion ubicacion, double pesoSerVivo, boolean estaVivo) {
        this.idSerVivo = idSerVivo;
        this.ubicacion = ubicacion;
        this.pesoSerVivo = pesoSerVivo;
        this.estaVivo = estaVivo;
    }
    public abstract int getIdSerVivo();
    public abstract void setIdSerVivo(int idSerVivo);
    public abstract double getPesoSerVivo();
    public abstract void setPesoSerVivo(double pesoSerVivo);
    public abstract boolean getEstaVivo();
    public abstract void setEstaVivo(boolean estaVivo);
}