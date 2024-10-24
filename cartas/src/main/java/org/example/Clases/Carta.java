package org.example.Clases;

import java.awt.*;

public class Carta {
    private String nombre;
    private int numCarta;
    private int tecnologia;
    private String valor;
    private Seña seña;
    private Especialidad especialidad;
    private String imagen;

    public Carta(String nombre, int numCarta, int tecnologia, String valor, Seña seña, Especialidad especialidad) {
        this.nombre = nombre;
        this.numCarta = numCarta;
        this.tecnologia = tecnologia;
        this.valor = valor;
        this.seña = seña;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public int getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(int tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Seña getSeña() {
        return seña;
    }

    public void setSeña(Seña seña) {
        this.seña = seña;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
