package Ejercicio_2;

public class Ejercicio2 {
    //PARTE 1
    /*
    public static void main(String[] args){
        try{
            System.out.println(metodo("42"));
        }
        catch(Exception e){
            System.out.println("Excepcion en metodo()");
            e.printStackTrace();        //este metodo mostrara el nombre de la expecion y la naturaleza del mensaje y el numero de linea donde ocurrio una excepcion
        }
    }
    private static int metodo(String num){      //creamos nuestro metodo estatico que recibira parametros String 
        int valor = 0;      //generamos una variable int "valor" que tendra asignado el numero 0
        try{
            valor ++;           // 1 <- 0 + 1
            valor += Integer.parseInt(num);     // 43 <- 42 + 1
            valor ++;       //44 <- 43 + 1
            System.out.println("Valor al final del try : " + valor);  // Aca muestra el resultado que es 44
        }
        catch(NumberFormatException e){ //produce cuando se intenta convertir una string con un formato inadecuado en un valor numérico. 
                                         //Eso significa que, cuando no es posible convertir una string en ningún tipo numérico (float, int, etc.), se lanza esta excepción.
                                         //en este caso lo estamos llamando con "e" y lo retornara en caso esto cumple
            valor += Integer.parseInt("42");
            System.out.println("Valor al final del catch : " + valor);
            throw e;
        }
        finally{
            valor ++;
            System.out.println("Valor al final de finally : " + valor);
        }
        valor ++;
        System.out.println("Valor antes del return : " + valor);
        return valor;
    }
    */
    //PRACTICA 2
    /*
    public static void main(String[] args){
        try{
            System.out.println(metodo("w"));
        }
        catch(Exception e){
            System.out.println("Excepcion en metodo()");
            e.printStackTrace();        //este metodo mostrara el nombre de la expecion y la naturaleza del mensaje y el numero de linea donde ocurrio una excepcion
        }
    }
    private static int metodo(String num){      //creamos nuestro metodo estatico que recibira parametros String 
        int valor = 0;      //generamos una variable int "valor" que tendra asignado el numero 0
        try{
            valor ++;           // 1 <- 0 + 1
            valor += Integer.parseInt(num);     // 43 <- 42 + 1
            valor ++;       //44 <- 43 + 1
            System.out.println("Valor al final del try : " + valor);  // Aca muestra el resultado que es 44
        }
        catch(NumberFormatException e){ //produce cuando se intenta convertir una string con un formato inadecuado en un valor numérico. 
                                         //Eso significa que, cuando no es posible convertir una string en ningún tipo numérico (float, int, etc.), se lanza esta excepción.
                                         //en este caso lo estamos llamando con "e" y lo retornara en caso esto cumple
            valor += Integer.parseInt("42");
            System.out.println("Valor al final del catch : " + valor);
        }
        finally{
            valor ++;
            System.out.println("Valor al final de finally : " + valor);
        }
        valor ++;
        System.out.println("Valor antes del return : " + valor);
        return valor;
    }
    */
    //PARTE 3
    public static void main(String[] args){
        try{
            System.out.println(metodo("w"));
        }
        catch(Exception e){
            System.out.println("Excepcion en metodo()");
            e.printStackTrace();        //este metodo mostrara el nombre de la expecion y la naturaleza del mensaje y el numero de linea donde ocurrio una excepcion
        }
    }
    private static int metodo(String num){      //creamos nuestro metodo estatico que recibira parametros String 
        int valor = 0;      //generamos una variable int "valor" que tendra asignado el numero 0
        try{
            valor ++;           // 1 <- 0 + 1
            valor += Integer.parseInt(num);     // 43 <- 42 + 1
            valor ++;       //44 <- 43 + 1
            System.out.println("Valor al final del try : " + valor);  // Aca muestra el resultado que es 44
        }
        catch(NumberFormatException e){ //produce cuando se intenta convertir una string con un formato inadecuado en un valor numérico. 
                                         //Eso significa que, cuando no es posible convertir una string en ningún tipo numérico (float, int, etc.), se lanza esta excepción.
                                         //en este caso lo estamos llamando con "e" y lo retornara en caso esto cumple
            valor += Integer.parseInt("42");
            System.out.println("Valor al final del catch : " + valor);
            throw e;
        }
        finally{
            valor ++;
            System.out.println("Valor al final de finally : " + valor);
        }
        valor ++;
        System.out.println("Valor antes del return : " + valor);
        return valor;
    }
}

  