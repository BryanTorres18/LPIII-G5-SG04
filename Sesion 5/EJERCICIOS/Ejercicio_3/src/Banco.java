import java.util.*;

public class Banco {
    private String nombre;
    private Persona clientes[];
    private Persona eliminar;
    
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
                clientes[i]= new Persona(persona.getId(), persona.getNombre(), persona.getApellido(), persona.getCuenta().getTipoCliente());
                System.out.println(clientes[i].getNombre() +"AGREGADA");
                break;
            }
        }
        
    }
    public Persona darBajaCliente(Persona persona){
        System.out.println("ELIMINAR CLIENTE...");
        for(int i=0 ;i < clientes.length; i++){
            if(buscarCliente(persona)){
                System.out.println("USUARIO ELIMINADO...");
                eliminar = clientes[i];
                return clientes[i]=null;
            }
        }
        return eliminar;
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

    public void clienteTipo(){
        Persona A[] = new Persona[20];
        Persona B[] = new Persona[20];;
        Persona E[] = new Persona[20];
        for(int i=0 ;i < clientes.length; i++){
            if(clientes[i].getTipoCliente() == 'C')
                A[i] = clientes[i];
            if(clientes[i].getTipoCliente() == 'B')
                B[i] = clientes[i];
            if(clientes[i].getTipoCliente() == 'E')
                E[i] = clientes[i];
            }
        for(int i=0 ;i < A.length; i++)
            System.out.println("Cliente tipo A: " + A[i]);
        for(int i=0 ;i < B.length; i++)
            System.out.println("Cliente tipo B: " + B[i]);
        for(int i=0 ;i < E.length; i++)
            System.out.println("Cliente tipo E: " + E[i]);
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
