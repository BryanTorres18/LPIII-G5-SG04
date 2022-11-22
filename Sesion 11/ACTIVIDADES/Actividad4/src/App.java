public class App {
    public static void main(String[] args) throws Exception{
        Bag<Goodies> bolsa_de_dulces = new Bag<>(5);
        Chocolates cua_cua = new Chocolates(123,"Cuadrados", 2.5f, "Dulce", 25.8);
        Soda field = new Soda(412, "Cuadradas", 1.5f, "Trigo", "Si", "Si","No");
        Sweet casino = new Sweet(531, "Con crema", 2.4f, "Fresa", "Si", "Si", "No");
        Chocolates princesa = new Chocolates(822, "Duro", 2.0f, "Dulce", 15.5);
        bolsa_de_dulces.add(cua_cua);
        bolsa_de_dulces.add(field);
        bolsa_de_dulces.add(casino);
        bolsa_de_dulces.add(princesa);
        System.out.println(bolsa_de_dulces);
    }
}
