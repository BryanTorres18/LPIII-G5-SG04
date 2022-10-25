package CambiarColor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MarcoBorder extends JFrame implements ActionListener {

    private final JButton botones[];                                                    // arreglo de botones para ocultar porciones
    private static final String nombres[] = {"ROJO", "AZUL", "VERDE", "ROSADO", "NEGRO"};
    private final BorderLayout esquema;
    private final Color colores[] = {Color.RED, Color.BLUE, Color.GREEN, Color.PINK, Color.BLACK};

// establece la GUI y el manejo de eventos
    public MarcoBorder() {
        super("Demostracion de BorderLayout");

        esquema = new BorderLayout(5, 5);       // espacios de 5 píxeles22

        setLayout(esquema);

        botones = new JButton[nombres.length];      // crea objetos JButton y registra componentes de escucha para ellos

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

// maneja los eventos de botón40     
    @Override
    public void actionPerformed(ActionEvent evento) {
        JButton GuardaBoton = botones[0];
        Color GuardaColor = colores[0];

        ActionEvent marcador;              //Genero un marcador
        marcador = evento;

        for (int i = 0; i < 5; i++) {

            if (marcador.getSource() == botones[i]) {
                GuardaBoton = botones[i];
                GuardaColor = colores[i];
            }

        }

        if (marcador.getSource() == botones[4]) {
            JOptionPane.showMessageDialog(null, "No hay cambio de color", "CENTRO ", JOptionPane.PLAIN_MESSAGE);
        }

        for (int j = 0; j < 4; j++) {
            if (GuardaBoton == botones[j]) {
                add(botones[j], BorderLayout.CENTER);
                getContentPane().setBackground(colores[j]);
                botones[j] = botones[4];
                botones[4] = GuardaBoton;
                colores[j] = colores[4];
                colores[4] = GuardaColor;

                switch (j) {
                    case 0 -> {
                        add(botones[j], BorderLayout.NORTH);
                    }
                    case 1 -> {
                        add(botones[j], BorderLayout.SOUTH);
                    }
                    case 2 -> {
                        add(botones[j], BorderLayout.EAST);
                    }
                    case 3 -> {
                        add(botones[j], BorderLayout.WEST);
                    }
                }

            }

        }
        esquema.layoutContainer(getContentPane()); // distribuye el panel de contenido53    

    }
}
