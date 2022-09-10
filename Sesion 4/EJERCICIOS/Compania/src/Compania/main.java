package Compania;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner l = new Scanner(System.in);
        int i,j,n=1;
        int[] numero = new int [20];
        int[][] matriz = new int[4][5];
        int[] ventasV = new int[4];
        int[] ventasP = new int[5];
        int suma=0;
        for(i=0;i<4;i++){
            System.out.println("N°"+(i+1)+" VENDEDOR");
            System.out.println("-----------------------------------------------");
                for(j=0;j<5;j++){
                    System.out.println("N°"+(j+1)+" PRODUCTO");
                    System.out.print("Ingrese el numero de ese producto: ");
                    numero[i] = l.nextInt();
                    System.out.print("Ingrese costo vendido de ese producto en $: ");
                    matriz[i][j] = l.nextInt();
                    suma+=matriz[i][j];
                    System.out.println("-----------------------------------------------");
                }
                System.out.println("\n-----------------------------------------------");
                System.out.println("N°"+(i+1)+" VENDEDOR VENDIO $"+suma);
                System.out.println("-----------------------------------------------\n");
        }
        
        System.out.println("MATRIZ GENERAL");
        System.out.println("-----------------------------------------------");
        System.out.println("|-----| V 1 | V 2 | V 3 | V 4 |");
        
            while(n<6){
                for(j=0;j<5;j++){
                    System.out.print(" P "+n+" ");
                    for(i=0;i<4;i++){
                        System.out.printf("|%5d", matriz[i][j]);
                    }
                    System.out.println("\n");
                    n++;
                    }                
                System.out.println("\n");
                }
        System.out.println("\n\n");
        System.out.println("TOTAL DE VENTAS QUE HICIERON LOS VENDEDORES");
        System.out.println("-----------------------------------------------");
        for(i=0;i<4;i++){
            ventasV[i]=0;
            for(j=1;j<5;j++){
                ventasV[i]=ventasV[i]+matriz[i][j];
            }
        System.out.println("N°"+(i+1)+" VENDEDOR -> VENDIO $"+ventasV[i]);
        System.out.println("-----------------------------------------------");
        }
        System.out.println("\n\n");
        System.out.println("TOTAL DE VENTAS QUE HUBO DE LOS PRODUCTOS");
        System.out.println("-----------------------------------------------");
        for(j=0;j<5;j++){
            ventasP[j]=0;
            for(i=0;i<4;i++){
                ventasP[j]=ventasP[j]+matriz[i][j];
            }
        System.out.println("N°"+(j+1)+" PRODUCTO -> TOTAL "+ventasP[j]);
        System.out.println("-----------------------------------------------");
        }
    }
}
