package clases_.Areas_;

import clases_.Capturar;

public class Circunferencia extends Capturar {
    public Double radio;

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    @Override
    public Double resultado() {
        resultado = (Math.PI * Math.pow(getRadio(), 2));
        return this.resultado;
    }
}
// A = π r²