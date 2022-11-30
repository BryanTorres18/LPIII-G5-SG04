package Ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class conexionAuthor {

    private conexionBD mysql = new conexionBD();
    private Connection cn = mysql.conectar();
    private String sSQL = "";

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"AUTHORID", "FIRSTNAME", "LASTNAME"};

        String[] registro = new String[3]; //indices segun la variable "titulos"

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from author";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("authorid");
                registro[1] = rs.getString("firstname");
                registro[2] = rs.getString("lastname");
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
}
