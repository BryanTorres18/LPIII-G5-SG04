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
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "NOMBRE", "APELLIDOS", "EMAIL", "TELEFONO"};
        String[] registro = new String[5]; //indices segun la variable "titulos"
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from agenda where lastname like '%" + buscar + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("firstname");
                registro[2] = rs.getString("lastname");
                registro[3] = rs.getString("email");
                registro[4] = rs.getString("phone");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public String[] mostrar_txt(String buscar) {

        String[] registro = new String[5];
        
        sSQL = "select * from agenda where lastname like '%" + buscar + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("firstname");
                registro[2] = rs.getString("lastname");
                registro[3] = rs.getString("email");
                registro[4] = rs.getString("phone");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
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
