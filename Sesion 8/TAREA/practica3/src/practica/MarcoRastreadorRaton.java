package practica;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MarcoRastreadorRaton extends JFrame {

    private final JLabel etiqueta;
    private final JTextField campoTexto;
    private final JLabel lb;
    private final JLabel lb1;
    public MarcoRastreadorRaton() {
        super("Demostracion de los eventos de raton");
        setLayout(new FlowLayout());
        Icon imag = new ImageIcon("barnie.png");
        Icon imag1 = new ImageIcon("barnie1.png");
        etiqueta = new JLabel("Etiqueta con texto e icono", imag, SwingConstants.LEFT);
        campoTexto = new JTextField(10);
        lb = new JLabel(imag);
        lb1 = new JLabel(imag1);
        
        add(lb);
        add(lb1);
        add(campoTexto);
        add(etiqueta);
        campoTexto.setBackground(Color.gray);
        add(campoTexto, BorderLayout.PAGE_END);
        
        ManejadorRaton manejador = new ManejadorRaton();
        campoTexto.addMouseListener(manejador);
        campoTexto.addMouseMotionListener(manejador);
        lb.addMouseListener(manejador);
        lb1.addMouseListener(manejador);

    }

    private class ManejadorRaton implements MouseListener, MouseMotionListener {
// Los manejadores de eventos de MouseListener
// manejan el evento cuando se suelta el ratón justo después de oprimir el botón

        @Override
        public void mouseClicked(MouseEvent evento) {
        }

// maneja evento cuando se oprime el ratón
        @Override
        public void mousePressed(MouseEvent evento) {
            Icon imag1 = new ImageIcon("barnie1.png");
            lb1.setIcon(imag1);
        }

// maneja evento cuando se suelta el botón del ratón
        @Override
        public void mouseReleased(MouseEvent evento) {
        }

// maneja evento cuando el ratón entra al área
        @Override
        public void mouseEntered(MouseEvent evento) {
            campoTexto.setBackground(Color.GRAY);
        }

// maneja evento cuando el ratón sale del área
        @Override
        public void mouseExited(MouseEvent evento) {
            campoTexto.setBackground(Color.WHITE);
            Icon imag = new ImageIcon("barnie.png");
            lb.setIcon(imag);
        }

// Los manejadores de eventos de MouseMotionListener manejan
// el evento cuando el usuario arrastra el ratón con el botón oprimido
        @Override
        public void mouseDragged(MouseEvent evento) {
        }

// maneja evento cuando el usuario mueve el ratón
        @Override
        public void mouseMoved(MouseEvent evento) {
        }
    } // fin de la clase interna ManejadorRaton
} // fin de la clase MarcoRastreadorRaton
