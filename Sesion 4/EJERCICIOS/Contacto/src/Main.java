import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList <> ();

        //Variables
        boolean salir = false;
        int opcion;
        int indice;
        String nombre;
        String telefono;
        String direccion;

        //Menu
        do {
            System.out.println("==========Menu=========");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Mostrar contacto");
            System.out.println("7. Salir");
            System.out.println("======================");
            System.out.println("Ingrese:");
            opcion = sn.nextInt();
            sn.nextLine();
            // Mostramos las opciones
            switch (opcion){
                case 1:     //Añadimos contacto
                    System.out.println("Ingrese el nombre:");
                    nombre = sn.nextLine();
                    System.out.println("Ingrese el telefono:");
                    telefono = sn.nextLine();
                    System.out.println("Ingrese el direccion:");
                    direccion = sn.nextLine();
                    contactos.add(new Contacto(nombre,telefono,direccion));
                    break;
                case 2:     //Buscamos contacto
                    System.out.println("Ingrese el nombre:");
                    nombre = sn.nextLine();
                    System.out.println("Ingrese el telefono:");
                    telefono = sn.nextLine();
                    System.out.println("Ingrese el direccion:");
                    direccion = sn.nextLine();

                    if(contactos.contains(new Contacto(nombre, telefono, direccion)))
                        System.out.println("Si se encuentra el contacto buscado");
                    else
                        System.out.println("No se encuentra en nuestra base de datos");
                    break;
                case 3:     //Modificamos contacto
                    System.out.println("Ingrese el nro de orden del contacto:");
                    indice = sn.nextInt();
                    sn.nextLine();
                    contactos.remove(indice);
                    //Ingresamos los nuevos datos
                    System.out.println("Ingrese el nombre:");
                    nombre = sn.nextLine();
                    System.out.println("Ingrese el telefono:");
                    telefono = sn.nextLine();
                    System.out.println("Ingrese el direccion:");
                    direccion = sn.nextLine();
                    contactos.add(indice ,new Contacto(nombre,telefono,direccion));
                    break;
                case 4:       //Borrarmos contacto
                    System.out.println("Ingrese el nro de orden del contacto:");
                    indice = sn.nextInt();
                    contactos.remove(indice);
                    break;
                case 5:       //Eliminamos contacto
                    contactos.clear();
                    break;
                case 6:       //Mostramos contactos
                    for(int i = 0; i < contactos.size(); i++)
                    {
                        System.out.println("===============================================");
                        System.out.println(i + "-> " + "Nombre: " + contactos.get(i).getNombre());
                        System.out.println(i + "-> " + "Telefono: " + contactos.get(i).getTelefono());
                        System.out.println(i + "-> " + "Direccion: " + contactos.get(i).getDireccion());
                        System.out.println("===============================================");
                    }
                    break;
                case 7:
                    salir = true;
            }
        } while (!salir);
    }
}