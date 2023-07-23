package View;

import Class.ClassEj1;

public class ViewEj1 {
    public static void main(String[] args) {
        Integer mes;
        Double inversion;
        Double porcentaje;

        mes = 12;
        inversion = 100.0;
        porcentaje = 0.05;

        ClassEj1 ej1 = new ClassEj1(mes, inversion, porcentaje);
        ej1.Mostrar();

        ClassEj1 obj2 = new ClassEj1(10, 1200.0, 0.1);
        obj2.Mostrar();
    }
}