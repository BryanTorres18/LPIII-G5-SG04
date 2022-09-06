public class Rectangulo {
    Coordenada esquina_1;
    Coordenada esquina_2;
    String color;
    static int contador;
    // Constructor 
    public Rectangulo(Coordenada esquina_1, Coordenada esquina_2,String color){
        this.esquina_1=esquina_1;
        this.esquina_2=esquina_2;
        this.color=color;
        contador++;
    }
    // getters y setters
    public Coordenada get_esq_1()
    {
        return this.esquina_1;
    }

    public Coordenada get_esq_2()
    {
        return this.esquina_2;
    }

    public void set_esq_1(Coordenada esquina_1)
    {
        this.esquina_1=esquina_1;
    }

    public void set_esq_2(Coordenada esquina_2)
    {
        this.esquina_2=esquina_2;
    }

    public void Secucolor()
    {
        switch (contador) {
            case 1 -> color = "Verde";
            case 2 -> color = "Amarillo";
            case 3 -> color = "Rojo";
            case 4 -> color = "Verde";
            case 5 -> color = "Amarillo";
            default -> color = "Verde";
        }
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public String toString() {
        String s=String.format("  Color: "+color+"\n  Esquina 1: "+this.esquina_1+"\n  Esquina 2: "+this.esquina_2);
        return s;
    }
}
