package Class;

import java.util.Scanner;

public class ClaseCapturar {
    private String mensaje;

    public double capturar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el valor");
        double numero = sc.nextDouble();
        return numero;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        System.out.println(mensaje);
    }

}
