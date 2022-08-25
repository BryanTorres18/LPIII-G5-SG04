package Perro;

public class Diagnostico extends Perro {
    public Diagnostico() {
        this.setRaza("chusco");
        this.setColor("negro");
        this.setTemp(38);
        this.setEdad(1);
        this.peso = 6;
    }
    public Diagnostico(int peso) {
        this.setRaza("chusco2");
        this.setColor("negro");
        this.setTemp(36);
        this.setEdad(3);
        this.peso = peso;
    }
    public void AptoVacunaA()
        {
            if(this.getTemp() > 37 && this.getTemp() < 40 && peso > 5 && this.getEdad() >= 1)
                System.out.println("El perro esta sano");
            else
                System.out.println("El perro no esta sano");
        }
    public void AptoVacunaB()
    {
        if(this.getTemp() > 38 && this.getTemp() < 40 && peso > 4 && this.getEdad() >= 2)
            System.out.println("El perro esta sano");
        else
            System.out.println("El perro no esta sano");
    }
}
