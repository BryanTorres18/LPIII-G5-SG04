package Ejercicio1_11;

public class main {

    public static void main(String[] args) throws Exception {
        CandyBags<Goodies> bolsaGoodies = new CandyBags<Goodies>(5);
        Chocolates cua_cua = new Chocolates(123, "Cuadrados", 2.5f, "Dulce", 25.8);
        Soda field = new Soda(412, "Cuadradas", 1.5f, "Trigo", "Si", "Si", "No");
        Sweet casino = new Sweet(531, "Con crema", 2.4f, "Fresa", "Si", "Si", "No");
        Chocolates princesa = new Chocolates(822, "Duro", 2.0f, "Dulce", 15.5);

        try{
            bolsaGoodies.add(cua_cua);
            bolsaGoodies.add(field);
            bolsaGoodies.add(casino);
            bolsaGoodies.add(princesa);
            System.out.println(bolsaGoodies);
            Goodies barato = bolsaGoodies.cheapest();
            System.out.println(barato);
            CandyBags<Goodies> bolsa = bolsaGoodies.mostExpensive(2);
            System.out.println(bolsa);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

