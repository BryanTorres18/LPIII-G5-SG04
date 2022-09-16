package Actividad_1;

public class Cuenta{
    private int numero;
    private double saldo;
    private char tipoCliente = 'C';
    
    public Cuenta(int numero, double saldo){
        this.numero=numero;
        this.saldo=saldo;
    }
    public Cuenta(int numero){
        this(numero, 0);
    }
    
    //GETS
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    
    //SETS
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    @Override
    public String toString(){
        return "Cuenta{" + "numero= "+numero+" saldo= "+saldo+"}";
    }
}
