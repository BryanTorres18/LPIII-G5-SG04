package Ejercicio_1;
import java.text.DecimalFormat;
public class Tetraedro extends FiguraTridimensional{
    DecimalFormat df = new DecimalFormat("#.000");
    public Tetraedro(double lado) {
        super(lado);
    }

    @Override
    public String toString() {
        return "Tetaedro: ";
    }
    @Override
    public void getArea(){
        double x = Math.pow(super.getLado(), 2)*Math.sqrt(3);
        System.out.println("El Area del "+ this.toString() + df.format(x) );
    }
    @Override
    public void getVolumen(){
        double x = Math.pow(super.getLado(), 3)*(Math.sqrt(2)/12);
        System.out.println("El Volumen del "+ this.toString() + df.format(x) );
    }
    
}