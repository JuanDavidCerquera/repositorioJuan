package main_;

import clases_.Capturar;
import clases_.Areas_.Circunferencia;
import clases_.Areas_.Cuadrado;
import clases_.Areas_.Rectangulo;
import clases_.Areas_.Rombo;
import clases_.Areas_.Trapecio;
import clases_.Areas_.Triangulo;

public class Areas {
    public static void main(String[] args) {

        int opcion;

        Capturar capturar = new Capturar();
        Triangulo triangulo = new Triangulo();
        Trapecio trapecio = new Trapecio();
        Rombo rombo = new Rombo();
        Rectangulo rectangulo = new Rectangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circunferencia circunferencia = new Circunferencia();
        do {
            System.out.println("-----------------------------------------");
            System.out.println("esta es la lista de figuras.");
            System.out.println("1- Triangulo.");
            System.out.println("2- trapecio.");
            System.out.println("3- rombo.");
            System.out.println("4- rectangulo.");
            System.out.println("5- cuadrado.");
            System.out.println("6- circunferencia.");
            System.out.println("7- Terminar programa.");
            capturar.setMensaje("ejija a cual desea hallar el area.");
            double i = capturar.capturar();
            opcion = (int) i;

            switch (opcion) {
                case 1: // triangulo
                    capturar.setMensaje("digite la altura del triangulo en metros");
                    triangulo.setAltura(capturar.capturar());
                    capturar.setMensaje("digite la base del triangulo en metros");
                    triangulo.setBase(capturar.capturar());
                    System.out
                            .println("el area del triangulo es de: " + triangulo.resultado() + " en metros cuadrados.");
                    break;
                case 2: // trapecio
                    capturar.setMensaje("digite la base mayor del trapecio en metros");
                    trapecio.setBaseMayor(capturar.capturar());
                    capturar.setMensaje("digite la base menor del trapecio en metros");
                    trapecio.setBaseMenor(capturar.capturar());
                    capturar.setMensaje("digite la altura del trapecio en metros");
                    trapecio.setAltura(capturar.capturar());
                    System.out.println("el area del trapecio es de: " + trapecio.resultado() + " en metros cuadrados.");
                    break;
                case 3: // rombo
                    capturar.setMensaje("digite la diagonal mayor del rombo en metros");
                    rombo.setdiagonalMayor(capturar.capturar());
                    capturar.setMensaje("digite la diagonal menor del rombo en metros");
                    rombo.setdiagonalMenor(capturar.capturar());
                    System.out.println("el area del rombo es de: " + rombo.resultado() + " en metros cuadrados.");
                    break;
                case 4:// RECTANGULO
                    capturar.setMensaje("digite la altura del rectangulo en metros");
                    rectangulo.setAltura(capturar.capturar());
                    capturar.setMensaje("digite la base del rectangulo en metros");
                    rectangulo.setBase(capturar.capturar());
                    System.out.println(
                            "el area del rectangulo es de: " + rectangulo.resultado() + " en metros cuadrados.");
                    break;
                case 5:// cuadrado
                    capturar.setMensaje("digite la base del cuadrado en metros");
                    cuadrado.setBase(capturar.capturar());
                    System.out.println("area del cuadrado es de: " + cuadrado.resultado() + " en metros cuadrados.");
                    break;
                case 6:// circunferencia
                    capturar.setMensaje("digite el radio de la circunferencia en metros");
                    circunferencia.setRadio(capturar.capturar());
                    System.out.println("el area del circunferencia es de: " + circunferencia.resultado()
                            + " en metros cuadrados.");
                    break;
                case 7:
                    System.out.println("fin del programa");
                    break;
                default:
                    System.out.println("opcion no valida");
                    System.out.println("vuelva a escoger una opcion");
                    System.out.println("-----------------------------------------");
            }
        } while (opcion != 7);
    }
}
