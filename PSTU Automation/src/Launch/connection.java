
package Launch;

import java.sql.Connection;
import java.sql.*;

public class connection {
    
    private Driver driver;
    private Connection con=null;
    
    public Connection connect() throws SQLException
    {
        try {
            driver = new org.sqlite.JDBC();
            DriverManager.registerDriver(driver);
            con = DriverManager.getConnection("jdbc:sqlite:pstu.db");
            return con;
        } catch (SQLException sQLException) {
            System.out.println("NOOOO Connection");
            return null;
        }
    }
}
