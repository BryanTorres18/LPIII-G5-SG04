package Ejercicio1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class conexionAuthor {

    Statement st;
    ResultSet rs;
    Interface in;
    private conexionBD mysql = new conexionBD();
    private Connection cn = mysql.conectar();
    
    public void setSt(Statement st) {
        this.st = st;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public void setIn(Interface in) {
        this.in = in;
    }

    public void setMysql(conexionBD mysql) {
        this.mysql = mysql;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Statement getSt() {
        return st;
    }

    public ResultSet getRs() {
        return rs;
    }

    public Interface getIn() {
        return in;
    }

    public conexionBD getMysql() {
        return mysql;
    }

    public Connection getCn() {
        return cn;
    }
}
