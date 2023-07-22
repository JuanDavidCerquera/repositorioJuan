/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Ambiente 209-2
 */
public class Pulsaciones {
 public Double edad;
public Double pulsaciones;

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public Double getPulsaciones() {
        return pulsaciones;
    }

    public void setPulsaciones(Double pulsaciones) {
        this.pulsaciones = pulsaciones;
    }

public Double mostrar(){
    
    this.pulsaciones=((220-this.getEdad())/10);
            return this.pulsaciones;
}
    
 
 
}
