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
    
    public void ingresar(double cantidad){
        
    }
    public void retirar(double cantidad){
        
    }
}
