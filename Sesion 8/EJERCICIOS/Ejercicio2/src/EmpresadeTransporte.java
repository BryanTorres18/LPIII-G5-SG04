import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpresadeTransporte extends JFrame {
    private JPanel Panel;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel apellidosLabel;
    private JLabel nombresLabel;
    private JLabel documentosDeIdentidadLabel;
    private JTextField textApellidos;
    private JTextField textNombres;
    private JTextField textDNI;
    private JRadioButton soloIdaRadioButton;
    private JRadioButton idaYVueltaRadioButton;
    private JTextField textVuelta;
    private JTextField textIda;
    private JCheckBox audifonosCheckBox;
    private JCheckBox mantasCheckBox;
    private JCheckBox cobijaCheckBox;
    private JCheckBox bebidasAlcolicasCheckBox;
    private JCheckBox almuerzoVegetarianoCheckBox;
    private JCheckBox almuerzoNiñosCheckBox;
    private JRadioButton primerPisoRadioButton;
    private JRadioButton segundoPisoRadioButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JList listServicio;
    private JButton reiniciarButton;
    private JButton imprimirButton;
    private JLabel destinoLabel;
    private JLabel origenLabel;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;



    public EmpresadeTransporte() {
        setTitle("Empresa de Transporte");
        setContentPane(Panel);
        setMinimumSize(new Dimension(900, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // Boton para reinciar el formulario
        reiniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textApellidos.setText("");
                textNombres.setText("");
                textIda.setText("");
                textVuelta.setText("");
                textDNI.setText("");
                soloIdaRadioButton.setSelected(false);
                idaYVueltaRadioButton.setSelected(false);
                audifonosCheckBox.setSelected(false);
                mantasCheckBox.setSelected(false);
                cobijaCheckBox.setSelected(false);
                bebidasAlcolicasCheckBox.setSelected(false);
                almuerzoVegetarianoCheckBox.setSelected(false);
                almuerzoNiñosCheckBox.setSelected(false);
                primerPisoRadioButton.setSelected(false);
                segundoPisoRadioButton.setSelected(false);
                comboBox1.setSelectedIndex(0);
                comboBox2.setSelectedIndex(0);
                listServicio.setSelectedIndex(0);
            }
        });

        // Check box de soloIdaRadioButton
        soloIdaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVuelta.setEditable(false);
            }
        });

        // Check box de IdaYVueltaRadioButton
        idaYVueltaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textIda.setEditable(true);
                textVuelta.setEditable(true);
            }
        });

        //Imprimir la respuesta
        imprimirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(soloIdaRadioButton.isSelected())
                    if(primerPisoRadioButton.isSelected())
                    JOptionPane.showMessageDialog(EmpresadeTransporte.this, String.format(
                            "               Boleto       " +
                                    "\n NOMBRE: %s \n APELLIDO: %s \n DNI: %s \n ORIGEN: %s \n DESTINO: %s \n IDA: %s \n PISO: %s \n SERVICIO: %s \n COMPLEMENTOS: %s",
                            textNombres.getText(), textApellidos.getText(), textDNI.getText(), comboBox1.getSelectedItem(), comboBox2.getSelectedItem(), textIda.getText(), primerPisoRadioButton.getText(), listServicio.getSelectedValue().toString(), validarSeleccion()));
                    else
                        JOptionPane.showMessageDialog(EmpresadeTransporte.this, String.format(
                        "               Boleto       " +
                                "\n NOMBRE: %s \n APELLIDO: %s \n DNI: %s \n ORIGEN: %s \n DESTINO: %s \n IDA: %s \n PISO: %s \n SERVICIO: %s \n COMPLEMENTOS: %s",
                        textNombres.getText(), textApellidos.getText(), textDNI.getText(), comboBox1.getSelectedItem(), comboBox2.getSelectedItem(), textIda.getText(), segundoPisoRadioButton.getText(), listServicio.getSelectedValue().toString(), validarSeleccion()));
                if(idaYVueltaRadioButton.isSelected())
                    if(primerPisoRadioButton.isSelected())
                        JOptionPane.showMessageDialog(EmpresadeTransporte.this, String.format(
                                "               Boleto       " +
                                        "\n NOMBRE: %s \n APELLIDO: %s \n DNI: %s \n ORIGEN: %s \n DESTINO: %s \n IDA: %s \n VUELTA %s \n PISO: %s \n SERVICIO: %s \n COMPLEMENTOS: %s",
                                textNombres.getText(), textApellidos.getText(), textDNI.getText(), comboBox1.getSelectedItem(), comboBox2.getSelectedItem(), textIda.getText(), textVuelta.getText(), primerPisoRadioButton.getText(), listServicio.getSelectedValue().toString(), validarSeleccion()));
                    else
                        JOptionPane.showMessageDialog(EmpresadeTransporte.this, String.format(
                                "               Boleto       " +
                                        "\n NOMBRE: %s \n APELLIDO: %s \n DNI: %s \n ORIGEN: %s \n DESTINO: %s \n IDA: %s \n VUELTA %s \n PISO: %s \n SERVICIO: %s \n COMPLEMENTOS: %s",
                                textNombres.getText(), textApellidos.getText(), textDNI.getText(), comboBox1.getSelectedItem(), comboBox2.getSelectedItem(), textIda.getText(), textVuelta.getText(), segundoPisoRadioButton.getText(), listServicio.getSelectedValue().toString(), validarSeleccion()));
            }
        });
    }

    private String validarSeleccion(){
        String opciones = "";
        if(audifonosCheckBox.isSelected())
            opciones+= "Audifonos,";
        if(mantasCheckBox.isSelected())
            opciones+= "Manta,";
        if(cobijaCheckBox.isSelected())
            opciones+= "Almohada,";
        if(bebidasAlcolicasCheckBox.isSelected())
            opciones+= "Bebidas Alcolicas,";
        if(almuerzoVegetarianoCheckBox.isSelected())
            opciones+= "Almuerzo Vegetariano,";
        if(almuerzoNiñosCheckBox.isSelected())
            opciones+= "Almuerzo Niños,";
        return opciones;
    }

    public static void main(String[] args) {
        EmpresadeTransporte transporte = new EmpresadeTransporte();
    }


}
