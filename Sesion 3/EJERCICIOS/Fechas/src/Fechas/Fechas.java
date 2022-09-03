package Fechas;

import java.util.*;

public class Fechas {

    //VARIABLES DE INSTANCIA
    private int dia;
    private int mes;
    private int anio;
    Scanner l = new Scanner(System.in);

    //CONSTRUCTORES
    public Fechas() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fechas(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
   
    
    //METODOS
    public void leer() {
        System.out.println("Ingrese el dia (1-31): ");
        this.dia = l.nextInt();
        
        System.out.println("Ingrese el mes (1-12): ");
        this.mes = l.nextInt();
        
        System.out.println("Ingrese el año (1900-2050): ");
        this.anio = l.nextInt();
        
        valida();
        
    }
    
    public void bisiesto(){
        if(anio % 4 == 0){
            System.out.println("SI es un año bisiesto");
        }
        else{
            System.out.println("NO es un año bsiesto");
        }
    }
    
    private void valida(){
        if(dia>=1 && dia<=31){
            if(mes>=1 && mes<=12){
                if(anio>=1900 && anio<=2050){
                    System.out.println("La fecha es correcta");
                    System.out.println(this.dia+"-"+this.mes+"-"+this.anio);
                }
                else{
                    this.anio=1900;
                    System.out.println("El año es incorrecto: "+this.anio);
                }
            }
            else{
                this.mes=1;
                System.out.println("El mes es incorrecto: "+this.mes);
            }
        }
        else{
            this.dia=1;
            System.out.println("El dia es incorrecto: "+this.dia);
        }
    }
    

}
