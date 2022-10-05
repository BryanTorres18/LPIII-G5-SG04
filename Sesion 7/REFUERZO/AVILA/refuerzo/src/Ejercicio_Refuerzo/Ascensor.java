package Ejercicio_Refuerzo;

import java.util.*;

public class Ascensor {

    Scanner l = new Scanner(System.in);
    private final int PESO_MAX;
    private int pisoFinal;
    private int pisoDestino;
    private int pisoActual;
    Persona persona;

    //CONSTRUCTOR
    public Ascensor(int pisoFinal, int pisoDestino, Persona persona) {
        PESO_MAX = 750;
        this.pisoDestino = pisoDestino;
        this.persona = persona;
        this.pisoFinal = pisoFinal;
        pisoActual = 1;
    }

    //GET DE peso maximo
    public int getPESO_MAX() {
        return PESO_MAX;
    }
    //GET Y SET DE piso final

    public int getPisoFinal() {
        return pisoFinal;
    }

    public void setPisoFinal(int pisoFinal) {
        this.pisoFinal = pisoFinal;
    }

    //GET Y SET DE pisoDestino
    public int getPisoDestino() {
        return pisoDestino;
    }

    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    //GET SET DE piso actual
    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    //GET SET DE LA CLASE PERSONA
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    //METODOS
    
    //////////////////////////////////SUBIR Y BAJAR//////////////////////////////////
    public void subir() throws Exception {
        try {
            Ascensor.this.comprobacion_pisoDestino(pisoDestino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void bajar() throws Exception {
        try {
            Ascensor.this.comprobacion_pisoDestino(pisoDestino);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //////////////////////////////////COMPROBAR Y VALIDAR PESO //////////////////////////////////
    public void comprobacion_peso() throws Exception {
        boolean r = true;
        while (r == true) {
            try {
                System.out.println("¿Cuántas personas suben al ascensor?: ");
                int personas = Integer.parseInt(l.nextLine());
                persona.setPersonas(personas);
                persona.getPersonas();
                this.validacion_peso(persona);
                r = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                r = true;
            }
        }
    }

    public void validacion_peso(Persona personas) throws Exception {
        if (persona.getPersonas() * persona.getPeso() > PESO_MAX) {
            throw new Exception(" -> PESO MAXIMO");
        }
    }

    //////////////////////////////////COMPROBAR Y VALIDAR PISO FINAL //////////////////////////////////
    public void comprobacion_pisoFinal() throws Exception {
        boolean r = true;
        while (r == true) {
            try {
                System.out.println("¿Cuántas pisos hay en el edificio?: ");
                int pisos = Integer.parseInt(l.nextLine());
                this.setPisoFinal(pisos);
                this.getPisoFinal();
                this.validacion_pisoFinal(pisos);
                r = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                r = true;
            }
        }
    }

    public void validacion_pisoFinal(int pisoFinal) throws Exception {
        if (pisoFinal < 2) {
            throw new Exception(" -> MINIMO 2 PISOS");
        } else {
            this.setPisoFinal(pisoFinal);
            this.getPisoFinal();
        }
    }
    //////////////////////////////////COMPROBAR Y VALIDAR PISO DESTINO //////////////////////////////////
    public void comprobacion_pisoDestino(int pisoDestino) throws Exception {
        if (this.getPisoActual() == pisoDestino) {
            throw new Exception(" -> ESTAMOS EN ESE PISO");
        }

        if (pisoDestino > this.getPisoFinal()) {
            throw new Exception(" -> NO HAY PISOS MAS ARRIBA");
        }
        if (this.getPisoActual() == 1) {
            if (pisoDestino < this.getPisoActual()) {
                throw new Exception(" -> NO HAY PISOS MAS ABAJO");
            }
        }
        setPisoActual(pisoDestino);
    }
}
