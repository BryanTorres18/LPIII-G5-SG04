import java.util.ArrayList;

public class Dictionary <K, V> {
    private final ArrayList<Contacts> diccionario;
    public Dictionary(){
        this.diccionario = new ArrayList<>();
    }

    public void add(K key, V value){
        Contacts<K, V> obj = new Contacts<K,V>(key,value);
        diccionario.add(obj);
    }

    public boolean delete(K key){
        for(int i=0; i<diccionario.size() ; i++){
            if(key.equals(diccionario.get(i).getDNI())){
                diccionario.remove(diccionario.get(i));
                return true;
            }
        }
        return false;
    }

    public Object getValue(K key) throws ObjectNoExist{
        try {
            for(int i=0; i<diccionario.size() ; i++){
                if(key.equals(diccionario.get(i).getDNI()))
                    return diccionario.get(i).getDatos();
            }
        } catch (Exception e) {
            throw new ObjectNoExist("El Contacto no existe no existe");
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

