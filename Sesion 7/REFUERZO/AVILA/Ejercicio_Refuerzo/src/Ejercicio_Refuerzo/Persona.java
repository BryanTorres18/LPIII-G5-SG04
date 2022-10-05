package Ejercicio_Refuerzo;

public class Persona {
    private final int PESO_MAX;
    private final int peso;
    private int personas;

    public Persona(int personas) {
        peso = 50;
        PESO_MAX = 750;
        this.personas = personas;
    }

    public int getPESO_MAX() {
        return PESO_MAX;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPeso() {
        return peso;
    }
    
    
}
