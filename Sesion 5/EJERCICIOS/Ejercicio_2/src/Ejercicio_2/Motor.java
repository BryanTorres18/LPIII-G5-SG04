package Ejercicio_2;

public class Motor {
    private int numMotor;
    private int revPorMin;
    private Automovil automovil;
    
    public Motor(int numMotor, int revPorMin)
    {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }
    
    //Getter y Setter

    public int getNumMotor() {
        return numMotor;
    }

    public int getRevPorMin() {
        return revPorMin;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }

    //ToString
    @Override
    public String toString() {
        return "\nNumMotor      : " + numMotor + "\nRevPorMin       : " + revPorMin;
    }
}
