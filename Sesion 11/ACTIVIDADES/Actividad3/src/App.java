public class App <T> {
    public static void main(String[] args) throws Exception{
        Bag<Integer> bolsa1 = new Bag<Integer>(5);
        Bag<String> bolsa2 = new Bag<String>(2);
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Maria");
        Bag<Persona> bolsa3 = new Bag<Persona>(2);
        // Bolsa de Integer
        bolsa1.add(1);
        bolsa1.add(2);
        bolsa1.add(3);
        bolsa1.add(4);
        bolsa1.getObjects();
        bolsa1.remove(1);
        System.out.println(bolsa1.getIndex(2));
        System.out.println(bolsa1);
        // Bolsa de String
        bolsa2.add("Hola");
        bolsa2.add("Adios");
        bolsa2.getObjects();
        bolsa2.remove("Hola");
        System.out.println(bolsa2.getIndex("Adios"));
        System.out.println(bolsa2);
        // Bolsa de Persona
        bolsa3.add(persona1);
        bolsa3.add(persona2);
        bolsa3.getObjects();
        bolsa3.remove(persona2);
        System.out.println(bolsa3.getIndex(persona1));
        System.out.println(bolsa3);
    }
}
