package practica;

import javax.swing.JFrame;

public class main {

    public static void main(String[] args) {
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
        marcoRastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoRastreadorRaton.setSize(300, 300);
        marcoRastreadorRaton.setVisible(true);
    }
}
