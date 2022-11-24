package Ejercicio1_11;

import java.util.Arrays;

public class CandyBags<T extends Goodies> extends Bag<T> {

    public CandyBags(int n) {
        super(n);
    }

    public T cheapest(){
        try{

            int cuenta = this.getCount();
            if (cuenta < 0){
                throw new IsEmpty();
            }
            
            T menor = getObjectList(0);
            for(int i =0; i< cuenta ; i++){
                if (menor.compareTo(getObjectList(i)) > 0){
                    menor = getObjectList(i);
                }
            }
            return menor;
        }catch (IsEmpty e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void sortBag(int a,int b) throws Bag.IsEmpty {
        Arrays.sort(this.getObjects(),a,b);
    }

    public CandyBags<T> mostExpensive(int n){
        try{
            if (this.getCount()<n){
                throw new NotEnoughItems();
            }
            sortBag(0,this.getCount());
            CandyBags<T> listaDevolver = new CandyBags<>(n);
            for(int i = this.getCount()-n; i < getCount(); i++){
                listaDevolver.add(getObjectList(i));
            }
            return listaDevolver;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static class NotEnoughItems extends Exception{
        NotEnoughItems(){
            super("El numero recibido excede la cantidad de elementos en la bolsa");
        }
    }

    private static class IsEmpty extends Exception{
        IsEmpty(){
            super("La bolsa esta vacia!");
        }
    }

}
