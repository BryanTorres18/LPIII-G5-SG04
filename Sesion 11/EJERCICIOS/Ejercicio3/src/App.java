import java.util.Scanner;

public class App{
    public static void main(String[] args) throws ObjectNoExist {
        Dictionary<Integer,String> dic = new Dictionary<Integer,String>();
        Scanner l = new Scanner (System.in);

        boolean ex = true;

        while(ex){
            boolean ex_1 = false;
            int opc = 0;
            System.out.println("==========Bienvenidos=========");
            System.out.println("------------------------------");
            System.out.println("    1. Ingresar Contacto      ");
            System.out.println("    2. Borrar Contacto        ");
            System.out.println("    3. Mostrar Datos          ");
            System.out.println("    4. Mostrar todos\n" +
                               "       los contactos          ");
            System.out.println("    5. Salir                  ");
            System.out.println("------------------------------");

            while (!ex_1){
                System.out.print("Ingrese su opcion -> ");
                opc = l.nextInt();
                if(opc >= 1 && opc <= 5)
                    ex_1 = true;
            }
            switch(opc){
                case 1:
                    System.out.print("Ingrese el DNI -> ");
                    int dni = l.nextInt();
                    System.out.print("Ingrese los Datos -> ");
                    String datos = l.next();
                    dic.add(dni, datos);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI a borrar -> ");
                    dni = l.nextInt();
                    boolean resp = dic.delete(dni);
                    if(!resp){
                        System.out.println("No se encuentra o ingreso mal");
                    }
                    else
                        System.out.println("Eliminacion Correcta");
                    break;
                case 3:
                    System.out.print("Ingrese el DNI a mostrar -> ");
                    dni = l.nextInt();
                    System.out.println(dic.getValue(dni));
                    break;
                case 4:
                    System.out.println(dic);
                    break;
                case 5:
                    ex = false;
                    break;
            }
        }
    }
}
