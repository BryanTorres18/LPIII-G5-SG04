import java.util.Scanner;

public class pruebaEdificio {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        boolean opc = false;
        int n;
        int piso;
        int personas;
        Edificio edificio = new Edificio();

        do{
            edificio.ingresarPisos();
            System.out.println("""
                    ==========================
                            BIENVENIDO     \s
                    ==========================
                      1. Subir
                      2. Bajar
                      3. Salir
                    ==========================
                    """);
            System.out.println("->");
            n = t.nextInt();
            switch (n){
                case 1:
                    System.out.println("Ingrese el piso que quiere subir:");
                    piso = t.nextInt();
                    System.out.println("Ingrese cuantas personas quieren subir:");
                    personas = t.nextInt();
                    edificio.elevador.subir(personas,piso, edificio.getPisos());
                    System.out.println("Esta en el piso: " + edificio.elevador.getPisoActual());
                    break;
                case 2:
                    System.out.println("Ingrese el piso que quiere bajar:");
                    piso = t.nextInt();
                    System.out.println("Ingrese cuantas personas quieren bajar:");
                    personas = t.nextInt();
                    edificio.elevador.bajar(personas,piso, edificio.getPisos());
                    System.out.println("Esta en el piso: " + edificio.elevador.getPisoActual());
                    break;
                case 3:
                    System.out.println("Adios");
                    opc = true;
                    break;
                default:
                    System.out.println("El numero es invalido");
                    break;
            }
        }while (!opc);
    }
}
