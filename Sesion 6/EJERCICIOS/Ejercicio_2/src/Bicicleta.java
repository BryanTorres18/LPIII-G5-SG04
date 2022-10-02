public class Bicicleta implements ImpactoEcologico{
    //Datos de la bicicleta
    private String tipo;
    private String tipo_persona;
    //Datos de la actividad
    private double factordeEmision;
    private double contaminacionporinportacion;
    private double usodePlasticos;

    public Bicicleta(String tipo, String tipo_persona, double factordeEmision, double contaminacionporinportacion, double usodePlasticos) {
        this.tipo = tipo;
        this.tipo_persona = tipo_persona;
        this.factordeEmision = factordeEmision;
        this.contaminacionporinportacion = contaminacionporinportacion;
        this.usodePlasticos = usodePlasticos;
    }

    //Getter y Setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public double getFactordeEmision() {
        return factordeEmision;
    }

    public void setFactordeEmision(double factordeEmision) {
        this.factordeEmision = factordeEmision;
    }

    public double getContaminacionporinportacion() {
        return contaminacionporinportacion;
    }

    public void setContaminacionporinportacion(double contaminacionporinportacion) {
        this.contaminacionporinportacion = contaminacionporinportacion;
    }

    public double getUsodePlasticos() {
        return usodePlasticos;
    }

    public void setUsodePlasticos(double usodePlasticos) {
        this.usodePlasticos = usodePlasticos;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return (usodePlasticos + contaminacionporinportacion) * factordeEmision;
    }

    @Override
    public String toString() {
        return "Bicicleta:" +
                "\nTipo de Bicicleta: " + tipo +
                "\nPersona Destinada: " + tipo_persona +
                "\nDatos de Actividad: " +
                "\nFactor de Emision: " + factordeEmision +
                "\nContaminacion por inportacion de la bicicleta: " + contaminacionporinportacion +
                "\nUso de plastico en su produccion: " + usodePlasticos;
    }
}
