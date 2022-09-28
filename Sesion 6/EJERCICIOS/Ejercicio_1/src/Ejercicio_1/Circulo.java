package Ejercicio_1;

public class Circulo extends FiguraBidimensional{
    
    static final double PI = 3.1416;
    
    public Circulo(double radio) {
        super(radio);
    }

    @Override
    public String toString() {
        return "Circulo :";
    }
    
    public void getArea(){
        double x = PI * (super.getRadio()*super.getRadio());
        System.out.println("El Area del "+ this.toString() + x );
    }
}
