package Ejercicio_3;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeerTeclado {
    private Reader stream;

    public LeerTeclado(InputStream x) {
        stream = new InputStreamReader(x);
    }

    public char getChar() throws IOException {
        return (char) this.stream.read();
    }
}
