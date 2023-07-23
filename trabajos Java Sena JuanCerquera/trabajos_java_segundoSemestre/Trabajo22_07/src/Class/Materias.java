package Class;

import java.util.Scanner;

public class Materias {

    public void Materia() {

        Scanner sc = new Scanner(System.in);
        System.out.println("escriba la cantidad de materias");
        int cantidadMaterias = sc.nextInt();
        double promedioTotal = 0;
        for (int m = 0; m < cantidadMaterias; m++) {
            System.out.println("diga que materia es la que quiere hallar el promedio");
            String nombreMateria = sc.next();
            System.out.println("-----------------------------------------------------");
            System.out.println("escriba la cantidad de tareas de esta materia");
            int cantidad = sc.nextInt();
            int notas[] = new int[cantidad];
            double valnota = 0;
            for (int i = 0; i < cantidad; i++) {
                System.out.println("escriba el valor de la nota:" + (i + 1));
                notas[i] = sc.nextInt();
                valnota = valnota + notas[i];
            }
            valnota = valnota / cantidad;
            System.out.println("escriba el porcentaje de las notas");
            double porcNotas = (double) sc.nextInt() / 100;
            System.out.println("escriba la nota del examen");
            double notaexamen = sc.nextInt();
            System.out.println("escriba el porcentaje del examen");
            double porcExamen = (double) sc.nextInt() / 100;
            double promedioExamen = notaexamen * porcExamen;
            double promedioTareas = valnota * porcNotas;
            double promedio = promedioExamen + promedioTareas;
            System.out.println("el promedio de " + nombreMateria + " es: " + promedio);
            promedioTotal = promedioTotal + promedio;
        }
        promedioTotal = promedioTotal / cantidadMaterias;
    }
    /*
     * Scanner sc = new Scanner(System.in);
     * System.out.println("----------------------------------");
     * System.out.println("        MATEMATICAS         ");
     * System.out.println("escriba la cantidad de tareas de esta materia");
     * int cantidad = sc.nextInt();
     * int notas[] = new int[cantidad];
     * double valnota = 0;
     * for (int i = 0; i < cantidad; i++) {
     * System.out.println("escriba el valor de la nota:" + (i + 1));
     * notas[i] = sc.nextInt();
     * valnota = valnota + notas[i];
     * }
     * valnota = valnota / cantidad;
     * System.out.println("escirba el valor del examen");
     * double promedioExamen = sc.nextInt() * 0.9;
     * double promedioTareas = valnota * 0.1;
     * double promedio = promedioExamen + promedioTareas;
     * System.out.println("el promedio de matematicas es: " + promedio);
     * // En esta materia se pidió un total de tres tareas.
     * }
     */
    /*
     * public void Fisica() {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("----------------------------------");
     * System.out.println("        FISICA         ");
     * System.out.println("escriba la cantidad de tareas de esta materia");
     * int cantidad = sc.nextInt();
     * int notas[] = new int[cantidad];
     * double valnota = 0;
     * for (int i = 0; i < cantidad; i++) {
     * System.out.println("escriba el valor de la nota:" + (i + 1));
     * notas[i] = sc.nextInt();
     * valnota = valnota + notas[i];
     * }
     * valnota = valnota / cantidad;
     * System.out.println("escirba el valor del examen");
     * double promedioExamen = sc.nextInt() * 0.8;
     * double promedioTareas = valnota * 0.2;
     * double promedio = promedioExamen + promedioTareas;
     * System.out.println("el promedio de matematicas es: " + promedio);
     * // En esta materia se pidió un total de dos tareas.
     * }
     * 
     * public void Quimica() {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("----------------------------------");
     * System.out.println("        QUIMICA         ");
     * System.out.println("escriba la cantidad de tareas de esta materia");
     * int cantidad = sc.nextInt();
     * int notas[] = new int[cantidad];
     * double valnota = 0;
     * for (int i = 0; i < cantidad; i++) {
     * System.out.println("escriba el valor de la nota:" + (i + 1));
     * notas[i] = sc.nextInt();
     * valnota = valnota + notas[i];
     * }
     * valnota = valnota / cantidad;
     * System.out.println("escirba el valor del examen");
     * double promedioExamen = sc.nextInt() * 0.85;
     * double promedioTareas = valnota * 0.15;
     * double promedio = promedioExamen + promedioTareas;
     * System.out.println("el promedio de matematicas es: " + promedio);
     * 
     * // En esta materia se pidió un promedio de tres tareas.
     * }
     * 
     * protected void promedio() {
     * 
     * }
     * 
     * protected double getPromedioGeneral() {
     * return promedioGeneral;
     * }
     */
}
