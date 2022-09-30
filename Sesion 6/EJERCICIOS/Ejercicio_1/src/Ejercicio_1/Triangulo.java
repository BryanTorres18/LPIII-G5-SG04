package Ejercicio_1;
import java.text.DecimalFormat;
public class Triangulo extends FiguraBidimensional{
    DecimalFormat df = new DecimalFormat("#.000");
    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public String toString() {
        return "Triangulo :";
    }
    @Override
    public void getArea(){
        double x = (super.getBase()*super.getAltura())/2;
        System.out.println("El Area del "+ this.toString() + df.format(x) );
    }
}
