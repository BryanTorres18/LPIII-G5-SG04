package Actividad6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial5 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;
        
        try{
            fos = new FileOutputStream("C:/ficheros/alumnos.txt");
            salida = new ObjectOutputStream(fos);
            f = new Fecha(5,9,2011);
            a = new Alumno("11234A", "Lucas Gonzales", 20, f);
            salida.writeObject(a);
            f = new Fecha(5,9,2011);
            a = new Alumno("987456432B", "Anacleto Jimenez Gonzales", 20, f);
            salida.writeObject(a);
            f = new Fecha(5,9,2011);
            a = new Alumno("789465432Z", "Lucas Gonzales", 20, f);
            salida.writeObject(a);
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
