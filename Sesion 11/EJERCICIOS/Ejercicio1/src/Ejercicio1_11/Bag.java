package Ejercicio1_11;

import java.util.Arrays;

public class Bag<T> {
    private final T[] list;
    private int count;

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull, AlreadyInBag {
        for (T i : list) {
            if (i != null) {
                if (i.equals(obj)) {
                    throw new AlreadyInBag();
                }
            }
        }
        if (this.count < list.length) {
            list[count] = obj;
            count++;
        } else {
            throw new IsFull("La bolsa esta llena");
        }
    }

    public int getCount() {
        return this.count;
    }

    public T[] getObjects() throws IsEmpty {
        if (count > 0) {
            return this.list;
        } else {
            throw new IsEmpty("La bolsa esta vacia");
        }
    }

    public T remove(T obj) throws ObjectNoExist {
        int cont = 0;
        for (T i : this.list) {
            if (i != null && i.equals(obj)) {
                T devolver = list[cont];
                for (int j = cont; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[list.length - 1] = null;
                count--;
                return devolver;
            }
            cont++;
        }
        throw new ObjectNoExist("El objeto no existe");
    }

    public int getIndex(T obj) {
        int cont = 0;
        for (T i : this.list) {
            if (i.equals(obj)) {
                return cont;
            }
            cont++;
        }
        return -1;
    }

    public T getObjectList(int index) {
        return this.list[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    public static class IsEmpty extends Exception {

        public IsEmpty(String msg) {
            super(msg);
        }
    }

    public static class IsFull extends Exception {

        public IsFull(String msg) {
            super(msg);
        }
    }

    public static class ObjectNoExist extends Exception {

        public ObjectNoExist(String msg) {
            super(msg);
        }
    }

    public static class AlreadyInBag extends Exception{
        AlreadyInBag(){
            super("El elemento ya esta en la bolsa");
        }
    }
}




