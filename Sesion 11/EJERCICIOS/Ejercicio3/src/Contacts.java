public class Contacts<K,V> {
    private K DNI;
    private V datos;

    public Contacts(K DNI, V datos) {
        this.DNI = DNI;
        this.datos = datos;
    }

    public K getDNI() {
        return DNI;
    }

    public void setDNI(K DNI) {
        this.DNI = DNI;
    }

    public V getDatos() {
        return datos;
    }

    public void setDatos(V datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "DNI=" + DNI +
                ", datos=" + datos +
                '}';
    }
}
