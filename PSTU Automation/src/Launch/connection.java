
package Launch;

/*
    Md Babul Hasan (Noyen)
    Patuakhali Science and Technology University
    Faculty of Computer Science and Engineering
    16 th Batch (PSTU-CSE-2019)
    bhyean@gmail.com // B H Yean Hasan
*/

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection 
{
    
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
