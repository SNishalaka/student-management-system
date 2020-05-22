
package lk.ijse.ijsebillingsystem.db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.ijsebillingsystem.view.util.ReadProp;

/**
 *
 * @author suuti
 */
public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;
    private ReadProp readProp;
    
    private DBConnection() {
        
        //String server = readProp.getp
        String database;        
        String user;        
        String password;        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ijse", "root", "suutikolla");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DBConnection getDBConnection() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();

        }
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
