
package Asalariado;

public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;

    public Asalariado(String nombre, long dni, int diasVacaciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
    }
    
    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }
}

