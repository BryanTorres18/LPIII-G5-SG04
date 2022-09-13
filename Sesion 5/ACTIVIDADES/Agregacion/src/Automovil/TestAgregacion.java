
package Automovil;

public class TestAgregacion {
    public static void main(String [] args){
        Automovil a1 = new Automovil("AIJ21K", 3, "Toyota", "201a");
        Motor m1 = new Motor(1, 3000);
        Motor m2 = new Motor(2, 5000);
        Motor m3 = new Motor(3, 38000);
        
        a1.setMotor(m1);
        System.out.println(a1);
        a1.setMotor(m2);
        System.out.println(a1);
        a1.setMotor(m3);
        System.out.println(a1);
                
    }
    
}
