package Ejercicio_4;

public class EmpleadoDistribucion extends Asalariado {
    private String zona;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase, String zona) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    @Override
    public void setSalarioBase(double salarioBase) {
        super.setSalarioBase(salarioBase);
    }
      
    
    @Override
    public double getSalarioBase() {
        return super.getSalarioBase()+((10/100)*super.getSalarioBase());
    }

    @Override
    public String toString() {
        return "\nEmpleado de Distribucion\n" + super.toString() + "\nZona      : "+zona;
    }
    
    
}
