package Ejercicio_1;

class FiguraBidimensional extends Figura{

    private double base;
    private double altura;
    private double radio;
    
    public FiguraBidimensional(double radio) {
        this.radio = radio;
    }

    public FiguraBidimensional(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
       

    public double getBase() {
        return base;
        
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
