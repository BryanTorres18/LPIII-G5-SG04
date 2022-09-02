package contador;

public class ContadorTest3 {
    public static void main(String[] args)
    {
        Contador c3, c4;
        System.out.println(Contador.nContadores);
        c3 = new Contador(20);
        System.out.println(Contador.ultimoContador);
        c4 = new Contador(30);
        System.out.println(Contador.ultimoContador);
        System.out.println(Contador.nContadores);
    }
}
