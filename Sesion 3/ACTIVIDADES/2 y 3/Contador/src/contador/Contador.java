package contador;

public class Contador{
    static int acumulador = 0;
    final static int VALORINICIAL = 10;
    private int valor;
    static int nContadores = 0;
    static int ultimoContador = 0;
    
    public static int acumulador(){
        return acumulador;
    }
    
    public Contador(int valor){
        this.valor = valor;
        acumulador += valor;
        nContadores++;
        ultimoContador = valor;
    }
    public Contador(){
        this(Contador.VALORINICIAL);
    }
    public void inc(){
        valor++;
        acumulador++;
    }
    
    public int getValor(){
        return this.valor;
    }

}



