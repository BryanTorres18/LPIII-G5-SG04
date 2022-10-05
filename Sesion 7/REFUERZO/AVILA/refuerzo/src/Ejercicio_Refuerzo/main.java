package Ejercicio_Refuerzo;

import java.util.*;

public class main {

    public static void main(String[] args) throws Exception{
        Scanner l = new Scanner(System.in);
        int opcion = 0, pers = 15, pisos = 2, pisoDestino = 1;
        int pUP, pDOWN;
        
        Persona persona;
        Ascensor ascensor;
        Edificio edificio;
        
        persona = new Persona(pers);
        ascensor = new Ascensor(pisos, pisoDestino, persona);
        edificio = new Edificio(ascensor);
        
        edificio.ascensor.comprobacion_peso();
        edificio.ascensor.comprobacion_pisoFinal();
        
        while (opcion != 3) {
            System.out.println("=================== SELECCIONE UNA OPCION ===================");
            System.out.println("Piso Maximo: " + ascensor.getPisoFinal());
            System.out.println("Piso Actual: " + ascensor.getPisoActual());
            System.out.println("1) Subir piso");
            System.out.println("2) Bajar piso");
            System.out.println("3) Salir");
            System.out.print("Escoja opción: ");
            try {
                opcion = Integer.parseInt(l.nextLine());
                switch(opcion) {
                    case 1:
                        System.out.println("Ingrese el piso a subir: ");
                        pUP = Integer.parseInt(l.nextLine());
                        edificio.ascensor.setPisoDestino(pUP);
                        edificio.ascensor.subir();
                        break;
                    case 2:
                        System.out.println("Ingrese el piso a bajar: ");
                        pDOWN = Integer.parseInt(l.nextLine());
                        edificio.ascensor.setPisoDestino(pDOWN);
                        edificio.ascensor.bajar();
                        break;
                    case 3:
                        System.out.println("\nFIN DE PROGRAMA");
                        break;
                    default:
                        System.out.println(" -> Elija entre el 1, 2 ó 3");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println(" -> Elija entre el 1, 2 ó 3");
            }
        }

    }
}
