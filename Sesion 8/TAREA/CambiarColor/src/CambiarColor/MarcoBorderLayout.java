package CambiarColor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MarcoBorderLayout extends JFrame implements ActionListener {

    private final JButton botones[]; // arreglo de botones para ocultar porciones
    private static final String nombres[] = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};
    private final BorderLayout esquema;

    // establece la GUI y el manejo de eventos
    public MarcoBorderLayout() {
        super("GRUPO 4 : Torres - Avila");

        esquema = new BorderLayout(15, 15); // espacios de 5 píxeles 
        setLayout(esquema);
        botones = new JButton[nombres.length];
        // crea objetos JButton y registra componentes de escucha para ellos
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }
        
        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        /*
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            
        }
        */
        if(evento.getSource()==botones[0]){
            getContentPane().setBackground(Color.red);
            
        }
        else if(evento.getSource()==botones[1]){
            getContentPane().setBackground(Color.green);
        }
        else if(evento.getSource()==botones[2]){
            getContentPane().setBackground(Color.blue);
        }
        else if(evento.getSource()==botones[3]){
            getContentPane().setBackground(Color.yellow);
        }
        else if(evento.getSource()==botones[4]){
            String cadena = "";
            cadena = String.format("No hay color");
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
}
