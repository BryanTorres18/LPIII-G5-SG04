public class Manejador {
    Rectangulo rect1;
    public Manejador(Rectangulo rect1){
        this.rect1=rect1;
    }
    public void Area(){//Rectangulo rect1){
        Coordenada c3=new Coordenada(rect1.esquina_2.get_x(),rect1.esquina_1.get_y());
        Coordenada c4=new Coordenada(rect1.esquina_1.get_x(),rect1.esquina_2.get_y());
        double base=Coordenada.distancia(c3,rect1.esquina_1);
        System.out.println("Base: "+base);
        double altura=Coordenada.distancia(rect1.esquina_2, c3);
        System.out.println("Altura: "+altura);
        double area_rect=base*altura;
        System.out.println("El area del Rectangulo es: "+area_rect);
        // multiplica base x altura
    }
    public void Perimetro(){//(Rectangulo rect1){
        Coordenada c3=new Coordenada(rect1.esquina_2.get_x(),rect1.esquina_1.get_y());
        Coordenada c4=new Coordenada(rect1.esquina_1.get_x(),rect1.esquina_2.get_y());
        double base=Coordenada.distancia(rect1.esquina_1, c3);
        double altura=Coordenada.distancia(rect1.esquina_2, c3);
        double perimetro_rect=(base+altura)*2;
        System.out.println("El perimetro del Rectangulo es: "+perimetro_rect);
        // multiplica base x altura
    }

    public void desplazar_x(int cambio_x1,int cambio_x2){
        System.out.println("\n---  Los nuevos datos son  ---");
        rect1.esquina_1.set_x(cambio_x1);
        System.out.println(" Datos del Rectangulo son\n"+rect1);
        rect1.esquina_2.set_x(cambio_x2);
        Area();
        Perimetro();
    }
    public void desplazar_y(int cambio_y1,int cambio_y2){
        System.out.println("\n---  Los nuevos datos son  ---");
        rect1.esquina_1.set_y(cambio_y1);
        System.out.println(" Datos del Rectangulo son\n"+rect1);
        rect1.esquina_2.set_y(cambio_y2);
        Area();
        Perimetro();
    }
}
