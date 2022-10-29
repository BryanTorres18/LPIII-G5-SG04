package Ejercicio2;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.*;
import java.util.ResourceBundle;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.*;

public class WordCount extends JFrame {

    private File fichero;
    private String contenido;

    private JPanel panelArriba = new JPanel();
    private JPanel panelAbajo = new JPanel();
    private JTextArea areaTexto;
    private JLabel titulo;
    private JLabel eArchivo;
    private JLabel eLineas;
    private JLabel ePalabras;
    private JLabel eCaracteres;

    //CONSTRUCTOR VACIO
    public WordCount() {

    }

    //CONSTRUCTOR CON PARAMETRO FICHERO, QUE AUTOMATICAMENTE LLAMARA AL METODO LEER()
    public WordCount(File fichero) {
        this.fichero = fichero;
        this.contenido = "";
        leerContenido();
    }
    
    //CONSTRUCTOR TEXTAREA
    public WordCount(String s) {
        super("Contador de Lineas, Palabras y Letras");
        int lineas = 0, palabras = 0, caracteres = 0;
        setLayout(new FlowLayout());
        titulo= new JLabel("CONTENIDO DEL ARCHIVO");
        titulo.setVerticalTextPosition(SwingConstants.TOP);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        areaTexto = new JTextArea(s, 6, 40);
        /*
        eArchivo = new JLabel("Nombre del Archivo: " );
        eArchivo.setHorizontalTextPosition(SwingConstants.CENTER);
        eArchivo.setVerticalTextPosition(SwingConstants.BOTTOM);
        eLineas = new JLabel("Total de lineas: ");
        eLineas.setHorizontalTextPosition(SwingConstants.CENTER);
        ePalabras = new JLabel("Total de palabras: ");
        ePalabras.setHorizontalTextPosition(SwingConstants.CENTER);
        eCaracteres = new JLabel("Total de caracteres: ");
        eCaracteres.setHorizontalTextPosition(SwingConstants.CENTER);
        */
        add(titulo);
        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll);
        /*
        add(eArchivo);
        add(eLineas);
        add(ePalabras);
        add(eCaracteres);
        */
    }

    public void leerContenido() {
        String cadena;
        FileReader archivo;
        BufferedReader lector;
        StringBuilder aux = new StringBuilder();
        try {
            archivo = new FileReader(this.fichero);
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                while ((cadena = lector.readLine()) != null) {
                    aux.append(cadena);
                    aux.append("\n");
                }
                
                byte by[] = new byte[1024];
                FileInputStream file = new FileInputStream(fichero);
                file.read(by);
                String s = new String(by);
                WordCount Wc = new WordCount(s);
                Wc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Wc.setSize(500, 450);
                Wc.setVisible(true);

            } else {
                System.out.println("No esta listo para ser leido");
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
        this.contenido = aux.toString();

    }

//SET CONTENIDO
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

//GET CONTENIDO
    public String getContenido() {
        return contenido;
    }

    public File getFichero() {
        return fichero;
    }

    //METODOS
    //OBTENEMOS LA CANTIDAD DE LINEAS EN EL FICHERO
    public int totalLineas() {
        
        if (this.contenido == "") {   //PREGUNTAMOS SI ES CONTENIDO ES IGUAL A "ESPACIO VACIO"
            return 0;
        } else {
            /*
        Lo que hacemos es que el "split" hace que todos los salto de lineas se 
        vayan contando de acuerdo lo que pongamos en nuestro .txt gracias al length
             */
            return this.contenido.split("\n").length;
        }
    }

    //OBTENEMOS LA CANTIDAD DE CARACTERES EN EL FICHERO
    public int totalCaracteres() {
        /*
        "replaceAll()" funciona reemplazando parte de las cadenas
        "replace()" funciona reemplazando caracteres
        "\\s+" se enfoca en los espacio entre cadenas de texto
        
        En si lo que hace es primero juntar todas las lineas con espacios en espacios vacios
        haciendo que todas las palabras se junten, para luego
        cambiar los saltos de linea en espacios vacios haciendo que asi todo se junte en una sola linea
        Finalmente con esto contamos la cantidad de caracteres con "length()"
         */
        return this.contenido.replaceAll("\\s+", "").replace("\n", "").length();
    }

    //OBTENEMOS LA CANTIDAD DE PALABRAS EN EL FICHERO
    public int totalPalabras() {
        //Si el contenido esta vacio retorna 0
        if (this.contenido == "") {
            return 0;
        } else {
            /*
        "replace()" funciona reemplazando caracteres
            
        Lo que estamos haciendo es reemplzar todos los saltos de linea en espacios
        para que de esta forma todo este en una linea. 
        Finalmente con el "split" queremos encontrar los espacios y que solo
        saque las palabras, gracias al "length" estara contando cuantas palabras
        tendremos
             */

            return this.contenido.replace("\n", " ").split("\\s+").length;
        }
    }

    
}
