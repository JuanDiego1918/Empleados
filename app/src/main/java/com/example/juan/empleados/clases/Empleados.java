package com.example.juan.empleados.clases;

import java.io.Serializable;

public class Empleados implements Serializable {


    private int añosDeTrabajo;
    private String dependencia;
    private String titulos;
    private String nombre;
    private String cedula;
    private String genero;

    public Empleados() {
    }

    public Empleados(int añosDeTrabajo, String dependencia, String titulos, String nombre, String cedula, String genero) {
        this.añosDeTrabajo = añosDeTrabajo;
        this.dependencia = dependencia;
        this.titulos = titulos;
        this.nombre = nombre;
        this.cedula = cedula;
        this.genero = genero;
    }

    public int getAñosDeTrabajo() {
        return añosDeTrabajo;
    }

    public void setAñosDeTrabajo(int añosDeTrabajo) {
        this.añosDeTrabajo = añosDeTrabajo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
