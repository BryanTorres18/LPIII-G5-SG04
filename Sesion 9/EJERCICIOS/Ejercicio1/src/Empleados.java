import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.Period;
import java.util.List;
import java.util.Vector;


public class Empleados extends JFrame {
    private JPanel panel1;
    private JTextField textNumero;
    private JTextField textSueldo;
    private JTextField textNombre;
    private JButton agregarEmpleadoButton;
    private JTable TableEmpleados;
    private int contador = 0;

    DefaultTableModel model;

    //Parametros de la tabla
    private String[] nombresColumna = {"Orden", "Numero", "Nombre", "Sueldo"};


    public Empleados() {
        setTitle("Empresa de Transporte");
        setContentPane(panel1);
        setMinimumSize(new Dimension(400, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        createTable();
        reporteEmpleado();

        agregarEmpleadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });
    }

    private void createTable(){
        TableEmpleados.setModel(new DefaultTableModel(
                null, nombresColumna
        ));
    }

    private void agregarEmpleado(){
        FileOutputStream f1 = null;
        ObjectOutputStream salida = null;
        Empleado emp;
        model = (DefaultTableModel) TableEmpleados.getModel();
        try {
            f1 = new FileOutputStream("empleados.dat");
            salida = new ObjectOutputStream(f1);

            emp = new Empleado(Integer.parseInt(textNumero.getText()), textNombre.getText(),Double.parseDouble(textSueldo.getText()));
            salida.writeObject(emp);

            contador += 1;
            String[] agregar = new String[4];
            agregar[0] = (contador+"°");
            agregar[1] = textNumero.getText();
            agregar[2] = textNombre.getText();
            agregar[3] = textSueldo.getText();
            model.addRow(agregar);

        }catch (FileNotFoundException e1){
            System.out.println(e1.getMessage());
        }catch (IOException e1){
            System.out.println(e1.getMessage());
        } finally {
            try{
                if(f1 != null)
                    f1.close();
                if(salida != null)
                    salida.close();
            } catch (IOException e1){
                System.out.println(e1.getMessage());
            }
        }
    }

    private void reporteEmpleado(){
        FileInputStream f2 = null;
        ObjectInputStream entrada = null;
        model = (DefaultTableModel) TableEmpleados.getModel();
        Empleado emp2;

        try {
            f2= new FileInputStream("empleados.dat");
            entrada = new ObjectInputStream(f2);

            while(true){
                contador+= 1;
                emp2 = (Empleado) entrada.readObject();
                String[] agregar = new String[4];
                agregar[0] = (contador+"°");
                agregar[1] = (String.valueOf(emp2.getNumero()));
                agregar[2] = (String.valueOf(emp2.getNombre()));
                agregar[3] = (String.valueOf(emp2.getSueldo()));
                model.addRow(agregar);
            }


        } catch (FileNotFoundException e2){
            System.out.println(e2.getMessage());
        } catch (ClassNotFoundException e2){
            System.out.println(e2.getMessage());
        } catch (IOException e2){
            System.out.println(e2.getMessage());
        } finally {
            try{
                if(f2 != null)
                    f2.close();
                if(entrada != null)
                    entrada.close();
            } catch (IOException e2){
                System.out.println(e2.getMessage());
            }
        }
    }
}
