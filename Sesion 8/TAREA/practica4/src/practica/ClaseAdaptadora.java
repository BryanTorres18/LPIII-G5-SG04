package practica;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class ClaseAdaptadora extends JFrame {

    private final JPanel panel;


    public ClaseAdaptadora() {
        super("Demostracion de los eventos de raton");
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel, BorderLayout.CENTER); 

        ManejadorRaton manejador = new ManejadorRaton();
        panel.addMouseListener(manejador);
        panel.addMouseMotionListener(manejador);
    }

    private class ManejadorRaton implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent evento) {

        }

        @Override
        public void mousePressed(MouseEvent evento) {
            panel.setBackground(Color.GREEN);
        }
        
        @Override
        public void mouseReleased(MouseEvent evento) {

        }

        @Override
        public void mouseEntered(MouseEvent evento) {
            
        }

        @Override
        public void mouseExited(MouseEvent evento) {            
            panel.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent evento) {

        }
        
        @Override
        public void mouseMoved(MouseEvent evento) {

        }
    }
}