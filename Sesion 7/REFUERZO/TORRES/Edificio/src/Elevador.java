public class Elevador {
    private final int peso_max = 750;
    private final int peso_persona = 50;
    private int pisoActual;

    public Elevador()
    {
        pisoActual = 1;
    }
    public void subir(int personas, int pisoMover, int pisoMax)
    {
        if (personas * peso_persona > peso_max)
            System.out.println("Se supero el peso maximo en el elevador");
        if (pisoMover < 1)
            System.out.println("No existe un piso con ese numero");
        if (pisoMover > pisoMax)
            System.out.println("No existen pisos por encima de ese");
        if (pisoActual == pisoMover)
            System.out.println("Ya se encuentra en el piso: " + pisoMover);
        if (pisoActual < pisoMover)
            System.out.println("Usted esta subiendo");
        pisoActual = pisoMover;
    }

    public void bajar(int personas, int pisoMover, int pisoMax)
    {
        if (personas * peso_persona > peso_max)
            System.out.println("Se supero el peso maximo en el elevador");
        if (pisoMover < 1)
            System.out.println("No existe un piso con ese numero");
        if (pisoMover > pisoMax)
            System.out.println("No existen pisos por encima de ese");
        if (pisoActual == pisoMover)
            System.out.println("Ya se encuentra en el piso: " + pisoMover);
        if (pisoActual > pisoMover)
            System.out.println("Usted esta bajando");
        pisoActual = pisoMover;
    }

    public int getPeso_max() {
        return peso_max;
    }

    public int getPeso_persona() {
        return peso_persona;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }
}
