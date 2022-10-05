package Ejercicio_Refuerzo;

public class Edificio extends Ascensor{
    Ascensor ascensor;
    private int pisoDestino;

    public Edificio(int pisoDestino, int personas, int pisoFinal) {
        super(personas, pisoFinal);
        this.pisoDestino = pisoDestino;
    }
    
    public int getPisoDestino() {
        return pisoDestino;
    }

    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }   
    
    public void desplazar(int personas, int pisoDestino) {

        if (personas * persona.getPeso() > persona.getPESO_MAX()) {
            System.out.println("Peso máximo superado");
        }
        if (pisoDestino < ascensor.getPisoActual()) {
            System.out.println("No existen plantas por debajo del piso 1");
        }
        if (pisoDestino > ascensor.getPisoFinal()){
            System.out.println("No existen plantas por encima del piso " + ascensor.getPisoFinal());
        }
        if (ascensor.getPisoActual() == pisoDestino) {
            System.out.println("Ascensor ya se encuentra en el piso " + pisoDestino);
        }
        ascensor.setPisoActual(pisoDestino);
    }
}
