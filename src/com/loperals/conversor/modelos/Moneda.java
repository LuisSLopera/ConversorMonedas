package com.loperals.conversor.modelos;

import com.google.gson.annotations.SerializedName;

public class Moneda {
    String monedaOrigen;
    String monedaDestino;
    double valor;

    public Moneda(String monedaOrigen, String monedaDestino, double valor) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.valor = valor;
    }

    public Moneda(MonedaAPI monedaRecord) {
        this.monedaDestino = monedaRecord.base_code();
        this.monedaOrigen= monedaRecord.target_code();
        this.valor=monedaRecord.conversion_rate();
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
