package Ejercicio2;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class main extends JFrame {

    JPanel jpanel = (JPanel) this.getContentPane();
    JLabel eArchivo = new JLabel();
    JLabel eLineas = new JLabel();
    JLabel ePalabras = new JLabel();
    JLabel eCaracteres = new JLabel();
    JLabel titulo = new JLabel();
    JTextArea areaTexto = new JTextArea();

    public main(WordCount wc) throws FileNotFoundException, IOException {

        jpanel.setLayout(null);
        jpanel.setBackground(Color.white);

        titulo.setText("CONTENIDO DEL ARCHIVO");
        titulo.setBounds(170, 15, 220, 21);
        
        byte by[] = new byte[1024];
        FileInputStream file = new FileInputStream(wc.getFichero());
        file.read(by);
        String s = new String(by);
        
        areaTexto = new JTextArea(s, 50, 50);
        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBounds(80, 50, 320, 200);

        eArchivo.setText("Nombre del Archivo: " + wc.getFichero().getName());
        eArchivo.setBounds(5, 270, 220, 21);

        eLineas = new JLabel("Total de lineas: " + wc.totalLineas());
        eLineas.setBounds(5, 290, 220, 21);

        ePalabras = new JLabel("Total de palabras: " + wc.totalPalabras());
        ePalabras.setBounds(5, 310, 220, 21);

        eCaracteres = new JLabel("Total de caracteres: " + wc.totalCaracteres());
        eCaracteres.setBounds(5, 330, 220, 21);

        jpanel.add(titulo, null);
        jpanel.add(scroll, null);
        jpanel.add(eArchivo, null);
        jpanel.add(eLineas, null);
        jpanel.add(ePalabras, null);
        jpanel.add(eCaracteres, null);
        

        setSize(500, 500);
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
