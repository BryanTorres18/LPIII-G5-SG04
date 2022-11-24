package Ejercicio1_11;

public class Goodies implements Comparable<Goodies> {

    private int id;
    private String description;
    private Float price;

    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Goodies a){
        return this.price.compareTo(a.price);
    }
    @Override
    public boolean equals(Object a){
        if(a instanceof Goodies){
            if (this.id == ((Goodies)a).id){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Goodies{"
                + "id=" + id
                + ", description='" + description + '\''
                + ", price=" + price
                + '}';
    }

}
