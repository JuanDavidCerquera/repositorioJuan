package main_;

import clases_.Capturar;

public class Tienda {

    public static void main(String[] args) {

        Integer cantidad, contApr, contDes;
        Double porApr, porDes, nota;

        Capturar cap = new Capturar();

        cap.setMensaje("Digite la cantidad de Aprendices: ");
        double i = cap.capturar();
        cantidad = (int) i;
        i = 0;
        contApr = 0;
        contDes = 0;
        while (i < cantidad) {
            nota = 0.0;
            i++;
            do {
                cap.setMensaje("Digite la nota del aprendiz " + i + ": ");
                nota = cap.capturar();
            } while (nota <= 0 || nota > 100);

            if (nota >= 70) {
                contApr++;
            } else {
                contDes++;
            }
        }

        porApr = (double) (contApr * 100 / cantidad);
        porDes = (double) (contDes * 100 / cantidad);

        System.out.println("De " + cantidad + " aprobo %" + porApr);
        System.out.println("De " + cantidad + " desaprobo %" + porDes);
    }
}
