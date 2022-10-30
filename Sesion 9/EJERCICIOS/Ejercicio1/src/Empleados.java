import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
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

    Empleado emp1 = new Empleado();

    //Parametros de la tabla
    private final String[] nombresColumna = {"Orden", "Numero", "Nombre", "Sueldo"};


    public Empleados() {
        setTitle("Agenda");
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
                try {
                    int numero = Integer.parseInt(textNumero.getText());
                    String nombre = textNombre.getText();
                    float sueldo = (Float.parseFloat(textSueldo.getText()));

                    emp1.setNumero(numero);
                    emp1.setNombre(nombre);
                    emp1.setSueldo(sueldo);

                    agregarEmpleado(emp1);
                    textNumero.setText("");
                    textNombre.setText("");
                    textSueldo.setText("");
                    TableEmpleados.setModel(reporteEmpleado());
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "A ocurrido un error en: \n"+ e1.getMessage());
                }

            }
        });
        textNumero.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int key = e.getKeyChar();

                boolean numeros = key >= 48 && key <= 57;

                if (!numeros)
                {
                    e.consume();
                }

                if (textNumero.getText().trim().length() == 10) {
                    e.consume();
                }
            }
        });
        textNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int key = e.getKeyChar();

                boolean mayusculas = key >= 65 && key <= 90;
                boolean minusculas = key >= 97 && key <= 122;
                boolean espacio = key == 32;

                if (!(minusculas || mayusculas || espacio))
                {
                    e.consume();
                }
            }
        });
        textSueldo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != KeyEvent.VK_BACK_SPACE)
                        && (caracter != '.' || textSueldo.getText().contains(".")) ) {
                    e.consume();
                }
            }
        });
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
