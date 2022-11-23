import java.util.ArrayList;

public class Dictionary <K, V> {
    private final ArrayList<OrderedPair> diccionario;
    public Dictionary(){
        this.diccionario = new ArrayList<>();
    }

    public void add(K key, V value){
        OrderedPair<K, V> obj = new OrderedPair<K,V>(key,value);
        diccionario.add(obj);
    }

    public boolean delete(K key){
        for(int i=0; i<diccionario.size() ; i++){
            if(key.equals(diccionario.get(i).getKey())){
                diccionario.remove(diccionario.get(i));
                return true;
            }
        }
        return false;
    }

    public Object getValue(K key) throws ObjectNoExist{
        try {
            for(int i=0; i<diccionario.size() ; i++){
                if(key.equals(diccionario.get(i).getKey()))
                    return diccionario.get(i).getValue();
            }
        } catch (Exception e) {
            throw new ObjectNoExist("El Objecto no existe");
        }
        return null;
    }

    @Override
    public String toString() {
        return "  ---------------- Contenido Diccionario ----------------\n"
                + "Dictionary{"+
                "diccionario=" + diccionario +
                '}';
    }
}

