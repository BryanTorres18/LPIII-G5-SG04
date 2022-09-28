public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objPorPagar = new PorPagar[5];

        objPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-111",
                800.00);
        objPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-1111", 1200.00);
        objPorPagar[4] = new Prestamo(10, 582.50);

        System.out.println("Facturas y Empleados procesados en forma polimorfica: \n");

        for(PorPagar porPagarActual : objPorPagar)
        {
            System.out.printf("%s \n%s: $%,.2f\n\n", porPagarActual.toString(), "Pago vencido", porPagarActual.obtenerMontoPago());
        }
    }
}
