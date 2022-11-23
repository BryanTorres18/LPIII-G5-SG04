public class App {
    public static void main(String[] args) throws ObjectNoExist {
        Dictionary<String, Integer> dic_1 = new Dictionary<String, Integer>();
        dic_1.add("Hola", 1);
        dic_1.add("Adios", 2);
        dic_1.add("Buenas", 3);
        System.out.println(dic_1);
        dic_1.delete("Adios");
        System.out.println(dic_1);
        System.out.println(dic_1.getValue("Hola"));
        System.out.println();
    }
}
