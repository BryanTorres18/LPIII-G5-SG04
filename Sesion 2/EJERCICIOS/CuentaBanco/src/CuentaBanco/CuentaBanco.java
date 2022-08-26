package CuentaBanco;

public class CuentaBanco {
    private String titular;
    private double cantidad;
    public CuentaBanco(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }
    public CuentaBanco(String titular, double cantidad){
        this.titular = titular;
        if(cantidad<0)
            this.cantidad = 0;
        else
            this.cantidad = cantidad;
    }
    //GETS
    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    
    //SETS
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    
    @Override
    public String toString() {
        return "CuentaBanco{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public void ingresar(double cantidad){
        if(cantidad>0)
            this.cantidad = this.cantidad + cantidad;
        else
            this.cantidad = this.cantidad + 0;
    }
    
    public void retirar(double cantidad){
        if((this.cantidad - cantidad)>0)
            this.cantidad = 0;
        else
            this.cantidad = this.cantidad - cantidad;
    }
}
