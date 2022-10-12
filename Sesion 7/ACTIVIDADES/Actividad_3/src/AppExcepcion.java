public class AppExcepcion {
    public static void main(String[] args) {
        try{
            metodo1();
        }
        catch (Exception exception){
            System.out.println("La excepcion se manejo en main");
        }
        metodo2();
    }
    public static void metodo1() throws Exception{
        try{
            System.out.println("Metodo 1");
            throw new Exception();
        }catch (Exception exception){
            System.out.println("La excepcion se manejo en el metodo 1");
        }
        finally {
            System.out.println("Se ejecuto finally en metodo 1");
        }
    }

    public static void metodo2(){
        try {
            System.out.println("Metodo 2");
        }
        catch (Exception exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("Se ejecuto finally en metodo 2");
        }
    }
}
