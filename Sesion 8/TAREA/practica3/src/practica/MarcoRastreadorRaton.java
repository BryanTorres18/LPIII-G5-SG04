package practica;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MarcoRastreadorRaton extends JFrame {

    private final JLabel etiqueta;
    private final JTextField campoTexto;
    private JLabel lb;
    public Icon inicio;
    public Icon fin;

    public MarcoRastreadorRaton() {
        super("Demostracion de los eventos de raton");

        lb = new JLabel();

        inicio = new ImageIcon(getClass().getResource("click1.png"));
        fin = new ImageIcon(getClass().getResource("click3.png"));

        lb.setIcon(inicio);
        this.add(lb);

        etiqueta = new JLabel("Ingrese su nombre",SwingConstants.LEFT);
        etiqueta.setToolTipText("etiqueta");
        add(etiqueta);

        campoTexto = new JTextField(10);
        campoTexto.setBackground(Color.gray);
        add(campoTexto, BorderLayout.PAGE_END);

        //OBJETOS
        ManejadorRaton manejador = new ManejadorRaton();
        ManejadorRaton2 manejador2 = new ManejadorRaton2();

        lb.addMouseListener(manejador2);
        campoTexto.addMouseListener(manejador);

    }

    private class ManejadorRaton implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent evento) {
        }

        @Override
        public void mousePressed(MouseEvent evento) {

        }

        @Override
        public void mouseReleased(MouseEvent evento) {
        }

        @Override
        public void mouseEntered(MouseEvent evento) {
            campoTexto.setBackground(Color.WHITE);
        }

        @Override
        public void mouseExited(MouseEvent evento) {
            campoTexto.setBackground(Color.GRAY);
        }

        @Override
        public void mouseDragged(MouseEvent evento) {
        }

        @Override
        public void mouseMoved(MouseEvent evento) {
        }
    }

    private class ManejadorRaton2 implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent evento) {
            int r = evento.getClickCount();
            if (!evento.isMetaDown()) {
                if (r % 2 == 0) {
                    lb.setIcon(inicio);
                } else {
                    lb.setIcon(fin);
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent evento) {

        }

        @Override
        public void mouseReleased(MouseEvent evento) {
        }

        @Override
        public void mouseEntered(MouseEvent evento) {

        }

        @Override
        public void mouseExited(MouseEvent evento) {
            lb.setIcon(inicio);
        }

        @Override
        public void mouseDragged(MouseEvent evento) {
        }

        @Override
        public void mouseMoved(MouseEvent evento) {
        }
    }
}
