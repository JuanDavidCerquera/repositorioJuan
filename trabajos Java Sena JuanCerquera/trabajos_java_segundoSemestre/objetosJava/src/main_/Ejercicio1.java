package main_;

import java.util.Arrays;

import clases_.Capturar;

public class Ejercicio1 {

    public static void main(String[] args) {

        Capturar x = new Capturar();
        Double a[], b[], c[];
        int cantidad, i;

        x.setMensaje("Digite el tamaño para los vectores a,b y c.");
        double cant = x.capturar();
        cantidad = (int) cant;
        a = new Double[cantidad];
        b = new Double[cantidad];
        c = new Double[cantidad];

        for (i = 0; i < cantidad; i++) {
            x.setMensaje("A[" + i + "]:");
            a[i] = x.capturar();
        }

        for (i = 0; i < cantidad; i++) {
            x.setMensaje("B[" + i + "]:");
            b[i] = x.capturar();
        }

        for (i = 0; i < cantidad; i++) {
            c[i] = a[i] + b[i];
        }

        // Salida del programa
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
