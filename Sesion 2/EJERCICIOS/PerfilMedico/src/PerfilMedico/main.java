package PerfilMedico;

import java.util.*;

public class main {
    public static void main(String[] args) {
        PerfilMedico p1 = new PerfilMedico();

        Scanner l = new Scanner (System.in);
        System.out.println("Ingrese su primer nombre: ");
        String nombre = l.next();
        p1.setPrimerNombre(nombre);

        System.out.println("Ingrese su apellido: ");
        String apellido = l.next();
        p1.setApellido(apellido);

        System.out.println("Ingrese su sexo: ");
        String sexo = l.next();
        p1.setSexo(sexo);

        System.out.println("Ingrese el dia DD, mes MM y año AAAA, de nacimiento: ");
        int dia = l.nextInt();
        int mes = l.nextInt();
        int anio = l.nextInt();
        p1.setDia(dia);
        p1.setMes(mes);
        p1.setAnio(anio);

        System.out.println("ingrese su altura (en cm): ");
        int altura = l.nextInt();
        p1.setAltura(altura);

        System.out.println("ingrese su peso (en kg): ");
        double peso = l.nextInt();
        p1.setPeso(peso);

        System.out.println("Nombre: " + p1.getPrimerNombre());
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Edad: " + p1.edadActual());
        System.out.println("Fecha de Nacimiento: " + p1.getDia() + "/" + p1.getMes() + "/" + p1.getAnio() );
        System.out.println("Altura: " + p1.getAltura() + "cm" );
        System.out.println("Peso: " + p1.getPeso() + "kg" );
        System.out.println("Frecuencia Cardiaca Máxima – FCM: " + p1.FCM());
        System.out.println("Índice de Masa Corporal – IMC: " + p1.IMC());

    }
}
