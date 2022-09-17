public class Persona{
    private int id;

    private int numero;
    private String nombre;
    private String apellido;
    private char tipoCliente;
    private Cuenta cuenta;

    
    public Persona(int id,String nombre, String apellido, char tipoCliente){
        if(tipoCliente != 'C' && tipoCliente != 'B' && tipoCliente != 'E')
        {
            this.tipoCliente = 'C';
            this.numero = 1000;
        }
        else
        {
            this.tipoCliente = tipoCliente;
        }
        if (tipoCliente == 'C')
            this.numero = 1000;
        if (tipoCliente == 'B')
            this.numero = 5000;
        if (tipoCliente == 'E')
            this.numero = 8000;
        this.id = id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cuenta=new Cuenta(numero,tipoCliente);
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

    public char getTipoCliente() {
        return tipoCliente;
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

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    //Metodos
    public void depositar(int cantidad)
    {
        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        System.out.println("Su monto actual seria de: " + cuenta.getSaldo() );
    }


    public void retirar(int cantidad)
    {
        if(cuenta.getSaldo() <= 50.0)
            System.out.println("No cuenta con el monto minimo para retirar dinero");
        else{
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
            System.out.println("Su monto actual seria de: " + cuenta.getSaldo() );
        }
    }
    
    @Override
    public String toString(){
        return "Cliente: " + cuenta.getNumero() + "\n"
                + "Tipo: " + tipoCliente + "\n" +
                "Nombres: " + nombre + " " + apellido + "\n" +
                "No. Cuenta: " + tipoCliente + cuenta.getNumero() + "\n" +
                "Saldo: " + cuenta.getSaldo();
    }
}


