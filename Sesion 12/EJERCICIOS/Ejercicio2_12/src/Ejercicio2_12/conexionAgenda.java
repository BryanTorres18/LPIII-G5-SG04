package Ejercicio2_12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class conexionAgenda {
    private conexionBD mysql = new conexionBD();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrartabla(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "NOMBRE", "APELLIDOS", "EMAIL", "TELEFONO"};
        String[] registro = new String[5]; //indices segun la variable "titulos"
        modelo = new DefaultTableModel(null, titulos);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from agenda");
            
            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("firstname");
                registro[2] = rs.getString("lastname");
                registro[3] = rs.getString("email");
                registro[4] = rs.getString("phone");
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return modelo;
    }
    
    public boolean insertar(claseAgenda dts) {
        sSQL = "insert into agenda (firstname,lastname,email,phone)"
                + "values (?,?,?,?)";       //se inserta en agenda, base de datos
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL); // Insercion  los datos
            pst.setString(1, dts.getFirstname());
            pst.setString(2, dts.getLastname());
            pst.setString(3, dts.getEmail());
            pst.setString(4, dts.getPhone());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
