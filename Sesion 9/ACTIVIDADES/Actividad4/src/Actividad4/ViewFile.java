package Actividad4;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class ViewFile extends JFrame{
    private JTextArea areaTexto;
    
    public ViewFile(String s){
        super("Mostrando el contenido de un archivo");
        areaTexto = new JTextArea(s,100,100);
        add(areaTexto);
    }   
}
