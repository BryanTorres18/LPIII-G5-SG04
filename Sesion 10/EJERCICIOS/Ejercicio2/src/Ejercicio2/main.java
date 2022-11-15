package Ejercicio2;

/**
 *
 * @author USUARIO
 */
public class main {

    public static void main(String[] args) throws Exception {
        Integer[] Cadena = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        imprimirArray(Cadena);
        intercambio(Cadena);
        String[] Cadena2 = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};

        imprimirArray(Cadena2);
        intercambio(Cadena2);
    }

    public static <T> void intercambio(T[] inputArray) {
        T temp, temp2;
        int x;
        System.out.println("MODIFICADO");
        for (x = 1; x < inputArray.length; x++) {
            temp = inputArray[x];
            inputArray[x] = inputArray[x - 1];
            inputArray[x - 1] = temp;
            System.out.printf("%s ", inputArray[x - 1]);

        }
        System.out.print(inputArray[x-1]);
        System.out.println("\n");

    }

    public static <T> void imprimirArray(T[] inputArray) {
        System.out.println("ORIGINAL");
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.print("\n");
    }
}
