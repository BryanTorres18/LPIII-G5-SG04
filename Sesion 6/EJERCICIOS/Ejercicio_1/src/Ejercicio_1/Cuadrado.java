package Ejercicio_1;
import java.text.DecimalFormat;
public class Cuadrado extends FiguraBidimensional{
    DecimalFormat df = new DecimalFormat("#.000");
    public Cuadrado(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public String toString() {
        return "Cuadrado :";
    }
    @Override
    public void getArea(){
        double x = super.getBase()*super.getAltura();
        System.out.println("El Area del "+ this.toString() + df.format(x) );
    }
}
