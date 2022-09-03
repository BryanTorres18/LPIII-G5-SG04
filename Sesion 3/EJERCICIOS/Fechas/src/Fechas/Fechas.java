package Fechas;

import java.util.*;

public class Fechas {

    //VARIABLES DE INSTANCIA
    private int dia;
    private int mes;
    private int anio;
    protected int[] diasPorMes = {31,28,31,30,31,30,31,31,30,31,30,31};
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
    public boolean bisiesto(){
        return this.bisiesto(this.anio);
    }
    
    public boolean bisiesto(int anio){
        boolean x = true;
        boolean y = false;
        if(anio % 4 == 0){
            System.out.println("SI es un año bisiesto");
            return x;
        }
        else{
            System.out.println("NO es un año bisiesto");
            return y;
        }
    }
    
    public int diasMes(int mes) {
        int dias = diasPorMes[mes - 1];
        if (bisiesto() && mes == 2){
            dias++;
        }
        return dias; 
    }
    
    private void valida(){
        if(!(this.dia>=1 && this.dia<=31)){
            this.dia=1;
        }    
        if(!(this.mes>0 && this.mes<=12)){
            this.dia=1;
        } 
        if(!(this.anio>=1900 && this.anio<=2050)){
            this.anio=1900;
        } 
    }
    
     public void corta() {
        System.out.println(this.dia+"-"+this.mes+"-"+this.anio);
    }
    
     

}
