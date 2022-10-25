/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoborderlayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class MarcoBorderLayout extends JFrame implements ActionListener {

    private final JButton botones[];                                                    // arreglo de botones para ocultar porciones
    private static final String nombres[] = {"ROJO", "AZUL", "VERDE", "ROSADO", "NEGRO"};
    private final BorderLayout esquema;
    private final int posiColores[] = {0, 1, 2, 3, 4};
    private final Color colores[] = {Color.RED, Color.BLUE, Color.GREEN, Color.PINK, Color.BLACK};

// establece la GUI y el manejo de eventos
    public MarcoBorderLayout() {
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
        //  comprueba el origen del evento y distribuye el panel de contenido de manera acorde
        JButton GuardaBoton = botones[0];
        Color GuardaColor = colores[0];

        ActionEvent marcador;              //Genero un marcador
        marcador = evento;

        int capturador = 0;
        /* for ( JButton boton : botones){
        if (evento.getSource() == boton)              
            boton.setVisible(true);
      
    } // oculta el botón oprimido  */
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

                /*if (GuardaBoton == botones[0]) {           //NORTE
                    getContentPane().setBackground(Color.RED);
                    break;

                } else if (GuardaBoton == botones[1]) {        //SUR
                    getContentPane().setBackground(Color.BLUE);
                    

                } else if (GuardaBoton== botones[2]) {        //ESTE
                    getContentPane().setBackground(Color.GREEN);

                } else if (GuardaBoton == botones[3]) {        //OESTE
                    getContentPane().setBackground(Color.PINK);

                } else if (GuardaBoton == botones[4]) {        //CENTRO
                    getContentPane().setBackground(Color.BLACK);
                }*/
                add(botones[j], BorderLayout.CENTER);
                getContentPane().setBackground(colores[j]);
                botones[j] = botones[4];
                botones[4] = GuardaBoton;
                colores[j] = colores[4];
                colores[4] = GuardaColor;


                switch (j) {
                    case 0 -> {
                        add(botones[j], BorderLayout.NORTH);
                        capturador = j;

                    }
                    case 1 -> {
                        add(botones[j], BorderLayout.SOUTH);
                        capturador = j;
                    }
                    case 2 -> {
                        add(botones[j], BorderLayout.EAST);
                        capturador = j;
                    }
                    case 3 -> {
                        add(botones[j], BorderLayout.WEST);
                        capturador = j;
                    }
                    

                    default -> {
                    }

                }

            }

        }
        /*if (GuardaBoton == botones[0]) {           //NORTE
                    getContentPane().setBackground(Color.RED);
                    break;

                } else if (GuardaBoton == botones[1]) {        //SUR
                    getContentPane().setBackground(Color.BLUE);
                    

                } else if (GuardaBoton== botones[2]) {        //ESTE
                    getContentPane().setBackground(Color.GREEN);

                } else if (GuardaBoton == botones[3]) {        //OESTE
                    getContentPane().setBackground(Color.PINK);

                } else if (GuardaBoton == botones[4]) {        //CENTRO
                    getContentPane().setBackground(Color.BLACK);
                }*/
        /*posiColores[capturador] = posiColores[4];
        posiColores[4] = capturador;

        for (int c = 0; c < 4; c++) {

            if (posiColores[c] == posiColores[0]) {
                getContentPane().setBackground(Color.RED);

            } else if (posiColores[c] == posiColores[1]) {
                getContentPane().setBackground(Color.BLUE);

            } else if (posiColores[c] == posiColores[2]) {
                getContentPane().setBackground(Color.GREEN);

            } else if (posiColores[c] == posiColores[3]) {
                getContentPane().setBackground(Color.PINK);

            } else if (posiColores[c] == posiColores[4]) {
                getContentPane().setBackground(Color.BLACK);

            }
        }*/

        /*if (GuardaBoton==botones[4]){
        
        JOptionPane.showMessageDialog(null, "No hay cambio de color", "CENTRO ",JOptionPane.PLAIN_MESSAGE);
        
    }*/
        esquema.layoutContainer(getContentPane()); // distribuye el panel de contenido53    

    }
}
