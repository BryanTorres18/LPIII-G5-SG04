package practica;

import javax.swing.JFrame;

public class main {

    public static void main(String[] args) {
        ClaseAdaptadora claseAdaptadora = new ClaseAdaptadora();
        claseAdaptadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        claseAdaptadora.setSize(300, 100);
        claseAdaptadora.setVisible(true);
    }
}
