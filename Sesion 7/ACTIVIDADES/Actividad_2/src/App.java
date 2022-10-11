import java.util.*;
public class App {
    public static int cociente(int numerador, int denominador) throws ArithmeticException{
        return numerador/denominador;
    }
    public static void main(String[] args){
       Scanner explorador = new Scanner(System .in);
       boolean flag = true;
       do{
           try {
               System.out.println("Introduzca un numerador entero: ");
               int numerador = explorador.nextInt();
               System.out.println("Introduzca un denominador entero: ");
               int denominador = explorador.nextInt();

               int resultado = cociente(numerador, denominador);
               System.out.printf("\nResulado: %d/%d = %d\n", numerador,
                       denominador, resultado);
               flag = false;
           }
           catch (InputMismatchException inputMismatchE){
               System.out.println("Excepcion: " + inputMismatchE);
               explorador.nextLine();
               System.out.println("Debe introducir enteros. Intente de nuevo....\n");
           }
           catch (ArithmeticException arithmeticE){
               System.out.println("Excepcion: " + arithmeticE);
               explorador.nextLine();
               System.out.println("Cero es un denominor invalido.....\n");
           }
       }while (flag);

   } 
}

