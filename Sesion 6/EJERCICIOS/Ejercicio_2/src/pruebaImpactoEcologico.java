import java.util.ArrayList;

public class pruebaImpactoEcologico {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> lista= new ArrayList<ImpactoEcologico>();
        Edificio e1 = new Edificio("Av.Los olivos", 10, 15, 8,
                0.5,1.5, 250);
        Auto a1 = new Auto("Kia", "T-21", 3, 0.3, 25,
                250.8);
        Bicicleta b1 = new Bicicleta("Montaña", "Adulto", 0.05, 75.8,
                0.8);
        lista.add(e1);
        lista.add(a1);
        lista.add(b1);

        for (ImpactoEcologico impactoEcologico : lista) {
            System.out.println("Impacto ecologico: " + impactoEcologico.obtenerImpactoEcologico());
        }
    }
}
