package Ejercicio_Refuerzo;

public class Edificio {
    Ascensor ascensor;

    //CONSTRUCTOR
    public Edificio(Ascensor ascensor) {
        this.ascensor = ascensor;
    }


    //GET SET DE LA CLASE ASCENSOR
    public Ascensor getAscensor() {
        return ascensor;
    }

    public void setAscensor(Ascensor ascensor) {
        this.ascensor = ascensor;
    }
}
