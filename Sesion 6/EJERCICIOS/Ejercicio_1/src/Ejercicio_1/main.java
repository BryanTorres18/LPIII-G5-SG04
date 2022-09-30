package Ejercicio_1;

public class main {
    public static void main(String[] args){
        
        FiguraBidimensional FBT = new Triangulo(4.5,5.3);
        FiguraBidimensional FBCu = new Cuadrado(12,4.9);
        FiguraBidimensional FBCi = new Circulo(8.41);
        FiguraTridimensional FTE = new Esfera(25.3);
        FiguraTridimensional FTC = new Cubo(67.3);
        FiguraTridimensional FTT = new Tetraedro(12.5);
        
        Figura[] objFigura ={FBT, FBCu, FBCi, FTE, FTC, FTT};

        for(Figura figuraPolimorfico: objFigura){
            figuraPolimorfico.getArea();
            if(figuraPolimorfico instanceof FiguraTridimensional){
                figuraPolimorfico.getVolumen();
            }
        }
    }
}
