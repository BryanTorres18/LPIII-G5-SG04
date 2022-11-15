package Ejercicio1;

/**
 *
 * @author USUARIO
 *
 */

public class App {
    public static void main(String[] args) {
        Integer[] Numeros = {1,2,3,4,5,6,7,8,9,10};
        String[] Cadena={"Uno\t","Dos\t","Tres\t","Cuatro\t","Cinco\t","Seis\t","Siete\t","Ocho\t"};
        System.out.printf("Array de cadenas contiene:\n");
        imprimirArray(Cadena);
        imprimirArray(Numeros);

    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println("\n");
    }
    
    public static String imprimirArray(String[] cadena){
        int cont=0;
        for (String elemento : cadena) {
            cont++;
            System.out.printf("%s ", elemento);
            if (cont == 4)
                System.out.printf("\n");
        }
        System.out.println("\n");
    return "";
    }
}
 