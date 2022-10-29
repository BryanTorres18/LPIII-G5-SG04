package Ejercicio2;

import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class main {

    private static JLabel eArchivo;
    private static JLabel eLineas;
    private static JLabel ePalabras;
    private static JLabel eCaracteres;

    public static void main(String[] args) throws IOException {
        //INICIADOR

        
        File fichero = new File("C:/src/archivos/TestFile.txt");
        WordCount Wc = new WordCount(fichero);
        
        
        /*
        WordCount Wc2 = new WordCount();
        Wc2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Wc2.setSize(500, 450);
        Wc2.setVisible(true);
         */
 /*
        FileInputStream file;
        byte b[] = new byte[1024];
        try {
            file = new FileInputStream(fichero);
            file.read(b);
            String s = new String(b);
            WordCount Wc2 = new WordCount(fichero, Wc.getContenido());
            Wc2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Wc2.setSize(500, 450);
            Wc2.setVisible(true);
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         */

        
        System.out.println("Nombre del Archivo: " + fichero.getName());
        System.out.println("Total Lineas : " + Wc.totalLineas());
        System.out.println("Total Palabras : " + Wc.totalPalabras());
        System.out.println("Total Caracteres : " + Wc.totalCaracteres());
        
 /*
        FileInputStream file;
        byte b[] = new byte[1024];
        try{
            file = new FileInputStream(fichero);
            file.read(b);
            String s = new String(b);
            WordCount view = new WordCount(s , fichero , Wc.getContenido());
            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            view.setSize(500, 450);
            view.setVisible(true);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
         */
    }

}
