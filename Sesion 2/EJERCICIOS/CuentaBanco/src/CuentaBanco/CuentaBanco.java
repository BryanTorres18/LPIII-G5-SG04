package CuentaBanco;

public class CuentaBanco {
    private String titular;
    private double cantidad;
    public CuentaBanco(String titular){
        this.titular = titular;
        this.cantidad = 5.00;
    }
    public CuentaBanco(){
        this.titular = "Grupo_04";
        this.cantidad = 5.00;
    }
    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }
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
    
    public double ingresar(double cantidad){
        if(cantidad<0.00)
            return 0.00;
        else
            return cantidad;
    }
    public double retirar(double cantidad){
        this.cantidad = this.cantidad - cantidad;
        if(this.cantidad<=0)
            return 0;
        else
            return this.cantidad;
    }
}
