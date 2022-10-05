package Ejercicio_Refuerzo;

public class Persona {
    
    private final int peso;
    private int personas;
    //CONSTRUCTOR
    public Persona(int personas) {
        peso = 50;
        this.personas = personas;
    }

    //GET DE peso
    public int getPeso() {
        return peso;
    }

    //GET SET DE personas
    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }
    
}
