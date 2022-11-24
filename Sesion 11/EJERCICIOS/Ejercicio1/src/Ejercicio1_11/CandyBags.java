package Ejercicio1_11;

public class CandyBags<T extends Goodies> extends Bag<T> {

    private String golosina = "";
    private float menor = 0;
    private float mayor;
    private Bag b;

    public CandyBags(int n) {
        super(n);
    }

    public String getGolosina() {
        return golosina;
    }

    public float getMenor() {
        return menor;
    }

    public float getMayor() {
        return mayor;
    }

    public String cheapest(Bag b) {
        for (int i = 0; i < b.list.length; i++) {
            if (b.getG().getPrice() < menor) {
                menor = list[i].getPrice();
                golosina = list[i].getClass().getName();
            }
        }
        return golosina;
    }

    public void mostExpensive(int x) {
        try {
            if (x > list.length) {
                System.out.println("Error");
            } else {
                for (int i = 0; i < b.list.length; i++) {
                    if (list[i].getPrice() > mayor) {
                        mayor = list[i].getPrice();
                        String a = list[i].getClass().getName();
                        b.add(a);
                    }
                }
                System.out.println(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
