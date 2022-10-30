package Ejercicio2;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class main extends JFrame {

    JPanel jpanel = (JPanel) this.getContentPane();
    JLabel eArchivo = new JLabel();
    JLabel eLineas = new JLabel();
    JLabel ePalabras = new JLabel();
    JLabel eCaracteres = new JLabel();
    JLabel titulo = new JLabel();

    public main(WordCount wc) {
        
        jpanel.setLayout(null);
        jpanel.setBackground(Color.lightGray);
        
        titulo.setText("LINEAS - PALABRAS - CARACTERES");
        titulo.setBounds(100, 15, 220, 21);
        
        eArchivo.setText("Nombre del Archivo: " + wc.getFichero().getName());
        eArchivo.setBounds(5, 50, 220, 21);      
        
        eLineas = new JLabel("Total de lineas: " + wc.totalLineas());
        eLineas.setBounds(5, 70, 220, 21); 
        
        ePalabras = new JLabel("Total de palabras: " + wc.totalPalabras());
        ePalabras.setBounds(5, 90, 220, 21); 
        
        eCaracteres = new JLabel("Total de caracteres: " + wc.totalCaracteres());
        eCaracteres.setBounds(5, 110, 220, 21); 
        
        jpanel.add(titulo, null);
        jpanel.add(eArchivo, null);
        jpanel.add(eLineas, null);
        jpanel.add(ePalabras, null);
        jpanel.add(eCaracteres, null);
        
        setSize(500, 450);
        setTitle("Contador de Lineas, Palabras y Letras");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        //INICIADOR
        File fichero = new File("C:/src/archivos/TestFile.txt");
        if (fichero.exists()) {
            //LLAMA AL CONSTRUCTOR DONDE INICIA EL METODO "LEER"
            WordCount Wc = new WordCount(fichero);
            //LUEGO LLAMARA AL CONSTRUCTOR "MAIN"
            new main(Wc);
        } else {
            System.out.println("No existe el archivo");
        }
    }

}
