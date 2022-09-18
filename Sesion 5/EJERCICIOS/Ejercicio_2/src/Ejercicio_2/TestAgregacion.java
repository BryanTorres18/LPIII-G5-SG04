package Ejercicio_2;

public class TestAgregacion {
    public static void main(String [] args){
        Automovil a1 = new Automovil("AIJ21K", 3, "Toyota", "201a");
        Automovil a2 = new Automovil("LS5Q42", 3, "Renault", "594a");
        Motor m1 = new Motor(1, 3000);
        Motor m2 = new Motor(2, 5000);
        
        System.out.println(a1.toString());
        a1.setMotor(m1);
        System.out.println(a1);
        System.out.println("----------------------------");
        System.out.println(a2.toString());
        a2.setMotor(m2);
        System.out.println(a2);
                
    }
    
}
