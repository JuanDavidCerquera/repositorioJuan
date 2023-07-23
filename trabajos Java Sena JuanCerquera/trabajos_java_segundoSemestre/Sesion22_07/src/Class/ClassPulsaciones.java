package Class;

public class ClassPulsaciones {

    private int edad;
    private double pulsaciones;

    public ClassPulsaciones() {
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPulsaciones() {
        return this.pulsaciones;
    }

    private void setPulsaciones(double pulsaciones) {
        this.pulsaciones = pulsaciones;
    }

    public Double Mostrar() {
        this.setPulsaciones((220 - this.getEdad()) / 10);
        return this.getPulsaciones();
    }

}