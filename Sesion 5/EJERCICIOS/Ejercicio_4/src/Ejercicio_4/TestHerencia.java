package Ejercicio_4;

public class TestHerencia {
    public static void main(String [] args)
    {
        Asalariado empl1 = new Asalariado("Manuel Cortina", 1234568, 28,1500);
        EmpleadoProduccion emplP2 = new EmpleadoProduccion("Juan Mota", 5533222, 30, 1200, "Tarde");
        EmpleadoDistribucion emplD3 = new EmpleadoDistribucion("Antonio Camino", 55333666, 27, 1350, "Granada");
        
        System.out.println("Empleado Asalariado");
        System.out.println(empl1.toString());
        System.out.println("-----------------------------------");
        System.out.println(emplP2.toString());
        System.out.println("-----------------------------------");
        System.out.println(emplD3.toString());
    }
}
