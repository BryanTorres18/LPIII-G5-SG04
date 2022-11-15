package Ejercicio3;

public class main {

    public static void main(String[] args) {
        Integer intA = 1;
        Integer intB = 1;
        Double doubleA = 5.2;
        Character charA = 'H';
        String strA = "Carlos";
        String strB = "Manuel";

        //para la comparacion de dos objetos propios
        Clase clase1 = new Clase(5, 9);
        Clase clase2 = new Clase(7, 10);
        Clase clase3 = new Clase(15, 3);

        System.out.println(isEqualTo(strA, strB));

        System.out.println(isEqualTo(intA, intB));

        System.out.println(isEqualTo(doubleA, charA));

        System.out.println(isEqualTo(clase1, clase2));

        System.out.println(isEqualTo(clase3, clase1));

    }

    public static <T, E> boolean isEqualTo(T x, E y) {
        return x.equals(y);
    }
}
