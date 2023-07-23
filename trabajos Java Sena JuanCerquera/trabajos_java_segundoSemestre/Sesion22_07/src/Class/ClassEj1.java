
package Class;

public class ClassEj1 {
    private Integer mes;
    private Double inversion;
    private Double porcentaje;
    private Double total;

    public ClassEj1() {
    }

    public ClassEj1(Integer mes, Double inversion, Double porcentaje) {
        this.mes = mes;
        this.inversion = inversion;
        this.porcentaje = porcentaje;
    }

    public void Mostrar() {
        this.total = inversion * Math.pow(1 + porcentaje, mes);
        System.out.println(this.total);
    }
}