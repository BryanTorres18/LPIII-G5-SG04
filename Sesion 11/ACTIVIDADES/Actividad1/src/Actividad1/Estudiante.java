package Actividad1;

public class Estudiante extends Persona{
    private String especialidad; 
    private Procedencia p;

    public Estudiante(String especialidad, Procedencia p, 
            String nombres, String direccion, String telefono) {
        super(nombres, direccion, telefono);
        this.especialidad = especialidad;
        this.p = p;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Procedencia getP() {
        return p;
    }
    
    
}
