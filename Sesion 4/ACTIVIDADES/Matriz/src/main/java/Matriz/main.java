package Matriz;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        
        int matriz[][] = new int[4][4];
        
        boolean salir = false;
        int opcion, fila;
        
        boolean rellenado = false;
        
        do{
            System.out.println("Menu");
            System.out.println("1. Rellenar Matrix");
            System.out.println("2. Sumar fila");
            System.out.println("3. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            
            switch (opcion){
                case 1:
                    rellenarMatriz(sn, matriz);
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado){
                        do{
                            System.out.println("Elije una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila + " es: " +sumaFila(matriz, fila));
                    } else{
                        System.out.println("Debe rellenar la matriz primero");
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Tiene que meter un valor entre 1 y 3");
            }
        } while (!salir);
        
        System.out.println("FIN");
    }
    //===============================
    public static void rellenarMatriz(Scanner sn, int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }
    
    public static int sumaFila(int[][] matriz, int fila){
        int suma = 0;
        
        for (int j = 0; j < matriz.length; j++){
            suma += matriz[fila][j];
        }
        return suma;
    }
}
