package practica;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MarcoRastreadorRaton extends JFrame implements MouseListener, MouseMotionListener{

    private final JLabel etiqueta;
    private final JTextField campoTexto;
    private JLabel lb;
    private JLabel lb1;
    public MarcoRastreadorRaton() {
        super("Demostracion de los eventos de raton");
        this.setLayout(new FlowLayout());
               
        Icon imag = new ImageIcon(getClass().getResource("click1.png"));
        Icon imag1 = new ImageIcon(getClass().getResource("click2.png"));
        
        etiqueta = new JLabel("Ingrese su nombre", imag,SwingConstants.LEFT);
        etiqueta.setToolTipText("etiqueta");
        add(etiqueta);
        
        campoTexto = new JTextField(10);
        add(campoTexto);
        
        //lb.setIcon(imag);
        //this.add(lb);
        //this.pack();
        //this.setLocationRelativeTo(null);
        //this.setVisible(true);
        
        //lb1.setIcon(imag1);
        //this.add(lb1);
        //this.pack();
        //this.setLocationRelativeTo(null);
        //this.setVisible(true);
        
        
        
        

        campoTexto.setBackground(Color.gray);
        add(campoTexto, BorderLayout.PAGE_END);
        //lb.addMouseListener(this);
        //lb1.addMouseListener(this);
        campoTexto.addMouseListener(this);

    }

// Los manejadores de eventos de MouseListener
// manejan el evento cuando se suelta el ratón justo después de oprimir el botón

        @Override
        public void mouseClicked(MouseEvent evento) {
        }

// maneja evento cuando se oprime el ratón
        @Override
        public void mousePressed(MouseEvent evento) {
            
        }

// maneja evento cuando se suelta el botón del ratón
        @Override
        public void mouseReleased(MouseEvent evento) {
        }

// maneja evento cuando el ratón entra al área
        @Override
        public void mouseEntered(MouseEvent evento) {
            campoTexto.setBackground(Color.WHITE);
            
            
        }

// maneja evento cuando el ratón sale del área
        @Override
        public void mouseExited(MouseEvent evento) {
            campoTexto.setBackground(Color.GRAY);
            //lb.setIcon(imag);
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
} // fin de la clase MarcoRastreadorRaton

