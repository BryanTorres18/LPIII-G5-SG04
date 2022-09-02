package contador;

public class Contador{
    static int acumulador = 0;
    static final int VALORINICIAL = 10;
    private int valor;
    
    public static int acumulador(){
        return acumulador;
    }
    
    public Contador(int valor){
        this.valor = valor;
        acumulador += valor;
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



