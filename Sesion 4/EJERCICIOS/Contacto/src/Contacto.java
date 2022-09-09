public class Contacto {
    String nombre;
    String telefono;
    String direccion;

    //Constructor
    public Contacto(String nombre, String telefono, String direccion)
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //Getters
    public String getNombre()
    {
        return nombre;
    }
    public String getTelefono()
    {
        return telefono;
    }

    public String getDireccion()
    {
        return direccion;
    }

    //Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
}
