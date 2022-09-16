package Actividad_1;
public class TestComposicion {
    public static void main(String[] args){
        Persona p1 = new Persona(1234,"Carlos","Avila");
        Persona p2 = new Persona(7845,"Bryan","Torres");
        System.out.println("CARLOS: Cuenta y Saldo actual: ");
        System.out.println(p1.getCuenta().getSaldo());
        System.out.println("BRYAN: Cuenta y Saldo actual: ");
        System.out.println(p2.getCuenta().getSaldo());
        
        System.out.println("--------------------------------");
        
        System.out.println("CARLOS: Cuenta y Saldo actualizada: ");
        p1.getCuenta().setSaldo(100.00);
        System.out.println(p1.getCuenta().getSaldo());
        System.out.println("BRYAN: Cuenta y Saldo actualizada: ");
        p2.getCuenta().setSaldo(250.00);
        System.out.println(p2.getCuenta().getSaldo());
    }
}
