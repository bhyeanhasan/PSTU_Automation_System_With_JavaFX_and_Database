
package Launch;

/*
    Md Babul Hasan (Noyen)
    Patuakhali Science and Technology University
    Faculty of Computer Science and Engineering
    16 th Batch (PSTU-CSE-2019)
    bhyean@gmail.com // B H Yean Hasan
*/

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class admitController implements Initializable {

    @FXML
    private Label reg;

    @FXML
    private Label faculty;

    @FXML
    private Label sem;

    @FXML
    private TextField roll;

    @FXML
    private Label name;
    
    Connection con =null;
    private Statement pst= null;
    private ResultSet rs= null;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, SQLException {
        
        String id= roll.getText();
        connection conn= new connection();
        con = conn.connect();
        
        String query="SELECT reg,name,faculty,session,hall FROM admin WHERE id= ";
        query= query + id;
        
        pst = con.createStatement();
        rs= pst.executeQuery(query);
        
        String cheak=rs.getString(5);
        
        if(cheak.equals("complete")){
        reg.setText(rs.getString(1));
        name.setText(rs.getString(2));
        faculty.setText(rs.getString(3));
        sem.setText(rs.getString(4));
        }
        else
        {
        reg.setText("Pls Complete Payment");
        name.setText("Pls Complete Payment");
        faculty.setText("Pls Complete Payment");
        sem.setText("Pls Complete Payment");
        }
      
        System.out.println(cheak);
        

        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
