/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1_11;

import java.util.ArrayList;

public class CandyBags<T extends Goodies> extends Bag<T> {

    private String golosina;
    private ArrayList<String> lista = new ArrayList<String>();
    private float menor = 0;
    private float mayor;

    public CandyBags(int n) {
        super(n);
    }

    public String cheapest() {

        for (int i = 0; i < list.length; i++) {

            if (list[i].getPrice() < menor) {
                menor = list[i].getPrice();
                golosina = list[i].getClass().getName();
            }
        }
        return golosina;
    }

    public ArrayList<String> mostExpensive(int x) {
        try {
            if (x > list.length) {
                System.out.println("Error");
            } else {
                for (int i = 0; i < list.length; i++) {

                    if (list[i].getPrice() > mayor) {
                        mayor = list[i].getPrice();
                        String a = list[i].getClass().getName();
                        lista.add(a);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
