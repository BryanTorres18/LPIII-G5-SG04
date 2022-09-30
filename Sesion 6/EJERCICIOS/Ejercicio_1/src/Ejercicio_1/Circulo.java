package Ejercicio_1;
import java.text.DecimalFormat;
public class Circulo extends FiguraBidimensional{
    DecimalFormat df = new DecimalFormat("#.000");
    static final double PI = 3.1416;
    
    public Circulo(double radio) {
        super(radio);
    }

    @Override
    public String toString() {
        return "Circulo :";
    }
    @Override
    public void getArea(){
        double x = PI * Math.pow(super.getRadio(), 2);
        System.out.println("El Area del "+ this.toString() + df.format(x) );
    }
}
