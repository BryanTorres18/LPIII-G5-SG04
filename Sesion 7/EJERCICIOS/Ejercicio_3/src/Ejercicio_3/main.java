package Ejercicio_3;
import java.io.IOException;

public class main {

    LeerTeclado lT = new LeerTeclado(System.in);

    public void procesar() throws ExcepcionDeVocal,ExcepcionDeBlanco, ExcepcionDeSalida, ExcepcionDeNumero {
        
        //System.out.flush();
        char caracter;
        try {
            System.out.print("Introduzca un valor: ");
            caracter = Character.toUpperCase(lT.getChar());
        } 
        catch(IOException x){
            System.out.println("-> IOException");
            return;
        } 
        switch(caracter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                throw new ExcepcionDeVocal();
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '0':
                throw new ExcepcionDeNumero();
            case ' ':
                throw new ExcepcionDeBlanco();
            case 'X':
                throw new ExcepcionDeSalida();
        } 
    } 

    public static void main(String args[]) {
        main miPrueba = new main();
        boolean fin = false;
        while(!fin){
            try {
                miPrueba.procesar();
            } catch (ExcepcionDeVocal x) {
                System.out.println("-> EXCEPCION VOCAL");
            } catch (ExcepcionDeNumero x) {
                System.out.println("-> EXCEPCION NUMERO");
            } catch (ExcepcionDeBlanco x) {
                System.out.println("-> EXCEPCION BLANCO");
            } catch (ExcepcionDeSalida x) {
                System.out.println("-> EXCEPCION SALIDA");
                fin = true;
            } finally {
                System.out.println("-> FINALLY \n");
            } 
        }
    } 
} 

