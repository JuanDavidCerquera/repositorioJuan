package clases_.Volumen_;

import clases_.Capturar;

public class Esfera extends Capturar {
    public Double radio;

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double resultado() {
        resultado = ((4 / 3) * Math.PI * Math.pow(this.getRadio(), 3));
        return resultado;
    }
}
