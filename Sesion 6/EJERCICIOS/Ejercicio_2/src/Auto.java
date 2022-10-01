public class Auto implements ImpactoEcologico {
    //Datos del Auto
    private String marca;
    private String modelo;
    private int tiempodeVida;
    //Datos de Actividad
    private double factordeEmision;
    private double gasolinausadaxdia;
    private double usodemateriales;

    public Auto(String marca, String modelo, int tiempodeVida, double factordeEmision, double gasolinausadaxdia, double usodemateriales) {
        this.marca = marca;
        this.modelo = modelo;
        this.tiempodeVida = tiempodeVida;
        this.factordeEmision = factordeEmision;
        this.gasolinausadaxdia = gasolinausadaxdia;
        this.usodemateriales = usodemateriales;
    }

    //Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTiempodeVida() {
        return tiempodeVida;
    }

    public void setTiempodeVida(int tiempodeVida) {
        this.tiempodeVida = tiempodeVida;
    }

    public double getFactordeEmision() {
        return factordeEmision;
    }

    public void setFactordeEmision(double factordeEmision) {
        this.factordeEmision = factordeEmision;
    }

    public double getGasolinausadaxdia() {
        return gasolinausadaxdia;
    }

    public void setGasolinausadaxdia(double gasolinausadaxdia) {
        this.gasolinausadaxdia = gasolinausadaxdia;
    }

    public double getUsodemateriales() {
        return usodemateriales;
    }

    public void setUsodemateriales(double usodemateriales) {
        this.usodemateriales = usodemateriales;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return (((tiempodeVida * 365) * gasolinausadaxdia) + usodemateriales) * factordeEmision;
    }

    @Override
    public String toString() {
        return "Auto:" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nTiempo de Uso(Años):" + tiempodeVida +
                "\n================================================" +
                "\nDatos de Actividad: " +
                "\nFactor de Emision: " + factordeEmision +
                "\nGasolina Usada por Dia: " + gasolinausadaxdia +
                "\nUso de Materiales de Fabricacion: " + usodemateriales;
    }
}
