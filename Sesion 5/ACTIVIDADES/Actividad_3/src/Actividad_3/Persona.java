package Actividad_3;

public class Persona{
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    
    public Persona(int id, String nombre, String apellido){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cuenta=new Cuenta(id);
    }
    //GETS
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public Cuenta getCuenta(){
        return cuenta;
    }
    
    //SETS
    public void setId(int id){
        this.id=id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setCuenta(Cuenta cuenta){
        this.cuenta=cuenta;
    }
    
    @Override
    public String toString(){
        return "Persona{" + "id= "+id+" nombre= "+nombre+" apellido= "+apellido+"}";
    }
}