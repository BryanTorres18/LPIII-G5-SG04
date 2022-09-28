public class Prestamo implements PorPagar{
    private int numeroDeCuotas;
    private double montoDeCuotas;

    public Prestamo(int numeroDeCuotas, double montoDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuotas = montoDeCuotas;
    }

    //Getter y Setter
    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public double getMontoDeCuotas() {
        return montoDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public void setMontoDeCuotas(double montoDeCuotas) {
        this.montoDeCuotas = montoDeCuotas;
    }

    @Override
    public double obtenerMontoPago() {
        return getMontoDeCuotas() * getNumeroDeCuotas();
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "numeroDeCuotas=" + numeroDeCuotas +
                ", montoDeCuotas=" + montoDeCuotas +
                '}';
    }
}
