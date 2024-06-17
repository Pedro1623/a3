
package conector;

import java.sql.*;
import java.sql.Connection;

public class ConexaoDAO {
    public static Connection conector(){

    java.sql.Connection conexao = null;
    String driver = "com.mysql.cj.jdbc.Driver";
    String url ="jdbc:mysql://localhost:3306/a3";
    String user = "root";
    String password = "";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
}
}
