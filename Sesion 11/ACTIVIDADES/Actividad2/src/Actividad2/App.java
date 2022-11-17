
package Actividad2;

public class App {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan");
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<Integer, Integer>(5,2);
        OrderedPair<Integer, String> pair2 = new OrderedPair<Integer, String>(5,"Hola");
        OrderedPair<String, Persona> pair3 = new OrderedPair<String, Persona>("Hola",juan);
        
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}
