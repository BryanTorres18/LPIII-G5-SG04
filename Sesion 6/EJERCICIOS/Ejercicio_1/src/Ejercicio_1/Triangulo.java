package Ejercicio_1;

public class Triangulo extends FiguraBidimensional{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public String toString() {
        return "Triangulo :";
    }
    
    public void getArea(){
        double x = (super.getBase()*super.getAltura())/2;
        System.out.println("El Area del "+ this.toString() + x );
    }
}
