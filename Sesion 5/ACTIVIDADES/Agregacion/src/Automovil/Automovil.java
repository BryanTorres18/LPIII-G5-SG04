
package Automovil;

public class Automovil {

    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int nPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = nPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Getter y Setter

    public String getPlaca() {
        return placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Automovil{" + "placa=" + placa + ", numPuertas=" + numPuertas + ", marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
    
    
    
}



