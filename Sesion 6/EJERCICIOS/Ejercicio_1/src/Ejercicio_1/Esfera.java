package Ejercicio_1;
import java.text.DecimalFormat;
public class Esfera extends FiguraTridimensional{
    DecimalFormat df = new DecimalFormat("#.000");
    static final double PI = 3.1416;
    
    public Esfera(double lado) {
        super(lado);
    }
    @Override
    public String toString() {
        return "Esfera: ";
    }
    @Override
    public void getArea(){
        double x = 4*PI*Math.pow(super.getLado(), 2);
        System.out.println("El Area del "+ this.toString() + df.format(x) );
    }
    @Override
    public void getVolumen(){
        double x = (4/3)*PI*Math.pow(super.getLado(), 3);
        System.out.println("El Volumen del "+ this.toString() + df.format(x) );
    }
    
    
    
}
