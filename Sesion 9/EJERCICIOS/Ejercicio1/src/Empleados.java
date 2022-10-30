import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.Period;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;


public class Empleados extends JFrame {
    private JPanel panel1;
    private JTextField textNumero;
    private JTextField textSueldo;
    private JTextField textNombre;
    private JButton agregarEmpleadoButton;
    private JTable TableEmpleados;
    private int contador = 1;

    DefaultTableModel model;

    Empleado emp1 = new Empleado();

    //Parametros de la tabla
    private String[] nombresColumna = {"Orden", "Numero", "Nombre", "Sueldo"};


    public Empleados() {
        setTitle("Empresa de Transporte");
        setContentPane(panel1);
        setMinimumSize(new Dimension(400, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        reporteEmpleado();
        TableEmpleados.setModel(reporteEmpleado());



        agregarEmpleadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(textNumero.getText());
                String nombre = textNombre.getText();
                float sueldo = Float.parseFloat(textSueldo.getText());

                emp1.setNumero(numero);
                emp1.setNombre(nombre);
                emp1.setSueldo(sueldo);

                agregarEmpleado(emp1);
                TableEmpleados.setModel(reporteEmpleado());
            }
        });
    }

    private void createTable(){
        TableEmpleados.setModel(new DefaultTableModel(
                null, nombresColumna
        ));
    }

    private void agregarEmpleado(Empleado emp) {
        try{
            FileWriter fw = new FileWriter("Empleados.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(contador + "°");
            pw.print("|" + emp.getNumero());
            pw.print("|" + emp.getNombre());
            pw.println("|" + emp.getSueldo());
            pw.close();
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }

    private DefaultTableModel reporteEmpleado() {
        DefaultTableModel model1 = new DefaultTableModel(nombresColumna, 0);
        try {
            FileReader fr = new FileReader("Empleados.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null){
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                contador += 1;
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                model1.addRow(x);
            }
        }catch (Exception e2){
            System.out.println(e2.getMessage());
        }
        return model1;
    }
}
