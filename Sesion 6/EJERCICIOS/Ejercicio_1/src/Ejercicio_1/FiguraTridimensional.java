package Ejercicio_1;

public class FiguraTridimensional extends Figura{
    private double lado;
    private double radio;

    public FiguraTridimensional(double lado, double radio) {
        this.lado = lado;
        this.radio = radio;
    }

    public FiguraTridimensional(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getRadio() {
        return radio;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void getArea() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getVolumen() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
