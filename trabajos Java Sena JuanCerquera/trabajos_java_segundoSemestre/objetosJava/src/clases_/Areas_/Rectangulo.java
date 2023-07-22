package clases_.Areas_;

import clases_.Capturar;

public class Rectangulo extends Capturar {

    public Double base;
    public Double altura;

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    @Override
    public Double resultado() {
        resultado = ((this.getAltura()) * (this.getBase()));
        return this.resultado;
    }
}
