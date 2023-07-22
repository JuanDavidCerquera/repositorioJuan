package clases_.Areas_;

import clases_.Capturar;

public class Rombo extends Capturar {

    public Double diagonalMayor;
    public Double diagonalMenor;

    public void setdiagonalMayor(Double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setdiagonalMenor(Double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public Double getdiagonalMayor() {
        return diagonalMayor;
    }

    public Double getdiagonalMenor() {
        return diagonalMenor;
    }

    @Override
    public Double resultado() {
        resultado = ((this.getdiagonalMayor()) * (this.getdiagonalMenor()));
        return this.resultado;
    }
}
