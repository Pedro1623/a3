
package a3;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public Connection conectarBD(){
    Connection conn = null;
        try {
            String url = "jdbc:mysql:\\localhost:3306/a3?user=root&password=";
            conn = (Connection) DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return conn;
    }
    
    
}
