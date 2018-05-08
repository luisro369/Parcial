package com.example.avion.funciona.Entities;

/**
 * Created by luisro on 5/6/18.
 */

public class Summary {
    String fecha;
    String estadoCuenta;
    String ganacia;
    String gasto;

    public Summary(String fecha, String estadoCuenta, String ganacia, String gasto) {
        this.fecha = fecha;
        this.estadoCuenta = estadoCuenta;
        this.ganacia = ganacia;
        this.gasto = gasto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public String getGanacia() {
        return ganacia;
    }

    public void setGanacia(String ganacia) {
        this.ganacia = ganacia;
    }

    public String getGasto() {
        return gasto;
    }

    public void setGasto(String gasto) {
        this.gasto = gasto;
    }
}
