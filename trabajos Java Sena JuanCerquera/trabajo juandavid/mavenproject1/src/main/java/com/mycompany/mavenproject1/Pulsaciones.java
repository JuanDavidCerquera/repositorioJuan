/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Ambiente 209-2
 */
public class Pulsaciones {
    private double edad;
    private double pulsaciones;
    private double segundo;

    public double getEdad() {
        return edad;
    }

    public double getSegundo() {
        return segundo;
    }

    public void setSegundo(double segundo) {
        this.segundo = segundo;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getPulsaciones() {
        return pulsaciones;
    }

    public void setPulsaciones(double pulsaciones) {
        this.pulsaciones = pulsaciones;
    }
    
    public Double mostrar(){
        this.pulsaciones = ((220-this.getEdad())/this.getSegundo());
        return this.getPulsaciones();
    }
    
    
}
