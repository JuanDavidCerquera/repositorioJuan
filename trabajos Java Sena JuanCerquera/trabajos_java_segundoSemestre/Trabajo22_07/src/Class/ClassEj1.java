package Class;

public class ClassEj1 {

    private double persona1;
    private double persona2;
    private double persona3;
    private double total;

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPersona1() {
        return persona1;
    }

    public void setPersona1(double persona1) {
        this.persona1 = persona1;
    }

    public double getPersona2() {
        return persona2;
    }

    public void setPersona2(double persona2) {
        this.persona2 = persona2;
    }

    public double getPersona3() {
        return persona3;
    }

    public void setPersona3(double persona3) {
        this.persona3 = persona3;
    }

    public void setTotal() {
        this.total = this.getPersona1();
    }

    public double getTotal() {
        return this.total;
    }

    public void promedio() {
        this.total = this.getPersona1() + this.getPersona2() + this.getPersona3();
        double promedio[] = new double[3];
        promedio[0] = ((this.getPersona1() * 100) / this.total);
        promedio[1] = ((this.getPersona2() * 100) / this.total);
        promedio[2] = ((this.getPersona3() * 100) / this.total);
        System.out.println("el promedio de la persona 1 es: " + promedio[0] + "%.");
        System.out.println("el promedio de la persona 2 es: " + promedio[1] + "%.");
        System.out.println("el promedio de la persona 3 es: " + promedio[2] + "%.");

    }

}
