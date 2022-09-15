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
        System.out.println("CLIENTE AGREGADO");
        this.
    }
    public Persona darBajaCliente(Persona persona){
        for(int i=0;i<=clientes.length;i++){
            if(clientes[i]==){
                
        }
    }
    
    public void clientesTipo(char tipo){
        
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
