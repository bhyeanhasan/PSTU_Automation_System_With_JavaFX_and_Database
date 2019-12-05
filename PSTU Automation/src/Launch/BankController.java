
package Launch;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;



public class BankController implements Initializable {

    @FXML
    private TextField idFld;

    @FXML
    private TextField regFld;
    
    @FXML
    private TextField takaFld;

    
    @FXML
    private void okhandleButtonAction(ActionEvent event) throws IOException, SQLException {
        
        connection concs= new connection();
        Connection con= null;
        con=concs.connect();
        
        System.out.println(con);
        
        int ID, BIL;
        
        ID=Integer.parseInt(idFld.getText());
        BIL=Integer.parseInt(takaFld.getText());
    try{    
        String query = "insert into bank (id,bill) values (?, ?)";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setInt(1, ID);
        preparedStmt.setInt(2, BIL);
        preparedStmt.execute();
        System.out.println("yesS");
    }
    catch(Exception e)
    {
        System.out.println("cant insert"+e);
    }
    
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
