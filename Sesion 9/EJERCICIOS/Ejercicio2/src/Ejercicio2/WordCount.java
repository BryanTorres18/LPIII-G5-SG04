package Ejercicio2;

import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount extends JFrame {

    private File fichero;
    private String contenido;

    //CONSTRUCTOR CON PARAMETRO FICHERO, QUE AUTOMATICAMENTE LLAMARA AL METODO LEER()
    public WordCount(File fichero) {
        this.fichero = fichero;
        this.contenido = "";
        leer();
    }

    public String leer() {
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
            } else {
                System.out.println("No esta listo para ser leido");
            }
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return this.contenido = aux.toString();
    }

//SET CONTENIDO
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

//GET CONTENIDO
    public String getContenido() {
        return contenido;
    }
//GET FICHERO

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
