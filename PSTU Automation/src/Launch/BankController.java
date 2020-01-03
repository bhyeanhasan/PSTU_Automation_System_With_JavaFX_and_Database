
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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class BankController implements Initializable {

    @FXML
    private TextField idFld;

    @FXML
    private TextField regFld;
    
    @FXML
    private TextField takaFld;
    
    @FXML
    private Label confermbox;

    
    @FXML
    private void okhandleButtonAction(ActionEvent event) throws IOException, SQLException {
        
        connection concs= new connection();
        Connection con= null;
        con=concs.connect();
        
        System.out.println(con);
        
        String ID;
        int BIL;
        
        ID=idFld.getText();
        BIL=Integer.parseInt(takaFld.getText());
        
        
if(BIL>=4000){
    
    try{    
        //String query = "insert into bank (id,bill) values (?, ?)";
        String query="UPDATE admin SET hall =?, enrolment=? WHERE id = (?)";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        
        preparedStmt.setString(1,"complete");
        preparedStmt.setString(2,"complete");
        preparedStmt.setString(3,ID);
      
        preparedStmt.execute();
        System.out.println("yes");
        confermbox.setText("DONE");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
else
{
    confermbox.setText("Enrolment Charge is 4000 BDT");
}
    
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
