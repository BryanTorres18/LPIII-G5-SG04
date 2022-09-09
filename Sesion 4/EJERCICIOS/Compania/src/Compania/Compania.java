package Compania;

public class Compania {
    int vendedores;
    int productos;
    
    //Constructor
    public Compania(int vendedores, int productos){
        this.vendedores = vendedores;
        this.productos = productos;
    }
    
    //Get
    public int getVendedores(){
        return vendedores;
    }
     public int getProductos(){
         return productos;
     }
    
}
