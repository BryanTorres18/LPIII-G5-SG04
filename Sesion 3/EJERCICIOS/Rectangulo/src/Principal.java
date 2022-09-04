public class Principal {
    public static void main(String[] args) throws Exception {
        Coordenada c1,c2;
        c1=new Coordenada(3,4);
        c2=new Coordenada(7,7);
        String color_rectangulo="verde";
        Rectangulo rect1;
        rect1=new Rectangulo(c1,c2,color_rectangulo);
        System.out.println("Los Datos del Rectangulo son\n"+rect1);
        
        Manejador manejador= new Manejador(rect1);
        manejador.Area();
        manejador.Perimetro();
        
        manejador.desplazar_x(2,6);
        manejador.desplazar_y(5, 8);
    }
    
}
