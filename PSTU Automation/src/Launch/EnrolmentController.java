
package Launch;

/*
    Md Babul Hasan (Noyen)
    Patuakhali Science and Technology University
    Faculty of Computer Science and Engineering
    16 th Batch (PSTU-CSE-2019)
    bhyean@gmail.com // B H Yean Hasan
*/

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class EnrolmentController implements Initializable {

    Connection con;
    Statement st;
    ResultSet rs;
    
    @FXML
    private TextField id;

    @FXML
    private TextField trx;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException{
        
        String idval=id.getText();
        String trxval=trx.getText();
        
        connection conn= new connection();
        con= conn.connect();
        
        String query="SELECT trxid FROM admin WHERE id= ";
               query=query+idval;
        
        st = con.createStatement();
        rs = st.executeQuery(query);
        
        String bh = rs.getString(1);
        con.close();
        
        if(bh.equals(trxval))
        {
            con= conn.connect();
            String qu= "UPDATE admin SET hall =?, enrolment=? WHERE id = ?";
            PreparedStatement preparedStmt = con.prepareStatement(qu);
            preparedStmt.setString(1,"complete");
            preparedStmt.setString(2,"complete");
            preparedStmt.setString(3,idval);
      
        preparedStmt.execute();
            
            System.out.println("DOne");
        }
        else
        {
            System.out.println("Wrong Trxid");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
