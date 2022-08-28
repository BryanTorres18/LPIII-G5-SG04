package PerfilMedico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PerfilMedico {
    private String primer_nombre;
    private String apellido;
    private String sexo;
    private int dia, mes, anio;
    private int altura;
    private double peso;
    private int edad;
    
    //CONSTRUCTORES
    
    public PerfilMedico(String primer_nombre, String apellido, String sexo,
            int dia, int mes, int anio, int altura, double peso){
        this.primer_nombre=primer_nombre;
        this.apellido=apellido;
        this.sexo=sexo;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.altura=altura;
        this.peso=peso;
    }
    public PerfilMedico(){

    }
    
    //GETS
    
    public String getPrimerNombre(){
    return primer_nombre;
    }
    public String getApellido(){
    return apellido;
    }
    public String getSexo(){
    return sexo;
    }
    public int getDia(){
    return dia;
    }
    public int getMes(){
    return mes;
    }
    public int getAnio(){
    return anio;
    }
    public int getAltura(){
    return altura;
    }
    public double getPeso(){
    return peso;
    }
    
    //SETS
    
    public void setPrimerNombre(String primer_nombre){
        this.primer_nombre = primer_nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public int edadActual()
    {
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd");
        edad = Integer.parseInt(dtf1.format(LocalDateTime.now())) - anio;
        if(mes > Integer.parseInt(dtf2.format(LocalDateTime.now())))
        {
            edad = edad - 1;
        }
        else
        {
            if(mes == Integer.parseInt(dtf2.format(LocalDateTime.now())))
            {
                if(dia == Integer.parseInt(dtf3.format(LocalDateTime.now())))
                {
                    edad = edad - 1;
                }
            }
        }
        return edad;
    }

    public double FCM()
    {
        return 208 - (0.7 * edadActual());
    }

    public double IMC()
    {
        return peso / altura;
    }


}
