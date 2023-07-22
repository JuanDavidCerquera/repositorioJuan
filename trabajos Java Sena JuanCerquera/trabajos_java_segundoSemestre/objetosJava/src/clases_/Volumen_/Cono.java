package clases_.Volumen_;

import clases_.Capturar;

public class Cono extends Capturar {
    public Double radio;
    public Double altura;

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double resultado() {
        resultado = (Math.PI * Math.pow(this.getRadio(), 2) * (this.getAltura() / 3));
        return this.resultado;
    }
}
