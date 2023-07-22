package clases_.Areas_;

import clases_.Capturar;

public class Trapecio extends Capturar {
    public Double baseMenor;
    public Double baseMayor;
    public Double altura;

    public Double getAltura() {
        return altura;
    }

    public Double getBaseMayor() {
        return baseMayor;
    }

    public Double getBaseMenor() {
        return baseMenor;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBaseMayor(Double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(Double baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public Double resultado() {
        resultado = (((this.getBaseMenor()) + (this.getBaseMayor())) * this.getAltura()) / 2;
        return this.resultado;
    }

}
