public class Cuenta{
    private int numero;
    private double saldo;
    private char tipoCliente;
    
    public Cuenta(int numero, double saldo, char tipoCliente){
        this.numero=numero;
        this.saldo=saldo;
    }
    public Cuenta(int numero,char cliente){
        this(numero,50, cliente);
    }
    
    //GETS
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    //SETS
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    @Override
    public String toString(){
        return "Cuenta{" + "numero= "+numero+" saldo= "+saldo+"}";
    }
}
