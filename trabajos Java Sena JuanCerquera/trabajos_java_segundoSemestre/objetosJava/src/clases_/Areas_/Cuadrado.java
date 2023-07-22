package clases_.Areas_;

import clases_.Capturar;

public class Cuadrado extends Capturar {
    public Double base;

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getBase() {
        return base;
    }

    @Override
    public Double resultado() {
        resultado = ((this.getBase()) * (this.getBase()));
        return this.resultado;
    }
}
