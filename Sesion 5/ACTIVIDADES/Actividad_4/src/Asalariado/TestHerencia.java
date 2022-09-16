
package Asalariado;

public class TestHerencia {
    public static void main(String [] args)
    {
        Asalariado emplead1 = new Asalariado("Manuel Cortina", 1234568, 28);
        EmpleadoProduccion emplead2 = new EmpleadoProduccion("noche", "Juan Mota", 5533222, 30);
        EmpleadoDistribucion emplead3 = new EmpleadoDistribucion("Granada","Antonio Camino", 55333666, 35);
        
        System.out.println("El nombre del emplead1 es: " + emplead1.getNombre());
        System.out.println("El nombre del emplead2 es: " + emplead2.getNombre());
        System.out.println("El turno del emplead2 es: " + emplead2.getTurno());
        System.out.println("El nombre del emplead3 es: " + emplead3.getNombre());
        System.out.println("La region del emplead3 es: " + emplead3.getRegion());
    }
}
