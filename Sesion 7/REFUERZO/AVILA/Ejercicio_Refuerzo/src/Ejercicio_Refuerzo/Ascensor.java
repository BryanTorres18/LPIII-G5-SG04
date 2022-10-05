package Ejercicio_Refuerzo;

public class Ascensor extends Persona{
    Persona persona;
    private final int pisoFinal;
    private int pisoActual;

    public Ascensor(int personas, int pisoFinal) {
        super(personas);
        this.pisoFinal = pisoFinal;
        pisoActual = 1;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public int getPisoFinal() {
        return pisoFinal;
    }


    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }
    
}
