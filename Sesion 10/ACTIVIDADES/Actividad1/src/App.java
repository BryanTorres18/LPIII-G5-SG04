public class App {
    public static void main(String[] args) {
        // Actividad 1 - Parte 1
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Float[] floatArray = {0.33f, 5.98f, 34.2f};
        Boolean[] booleanArray = {true, false, true, false, false};

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray booleanArray contiene:%n");
        imprimirArray(booleanArray);
        // Actividad 1 - Parte 2
        System.out.printf("\nMinimo de %d, %d y %d es %d%n%n",
                3, 4, 5, minimo(3,4,5));
        System.out.printf("Minimo de %.1f, %.1f y %.1f es %.1f%n%n",
                6.6, 7.7, 8.8, minimo(6.6,7.7,8.8));
        System.out.printf("Minimo de %s, %s and %s es %s%n%n",
                "pera", "zanahoria", "uva", minimo("pera","zanahoria","uva"));
    }

    // Actividad 1 - Parte 1
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray)
            System.out.printf("%s ",elemento);

        System.out.println();

    }
    // Actividad 1 - Parte 2
    public static <T extends Comparable<T>> T minimo (T x, T y, T z){
        T min = x;
        if(y.compareTo(x) < 0)
            min = y;
        if(z.compareTo(y) < 0)
            min = z;

        return min;
    }
}
