package Asalariado;

public class EmpleadoProduccion extends Asalariado{
    private String turno;

    public EmpleadoProduccion(String turno, String nombre, long dni, int diasVacaciones) {
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
    }
    
    //Getter y Setter

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
}
