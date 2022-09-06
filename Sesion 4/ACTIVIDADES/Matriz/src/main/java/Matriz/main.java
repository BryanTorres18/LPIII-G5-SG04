package matriz;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        
        int matriz[][] = new int[4][4];
        
        boolean salir = false;
        int opcion, fila, columna;
        
        boolean rellenado = false;
        
        do{
            System.out.println("Menu");
            System.out.println("1. Rellenar Matrix");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Suma de diagonal");
            System.out.println("5. Salir");
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
                    if (rellenado){
                        do{
                            System.out.println("Elije una columna");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println("La suma de los valores de la columna " + columna + " es: " +sumaColumna(matriz, columna));
                    } else{
                        System.out.println("Debe rellenar la matriz primero");
                    }
                    break;
                case 4:
                    System.out.println("La suma de la diagonal principal es: " + sumaDiagonal(sn, matriz));
                case 5:
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
    
    public static int sumaColumna(int[][] matriz, int columna){
        int suma = 0;
        
        for (int i = 0; i < matriz.length; i++){
            suma += matriz[i][columna];
        }
        return suma;
    }
    
    public static int sumaDiagonal(Scanner sn, int[][] matriz){
        int suma = 0;
        
        for (int i = 0; i < matriz.length; i++){
            suma += matriz[i][i];
        }
        return suma;
    }
}
