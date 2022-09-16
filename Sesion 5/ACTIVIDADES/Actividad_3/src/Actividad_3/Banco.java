package Actividad_3;

import java.util.*;

public class Banco {
    private String nombre;
    private Persona clientes[];
    
    public Banco(String nombre, int numCli){
        this.nombre=nombre;
        this.clientes=new Persona[numCli];
    }
    public Banco(String nombre){
        this.nombre=nombre;
        this.clientes=new Persona[20];
    }

     //METODOS
    public void agregarCliente(Persona persona){
        System.out.println("AGREGANDO CLIENTE...");
        int i;
        for(i=0;i < clientes.length; i++){
            if(clientes[i]==null){
                clientes[i]= new Persona(persona.getId(), persona.getNombre(), persona.getApellido());
                System.out.println(clientes[i].getNombre() +"AGREGADA");
            }
        }
        
    }
    public Persona darBajaCliente(Persona persona){
        System.out.println("ELIMINAR CLIENTE...");
        int i;
        
        for(i=0;i < clientes.length; i++){
            if(buscarCliente(persona)==true){
                System.out.println("USUARIO ELIMINADO...");
                return clientes[i]=null;
            }
        }
        
    }

    public boolean buscarCliente(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banco other = (Banco) obj;
        return Arrays.deepEquals(this.clientes, other.clientes);
    }
    
    //GETS

    public String getNombre() {
        return nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }
    
    //SETS
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", clientes=" + clientes + '}';
    }
    
    
    

    

    
    
    
    
    
    
    
}
