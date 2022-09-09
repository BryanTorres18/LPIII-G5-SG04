import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<Evaluacion> personas = new ArrayList <> ();

        //Variables
        int sexo;
        int trabaja;
        int sueldo;

        for(int i = 0; i < 7; i++ )
        {
            System.out.println("Ingrese su sexo (1= masculino, 2= femenino): ");
            sexo = sn.nextInt();
            System.out.println("Ingrese si trabaja (1= si trabaja, 2= no trabaja): ");
            trabaja = sn.nextInt();
            if(trabaja == 1)
                sueldo = (int)(Math.random()*3000+950);
            else
                sueldo = 0;
            personas.add(new Evaluacion(sexo, trabaja, sueldo));
        }

        //Ejercicio A
        // Porcentaje de hombres (tengan o no trabajo)
        float suma = 0;
        for (int i = 0; i < 7; i++) {
            if (personas.get(i).getSexo() == 1)
                suma++;
        }
        System.out.println("El porcentaje de hombres es: %" + (suma/7) * 100);


        // Ejercicio B
        // Porcentaje de mujeres (tengan o no trabajo).
        suma = 0;
        for (int i = 0; i < 7; i++) {
            if (personas.get(i).getSexo() == 2)
                suma++;
        }
        System.out.println("El porcentaje de mujeres es: %" + (suma/7) * 100);

        // Ejercicio C
        // Porcentaje de hombres que trabajan.
        suma = 0;
        for (int i = 0; i < 7; i++) {
            if (personas.get(i).getSexo() == 1)
                if(personas.get(i).getTrabaja() == 1)
                    suma++;
        }
        System.out.println("El porcentaje de hombres que trabaja es: %" + (suma/7) * 100);

        // Ejercicio D
        // Porcentaje de mujeres que trabajan.
        suma = 0;
        for (int i = 0; i < 7; i++) {
            if (personas.get(i).getSexo() == 2)
                if(personas.get(i).getTrabaja() == 1)
                    suma++;
        }
        System.out.println("El porcentaje de mujeres que trabaja es: " + (suma/7) * 100);

        // Ejercicio E
        // El sueldo promedio de las hombres que trabajan.
        float contador = 0;
        suma = 0;
        for (int i = 0; i < 7; i++) {
            if (personas.get(i).getSexo() == 1)
                if(personas.get(i).getTrabaja() == 1)
                {
                    suma += personas.get(i).getSueldo();
                    contador++;
                }

        }
        System.out.println("El sueldo promedio de los hombres que trabajan es: " + (suma/contador));

        // Ejercicio E
        // EL sueldo promedio de las mujeres que trabajan.
        contador = 0;
        suma = 0;
        for (int i = 0; i < 7; i++) {
            if (personas.get(i).getSexo() == 2)
                if(personas.get(i).getTrabaja() == 1)
                {
                    suma += personas.get(i).getTrabaja();
                    contador++;
                }

        }
        System.out.println("El sueldo promedio de las mujeres que trabajan es %" + (suma/contador));
    }
}