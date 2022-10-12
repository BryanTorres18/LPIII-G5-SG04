package practica;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class CampoTextoMarco extends JFrame {

    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoContrasenia;

    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JLabel etiqueta3;
    private final JLabel etiqueta4;

    public CampoTextoMarco() {

        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());
        etiqueta1 = new JLabel("Nombre: ");
        etiqueta1.setToolTipText("Etiqueta 1");
        add(etiqueta1);
        campoTexto1 = new JTextField(10);
        add(campoTexto1);
        etiqueta2 = new JLabel("Usuario :");
        etiqueta2.setToolTipText("Etiqueta 2");
        add(etiqueta2);
        campoTexto2 = new JTextField("Escriba el texto aqui");
        add(campoTexto2);
        etiqueta3 = new JLabel("No Editable :");
        etiqueta3.setToolTipText("Etiqueta 3");
        add(etiqueta3);
        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable(false);
        add(campoTexto3);
        etiqueta4 = new JLabel("Password :");
        etiqueta4.setToolTipText("Etiqueta 4");
        add(etiqueta4);
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia);
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        ManejadorCampoTexto2 manejador2 = new ManejadorCampoTexto2();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
        etiqueta1.addMouseListener(manejador2);
        etiqueta2.addMouseListener(manejador2);
        etiqueta3.addMouseListener(manejador2);
        etiqueta4.addMouseListener(manejador2);

    }

    private class ManejadorCampoTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";
            if (evento.getSource() == campoTexto1) {
                cadena = String.format("Nombre: %s", evento.getActionCommand());
            } else if (evento.getSource() == campoTexto2) {
                cadena = String.format("Usuario: %s", evento.getActionCommand());
            } else if (evento.getSource() == campoTexto3) {
                cadena = String.format("No Editable: %s", evento.getActionCommand());
            } else if (evento.getSource() == campoContrasenia) {
                cadena = String.format("Password: %s", evento.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, cadena);
        }
    }

    public abstract class MouseAdapter implements MouseListener {

        @Override
        public abstract void mouseClicked(MouseEvent evento);

        @Override
        public abstract void mouseExited(MouseEvent e);

        @Override
        public abstract void mouseEntered(MouseEvent e);

        @Override
        public abstract void mouseReleased(MouseEvent e);

        @Override
        public abstract void mousePressed(MouseEvent e);

    }

    public class ManejadorCampoTexto2 extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseClicked(MouseEvent e) {

            String cadena = "";
            if (e.getSource() == etiqueta1) {
                cadena = String.format("Nombre: ");
            } else if (e.getSource() == etiqueta2) {
                cadena = String.format("Usuario: ");
            } else if (e.getSource() == etiqueta3) {
                cadena = String.format("No Editable: ");
            } else if (e.getSource() == etiqueta4) {
                cadena = String.format("Password: ");
            }
            JOptionPane.showMessageDialog(null, cadena);

        }

    }
}
