
public class test_coor {
    public static void main(String[] args) throws Exception {
    Coordenada c1,c2;
    //c1=new Coordenada(3,4);
    c1=new Coordenada(7,7);
    System.out.println("--- Los datos de C1 ---\n"+c1);
    //distancia(3,4);
    //c2=new Coordenada(7,7);
    c2=new Coordenada(7,4);
    System.out.println("--- Los datos de C2 ---\n"+c2);

    //Coordenada c3 = new Coordenada(c2);
    //Coordenada c3 = new Coordenada();
    System.out.println("--- La distancia de C1-c2 es: ---\n"+Coordenada.distancia(c2,c1));
    // c3  -- distancia 
    }
}
