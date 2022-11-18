package Actividad1;

public class Goodies<T>{
    private T id;
    private T description;
    private T price;

    public Goodies(T id, T description, T price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public T getId() {
        return id;
    }

    public T getDescription() {
        return description;
    }

    public T getPrice() {
        return price;
    }
}
