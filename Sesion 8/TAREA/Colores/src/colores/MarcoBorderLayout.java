package colores;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MarcoBorderLayout extends JFrame implements ActionListener {
    private final JButton botones[]; // arreglo de botones para ocultar porciones
    private static  String nombres[] = {"Rojo", "Azul",
            "Verde", "Amarillo", "Gris"};
    private static Color[] colores =  {Color.red, Color.blue, Color.green, Color.yellow, Color.gray};
    private final BorderLayout esquema;

    // establece la GUI y el manejo de eventos
    public MarcoBorderLayout() {
        super("Grupo 4: Avila - Torres");

        esquema = new BorderLayout(5, 5); // espacios de 5 píxeles
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

    // maneja los eventos de botón
    @Override
    public void actionPerformed(ActionEvent evento) {
        // comprueba el origen del evento y distribuye el panel de contenido de manera acorde
        for(int i = 0; i < botones.length; i++){
            if(evento.getSource() == botones[i]){
                if(botones[i] == botones[4])
                    JOptionPane.showMessageDialog(null, "No nuestra color");
                else{
                    getContentPane().setBackground(colores[i]);
                    Color color_1 = colores[i];
                    String nombre_1 = botones[i].getText();
                    Color centro = colores[4];
                    String nom_centro = botones[4].getText();

                    colores[i] = centro;
                    nombres[i] = nom_centro;
                    colores[4] = color_1;
                    nombres[4] = nombre_1;

                    botones[4].setText(nombre_1);
                    botones[i].setText(nom_centro);
                }

             }
        }
        esquema.layoutContainer(getContentPane()); // distribuye el panel de contenido
    }
} // fin de la clase MarcoBorderLayout
