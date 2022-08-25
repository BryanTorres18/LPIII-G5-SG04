package Perro;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Actividad 1
        Perro Fido = new Perro("Chihuahua", "Marron");
        Perro Pelusa = new Perro("Pequines", "Blanco");

        //Edad Actual
        System.out.println("Edad: " + Fido.getEdad());
        System.out.println("Edad: " + Pelusa.getEdad());

        //Aumentar la edad de los perros
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        System.out.println("Edad: " + Fido.getEdad());
        System.out.println("Edad: " + Pelusa.getEdad());

        //===========================================================
        //Actividad 2
        Perro Max = new Perro();
        Diagnostico d0 = new Diagnostico();

        d0.AptoVacunaB(Max.getEdad(), Max.getTemp(), Max.peso);

        //===========================================================
        //Actividad 3
        Perro Firualais = new Perro();
        Scanner l = new Scanner (System.in);

        System.out.println("Ingrese la nueva temperatura para el perro: ");
        int temperatura = l.nextInt();
        Firualais.setTemp(temperatura);

        System.out.println("Ingrese la nueva edad para el perro: ");
        int edad = l.nextInt();
        Firualais.setEdad(edad);

        System.out.println("Ingrese el nuevo peso para el perro: ");
        Firualais.peso = l.nextInt();

        System.out.println("Temperatura:" + Firualais.getTemp());
        System.out.println("Edad:" + Firualais.getEdad());
        System.out.println("Peso:" + Firualais.peso);
        
        Diagnostico d1 = new Diagnostico();
        Diagnostico d2 = new Diagnostico();
        
        d1.AptoVacunaA(Firualais);
        d2.AptoVacunaB(Firualais.getEdad(), Firualais.getTemp(), Firualais.peso);
    }
}
