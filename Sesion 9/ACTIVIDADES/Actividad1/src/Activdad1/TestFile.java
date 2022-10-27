package Activdad1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo o directorio: ");
        Path ruta = Paths.get(sc.nextLine());
        if(Files.exists(ruta)){
            System.out.printf("%n%s existe%n", ruta.getFileName()); //Obtiene el nombre String del archivo o directorio sin informacion sobre la ubicacion
            System.out.printf("%s un directorio%n" , Files.isDirectory(ruta)? "Es" : "No es"); //Recibe un objeto Path y devuelve un boolean que indica si ese objeto Path representa un directorio en el disco
            System.out.printf("%s una ruta absoluta%n", ruta.isAbsolute()? "Es" : "No es"); //Devuelve un boolean que indica si ese objeto PATH representa una ruta absoluta a un archivo o directorio
            System.out.printf("Fecha de ultima modificacion: %s%n", Files.getLastModifiedTime(ruta)); //recibe un objeto Path y devuelvev un objeto FileTime que indica cuándo fue la última vez que se modificó el archivo. 
            System.out.printf("Tamanio: %s%n", Files.size(ruta)); // recibe un objeto Path y devuelve un long que representa el número de bytes en el archivo o directorio.
            System.out.printf("Ruta : %s%n", ruta);
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath()); // convierte el objeto Path con el que se invoca en una ruta absoluta. 
            if(Files.isDirectory(ruta)){
                System.out.printf("%nContenido del directorio:%n");
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta); // obtiene un objeto DirectoryStream<Path> que contiene objetos Path para el contenido del directorio
                for(Path p : flujoDirectorio){
                    System.out.println(p);
                }
            }
        }
        else{
            System.out.printf("%s no existe%n", ruta);
        }
        
    }
}
