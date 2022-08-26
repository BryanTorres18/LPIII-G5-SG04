
package CuentaBanco;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double x=0;
        int rpt = 4;
        String nombre;
        double num;
        
        System.out.println("Ingrese nombre del titular");
        nombre = leer.next();
        
        System.out.println("Ingrese la cantidad de la cuenta");
        num = leer.nextDouble();
        
        CuentaBanco Cuenta = new CuentaBanco(nombre, num);
        
        while (rpt != 1 && rpt != 2 && rpt !=3){
            System.out.println("¿Desea ingresar(1) o retirar(2) o ver saldo(3)?");
            rpt = leer.nextInt();
        
        switch(rpt){
            case 1:
                System.out.println("Ingrese el dinero a ingresar: ");
                x = leer.nextDouble();
                System.out.println("Nuevo saldo " + Cuenta.ingresar(x));
                break;
            case 2:
                System.out.println("Ingrese el dinero a retirar: ");
                x = leer.nextDouble();
                System.out.println("Nuevo saldo " + Cuenta.retirar(x));
                break;
            case 3:
                System.out.println("Este es su saldo: "+ Cuenta.getCantidad());
                break;
            default:
                System.out.println("Numero incorrecto");
                
        }
        }
    }
}
