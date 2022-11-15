package Ejercicio3;

public class Clase {

    private int x;
    private int y;

    public Clase(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Clase) {
            Clase clase = (Clase) obj;
            if (this.x == clase.x) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
