package Ejercicio_1;
import java.text.DecimalFormat;
public class Cubo extends FiguraTridimensional{
DecimalFormat df = new DecimalFormat("#.000");
    public Cubo(double lado) {
        super(lado);
    }

    @Override
    public String toString() {
        return "Cubo: ";
    }
    @Override
    public void getArea(){
        double x = 6*Math.pow(super.getLado(), 2);        
        System.out.println("El Area del "+ this.toString() + df.format(x) );
    }
    @Override
    public void getVolumen(){
        double x = Math.pow(super.getLado(), 3);
        System.out.println("El Volumen del "+ this.toString() + df.format(x) );
    }
    
}
