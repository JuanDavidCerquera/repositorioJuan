/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_2_6;

/**
 *
 * @author Ambiente 209-2
 */
public class NewClass {
    private Double lunes;
    private Double miercoles;
    private Double viernes;
    private Double tiempo;
    

    public Double getLunes() {
        return lunes;
    }

    public void setLunes(Double lunes) {
        this.lunes = lunes;
    }

    public Double getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(Double miercoles) {
        this.miercoles = miercoles;
    }

    public Double getViernes() {
        return viernes;
    }

    public void setViernes(Double viernes) {
        this.viernes = viernes;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }
    
public Double tiempototal(){
    this.tiempo=((this.getLunes()+this.getMiercoles()+this.getViernes())/3);
    return this.tiempo;
}
    
    
}
