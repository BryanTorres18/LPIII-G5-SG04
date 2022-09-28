public class Factura implements PorPagar
{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    //Getter y Setter

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    @Override
    public double obtenerMontoPago() {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroPieza='" + numeroPieza + '\'' +
                ", descripcionPieza='" + descripcionPieza + '\'' +
                ", cantidad=" + cantidad +
                ", precioPorArticulo=" + precioPorArticulo +
                '}';
    }
}
