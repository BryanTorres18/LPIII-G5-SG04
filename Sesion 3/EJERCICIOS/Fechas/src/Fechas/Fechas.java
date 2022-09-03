package Fechas;

import java.util.*;

public class Fechas {

    //VARIABLES DE INSTANCIA
    private int dia;
    private int mes;
    private int anio;
    protected int[] diasDeMes = {31,28,31,30,31,30,31,31,30,31,30,31};
    protected int[] diasSuma = {0,31,59,90,120,151,181,212,243,273,304,334};
    protected int[] diasSumaBisiesto = {0,31,60,91,121,152,182,213,244,274,305,335};
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
        int dias = diasDeMes[mes - 1];
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
    
    public int diasTranscurridos(){
        Fechas f = new Fechas(1,1,1900);
        return this.difFechas(f);
    } 
    
    public int difFechas(Fechas f){
        int d1 = difInicial(f.dia, f.mes, f.anio);
        int d2 = difInicial(this.dia, this.mes, this.anio);
        return d2 - d1;
    }
    
    public int difInicial(int dia, int mes, int anio) {
        int d;
        if(this.bisiesto(anio)){
		anio--;
		int aniosBisiestos = anio/4 - anio/100 + anio/400;
    		d = anio*365+aniosBisiestos+diasSumaBisiesto[mes-1]+dia-1;
        } 
        else{
		anio--;
		int aniosBisiestos = anio/4 - anio/100 + anio/400;
    		d = anio*365+aniosBisiestos+diasSuma[mes-1]+dia-1;
        }
        return d;
    }
    
    public String diaSemana(){
        String[] dias = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        String diaSemana = dias[this.diasTranscurridos()%7];
        return diaSemana;
    }
    
    public String larga() {
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String imprimir = this.diaSemana()+" "+this.dia+" de "+meses[this.mes - 1]+" de "+this.anio;
        System.out.println(imprimir);
        return imprimir;
    }
    
    public void fechaTras(long dias) {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
        do{
            this.siguiente();
            dias--;
        }while(dias > 0);        
    }
    
    public int diasEntre(Fechas f) {
        return this.difFechas(f);
    }
    
    public void siguiente() {
        if (this.dia == diasMes(this.mes)) {
            this.dia = 1;
            if (this.mes == 12) {
                this.mes = 1;
                this.anio++;
            } else {
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }
    
    public void anterior() {
        if (this.dia == 1) {
            if (this.mes == 1) {
                this.dia = 31;
                this.mes = 12;
                this.anio--;
            } else {
                this.dia = 31;
                this.mes--;
            }
        } else {
            this.dia--;
        }
    }
    
    public void fechaFutura(long dias){
        Fechas f = new Fechas(this.dia, this.mes, this.anio);
        int actual = difInicial(f.dia, f.mes, f.anio);
        long futura = actual + dias;
        futura = this.dia;
        larga();
    }
    public Fechas copia() {
	return new Fechas(this.dia, this.mes, this.anio);
    }
    
    public boolean igualQue(Fechas f1, Fechas f2) {
        boolean x = true;
        boolean y = false;
        if(f1.dia == f2.dia && f1.mes == f2.mes && f1.anio == f2.anio){
            return x;
        }
        else{
            return y;
        }
    }
    
    public boolean menorQue(Fechas f1, Fechas f2){
        boolean x = true;
        boolean y = false;
        if (this.difFechas(f1) < this.difFechas(f2)){
            return x;
        }
        else{
            return y;
        }
    }

    public boolean mayorQue(Fechas f1, Fechas f2){
        boolean x = true;
        boolean y = false;
        if (this.difFechas(f1) > this.difFechas(f2)){
            return x;
        }
        else{
            return y;
        }
    }
}
