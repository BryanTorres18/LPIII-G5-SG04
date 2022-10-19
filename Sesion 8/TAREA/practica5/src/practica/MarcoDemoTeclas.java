package practica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.AttributeSet;

public class MarcoDemoTeclas extends JFrame implements KeyListener {

    private String linea1 = ""; // primera línea del área de texto 
    private String linea2 = ""; // segunda línea del área de texto 
    private String linea3 = ""; // tercera línea del área de texto 
    private JTextArea areaTexto; // área de texto para mostrar la salida
    //private JPanel panel;
    //private JTextPane textpane;

// constructor de MarcoDemoTeclas
    public MarcoDemoTeclas() {
        super("Demostracion de los eventos de pulsacion de teclas");

        areaTexto = new JTextArea(10, 15); // establece el objeto JTextArea 
        areaTexto.setText("Oprima cualquier tecla en el teclado...");
        areaTexto.setEnabled(false);
        areaTexto.setDisabledTextColor(Color.black);
        add(areaTexto); // agrega el área de texto a JFrame
        addKeyListener(this); // permite al marco procesar los eventos de teclas
    }

// maneja el evento de oprimir cualquier tecla
    @Override
    public void keyPressed(KeyEvent evento) {
        String x= KeyEvent.getKeyText(evento.getKeyCode());
        String y = "F1", z = "F2";
  
        if (x == y) {
            areaTexto.setDisabledTextColor(Color.WHITE);
            linea1 = String.format("Tecla oprimida ACCION: " + x);
            establecerLineas2y3(evento);
        } else if (x == z) {
            areaTexto.setDisabledTextColor(Color.YELLOW);
            linea1 = String.format("Tecla oprimida ACCION: " + x);
            establecerLineas2y3(evento);
        } else {
            areaTexto.setDisabledTextColor(Color.BLACK);
            linea1 = String.format("Tecla oprimida ACCION: " + x);
            establecerLineas2y3(evento); // establece las líneas de salida dos y tres
        }
    }
// maneja el evento de liberar cualquier tecla

    @Override
    public void keyReleased(KeyEvent evento) {
        String x= KeyEvent.getKeyText(evento.getKeyCode());
        linea1 = String.format("Tecla liberada: " + x); // muestra la tecla liberada
        establecerLineas2y3(evento); // establece las líneas de salida dos y tres
    }

// maneja el evento de oprimir una tecla de acción
    @Override
    public void keyTyped(KeyEvent evento) {
        char x, y = 'r', z = 'v';
        x = evento.getKeyChar();
        if (x == y) {
            areaTexto.setDisabledTextColor(Color.RED);
            linea1 = String.format("Tecla oprimida NO ACCION: " + x);
            establecerLineas2y3(evento);
        } else if (x == z) {
            areaTexto.setDisabledTextColor(Color.GREEN);
            linea1 = String.format("Tecla oprimida NO ACCION: " + x);
            establecerLineas2y3(evento);
        }else if(x == '/'){
            String cadena = "";
            cadena = String.format("No hay color");
            JOptionPane.showMessageDialog(null, cadena);
        }else {
            areaTexto.setDisabledTextColor(Color.BLACK);
            linea1 = String.format("Tecla oprimida NO ACCION: " + x);
            establecerLineas2y3(evento); // establece las líneas de salida dos y tres
        }

    }
    // establece las líneas de salida dos y tres

    private void establecerLineas2y3(KeyEvent evento) {

        linea2 = String.format("Tecla %ses una tecla de accion", (evento.isActionKey() ? "" : "no "));
        String temp = KeyEvent.getModifiersExText(evento.getModifiersEx());
        linea3 = String.format("Teclas modificadoras oprimidas: %s", (temp.equals("") ? "ninguna" : temp)); // imprime modificadoras
        areaTexto.setText(String.format("%s\n%s\n%s\n", linea1, linea2, linea3)); //
    }
}
