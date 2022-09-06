public class Coordenada {
    int x;
    int y;
    // Constructor 
    public Coordenada(int x, int y){
        this.x=x;
        this.y=y;
    }
    //Constructor por defecto
    public Coordenada(){  
        this.x=0;
        this.y=0;
    }
    //constructor 3
    public Coordenada(Coordenada coor){ // copia las coordenadas
        this.x=coor.x;
        this.y=coor.y;
    }
    // getters
    public int get_x(){        return this.x;}
    public int get_y(){        return this.y;}
    // setters
    public void set_x(int x){ this.x=x;}
    public void set_y(int y){ this.y=y;}
    //public double distancia(Coordenada coor){
    public double distancia(Coordenada coor2){  
        // distancia con el obj
        //double distancia=(((coor.get_x()-this.x)^2)+((coor.get_y()-this.y)^2))^(1/2);
        double distancia=Math.sqrt((Math.pow((coor2.get_x()-this.x),2)+Math.pow((coor2.get_y()-this.y),2)));
        return distancia;
    }
    public static double distancia(Coordenada coor1,Coordenada coor2){
        double distancia=0;
        //distancia=(((coor2.get_x()-coor1.get_x())^2)+((coor2.get_y()-coor1.get_y())^2))^(1/2);
        distancia=Math.sqrt((Math.pow((coor2.get_x()-coor1.get_x()),2)+Math.pow((coor2.get_y()-coor1.get_y()),2)));
        return distancia;
    }
    //-----------------------
    @Override
    public String toString() {
        String s=String.format("Punto x: "+this.x+"  Punto y: "+this.y);
        return s;
    }
}
