package View;

import Class.ClaseCapturar;
import Class.ClassEj1;

public class ViewEj1 {
    public static void main(String[] args) {
        ClassEj1 inversion = new ClassEj1();
        ClaseCapturar capturar = new ClaseCapturar();
        capturar.setMensaje("escriba que valor que cada persona puso ");
        // inversion.setCantidad((int) capturar.capturar());
        // for(int i = 0;i<inversion.getCantidad();i++){}
        inversion.setPersona1(capturar.capturar());
        inversion.setPersona2(capturar.capturar());
        inversion.setPersona3(capturar.capturar());
        inversion.promedio();
    }
}