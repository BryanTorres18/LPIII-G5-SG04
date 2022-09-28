package Ejercicio_1;

public class Cuadrado extends FiguraBidimensional{

    public Cuadrado(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public String toString() {
        return "Cuadrado :";
    }
    
    public void getArea(){
        double x = super.getBase()*super.getAltura();
        System.out.println("El Area del "+ this.toString() + x );
    }
}
