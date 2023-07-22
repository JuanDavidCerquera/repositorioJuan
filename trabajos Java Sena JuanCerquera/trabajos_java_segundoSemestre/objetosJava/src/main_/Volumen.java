package main_;

import clases_.Capturar;
import clases_.Volumen_.Cilindro;
import clases_.Volumen_.Cono;
import clases_.Volumen_.Cubo;
import clases_.Volumen_.Esfera;

public class Volumen {
    public static void main(String[] args) {
        int opcion = 0;
        Capturar capturar = new Capturar();
        do {
            System.out.println("-----------------------------------------");
            System.out.println("esta es la lista de figuras.");
            System.out.println("1- Cubo.");
            System.out.println("2- Esfera.");
            System.out.println("3- Cilindro.");
            System.out.println("4- Cono.");
            System.out.println("5- Terminar programa.");
            capturar.setMensaje("ejija a cual desea hallar el volumen.");
            double i = capturar.capturar();
            opcion = (int) i;
            switch (opcion) {
                case 1:
                    Cubo cubo = new Cubo();
                    capturar.setMensaje("Ingrese la altura en metros");
                    cubo.setAltura(capturar.capturar());
                    capturar.setMensaje("Ingrese la base en metros");
                    cubo.setBase(capturar.capturar());
                    capturar.setMensaje("Ingrese la profundidad en metros");
                    cubo.setProfundidad(capturar.capturar());
                    System.out.println("Volumen del cubo: " + cubo.resultado() + " metros cubicos.");
                    break;
                case 2:
                    Esfera esfera = new Esfera();
                    capturar.setMensaje("Ingrese el radio en metros");
                    esfera.setRadio(capturar.capturar());
                    System.out.println("Volumen de la esfera: " + esfera.resultado() + " metros cubicos.");
                    break;
                case 3:
                    Cilindro cilindro = new Cilindro();
                    capturar.setMensaje("Ingrese el radio en metros");
                    cilindro.setRadio(capturar.capturar());
                    capturar.setMensaje("Ingrese la altura en metros");
                    cilindro.setAltura(capturar.capturar());
                    System.out.println("Volumen del cilindro: " + cilindro.resultado() + " metros cubicos.");
                    break;
                case 4:
                    Cono cono = new Cono();
                    capturar.setMensaje("Ingrese el radio en metros");
                    cono.setRadio(capturar.capturar());
                    capturar.setMensaje("Ingrese la altura en metros");
                    cono.setAltura(capturar.capturar());
                    System.out.println("Volumen del cono: " + cono.resultado() + " metros cubicos.");
                    break;
                case 5:
                    System.out.println("fin del programa");
                    break;
                default:
                    System.out.println("opcion no valida");
                    System.out.println("vuelva a escoger una opcion");
                    System.out.println("-----------------------------------------");
            }
        } while (opcion != 5);
    }
}
