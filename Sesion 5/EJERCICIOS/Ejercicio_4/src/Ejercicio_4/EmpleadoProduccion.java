package Ejercicio_4;

public class EmpleadoProduccion extends Asalariado{
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, double salarioBase, String turno) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        super.setSalarioBase(salarioBase);
    }
    @Override
    public double getSalarioBase() {
        return super.getSalarioBase()+((15/100)*super.getSalarioBase());
    }

    @Override
    public String toString() {
        return "\nEmpleado de Produccion\n"+super.toString()+"\nTurno      : "+turno;
    }
    
    
}
