package Ejercicio_1;

//PARTE 1
/*
public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        double[] v = new double[15];        //creamos nuestro array que contendra 15 espacios dentro de esta
        acceso(v, 16);                      //jalamos nuestra funcion que esta descrita en la parte inferior de nuestro codigo
    }

    public static double acceso(double[] v, int j) throws Exception {   //asignamos parametros a nuestra funcion "acceso" la cual agregamos la clase Exception
        try {           
        //inicializamos nuestro try - catch
            if (j >= 0 && j <= v.length) {      
                //siendo en este caso -> si 16 es MAYOR IGUAL a 0 Y si 16 es MENOR IGUAL a 15 retorna una nueva cantidad de espacios en el array de v;
                //Siendo en este caso incorrecto y estaria pasando en el "else" que es
                return v[j];
            } else {
                //Lanzara una exception donde dira que "El indice 16 No existe en el vector" siendo, luego de esto lanza el catch
                throw new Exception("El indice " + j + " No existe en el vector "); 
            }
        } catch (RuntimeException exc) { 
            //Al lanzar esto "RuntimeException" es una subclase de Exception, donde este construye una nueva excepción de tiempo de ejecución con null y tambien
            //por el acceso fuera de los limites de una array
            throw exc;
        }
    }
}
*/
//PARTE 2
/*
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        double[] v = new double[15];        //creamos nuestro array que contendra 15 espacios dentro de esta
        acceso(v, 16);                      //jalamos nuestra funcion que esta descrita en la parte inferior de nuestro codigo
    }

    public static double acceso(double[] v, int j) throws Exception {   //asignamos parametros a nuestra funcion "acceso" la cual agregamos la clase Exception
        try {           //inicializamos nuestro try - catch
            if (j >= 0 && j <= v.length) {      //siendo en este caso -> si 16 es MAYOR IGUAL a 0 Y si 16 es MENOR IGUAL a 15 retorna una nueva cantidad de espacios en el array de v;
                                                //Siendo en este caso incorrecto y estaria pasando en el "else" que es
                return v[j];
            } else {
                throw new Exception("El indice " + j + " No existe en el vector "); //Lanzara una exception donde dira que "El indice 16 No existe en el vector" siendo, luego de esto lanza el catch
            }
        } catch (Exception exc) { //Al retornar "Exception" este no se inicializara ya que si no cumple con la condicion estaria mostrando el otro Exception que lo mencionamos en el else
            throw exc;
        }
    }
}
*/
//PARTE 3

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        double[] v = new double[20];        //creamos nuestro array que contendra 15 espacios dentro de esta
        acceso(v, 16);                      //jalamos nuestra funcion que esta descrita en la parte inferior de nuestro codigo
    }

    public static double acceso(double[] v, int j) throws Exception {   //asignamos parametros a nuestra funcion "acceso" la cual agregamos la clase Exception
        try {           //inicializamos nuestro try - catch
            if (j >= 0 && j <= v.length) {  
                System.out.println("El indice "+ j + " si se encuentra en el vector");
            }
            else{
                throw new Exception("El indice " + j + " no existe en el vector ");
            }
            return j;
        } catch (Exception exc){
            System.out.println(exc.getMessage());
            return j;
        }
    }
}
