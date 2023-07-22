package clases_.Volumen_;

import clases_.Capturar;

public class Cubo extends Capturar {

    public Double base;
    public Double altura;
    public Double profundidad;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public Double resultado() {
        resultado = (this.getAltura() * this.getBase() * this.getProfundidad());
        return this.resultado;
    }
}
