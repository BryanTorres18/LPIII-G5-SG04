package Perro;

public class Diagnostico{

    public Diagnostico() {
    }
    
    public void AptoVacunaA(Perro p1)
        {
            AptoVacunaB(p1.getEdad(), p1.getTemp(), p1.peso);
        }
    
    public void AptoVacunaB(int edad, double temperatura, double peso)
    {
        if(temperatura > 37 && temperatura < 40 && peso > 5 && edad >= 1)
            System.out.println("El perro esta sano");
        else
            System.out.println("El perro no esta sano");
    }
}
