
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame {

    private final JButton botonJButtonSimple;
    private final JButton botonJButtonElegante;

    public MarcoBoton() {
        super("GRUPO 4: Torres - Avila");
        setLayout(new FlowLayout());
        botonJButtonSimple = new JButton("Boton simple");
        add(botonJButtonSimple);
        Icon insectol = new ImageIcon(getClass().getResource("insectol.gif"));
        Icon insecto2 = new ImageIcon(getClass().getResource("insecto2.gif"));
        botonJButtonElegante = new JButton("Boton elegante", insectol);
        botonJButtonElegante.setRolloverIcon(insecto2);
        add(botonJButtonElegante);

        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }
    
    private class ManejadorBoton implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent evento){
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format(
                    "Usted oprimio: %s", evento.getActionCommand()));
        }
    }
}
 
