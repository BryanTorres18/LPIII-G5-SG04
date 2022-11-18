package Actividad1;

public class main {

    public static void main(String[] args) throws Exception {
        //CONSTRCUTORES
        Persona pe = new Persona("Carlos", "Calle Arequipa","961761475");
        Goodies g = new Goodies(15, "Amarillo", (float) 6.98);
        Procedencia pr = new Procedencia("Arequipa", "Yanahuara");
        Estudiante e = new Estudiante("Aplicado", pr, "Carlos", "Calle Arequipa","961761475");
        
        //PERSONA
        String[] arrayPersona = {"Juan", "Avenida Ejercito", "961761475"};
        Verificadora<String> vPersona = new Verificadora<String>(arrayPersona);
        System.out.println("VERIFICACION NOMBRES - PERSONA: ");
        boolean msg = vPersona.contiene(pe.getNombres());
        System.out.println(msg);
        
        //GOODIES
        Object[] vector = new Object[3];
        vector[0] = 15;
        vector[1] = "Verde";
        vector[2] = 3.69;

        Verificadora<Object> vGoodies = new Verificadora<Object>(vector);
        System.out.println("VERIFICACION ID - GOODIES: ");
        boolean msg2 = vGoodies.contiene(g.getId());
        System.out.println(msg2);
        
        //ESTUDIANTE
        String[] arrayEstudiante = {"Estudioso", "Arequipa", "Yanahuara", "Jose","Avenida Ejercito", "961761475"};
        Verificadora<String> vEstudiante = new Verificadora<String>(arrayEstudiante);
        
        System.out.println("VERIFICACION NOMBRE - ESTUDIANTE: ");
        boolean msg3 = vEstudiante.contiene(e.getNombres());
        System.out.println(msg3);
        
        System.out.println("VERIFICACION DEPARTAMENTO - ESTUDIANTE: ");
        boolean msg4 = vEstudiante.contiene(e.getP().getDepartamento());
        System.out.println(msg4);
        
        System.out.println("VERIFICACION PROVINCIA - ESTUDIANTE: ");
        boolean msg5 = vEstudiante.contiene(e.getP().getProvincia());
        System.out.println(msg5);
    }
}
