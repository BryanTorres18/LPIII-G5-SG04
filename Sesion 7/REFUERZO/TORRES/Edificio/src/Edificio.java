import java.util.Scanner;

public class Edificio {
    Scanner t = new Scanner(System.in);
    private int pisos;
    Elevador elevador;

    public Edificio() {
        this.elevador = new Elevador();
    }

    public void ingresarPisos()
    {
        boolean opc = false;
        int n = 0;
        do{
            System.out.println("Ingrese la cantidad del piso del edificio: ");
            n = t.nextInt();
            if(n <= 0)
                System.out.println("El numero es invalido");
            else
                opc = true;
        } while(!opc);
        pisos = n;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
}
