package Actividad_3;
public class TestAsociacion {
    public static void main(String[] args){
        Banco bcp = new Banco("BCP");
        Banco bbva =  new Banco("BBVA", 30);
        Persona p1 = new Persona(16513, "Carlos", "Avila");
        Persona p2 = new Persona(98415, "Bryan", "Torres");
        Persona p3 = new Persona(98745, "Manuel", "Garcia");
        
        bcp.agregarCliente(p1);
        bbva.agregarCliente(p2);
        bcp.darBajaCliente(p1);
        System.out.println(bcp.buscarCliente(p3));
    }
}
