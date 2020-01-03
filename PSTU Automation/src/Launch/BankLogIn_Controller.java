
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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;


public class BankLogIn_Controller implements Initializable {
    
    @FXML
    private AnchorPane windo;
    
    @FXML
    private TextField nameField;

    @FXML
    private Button bankBtn;

    @FXML
    private Label bankLabel;

    @FXML
    private PasswordField passField;
    
    @FXML
    private void bankBtnCntrl(ActionEvent event) throws IOException {
        
        String BankName=nameField.getText(),    BankPass=passField.getText();
        
        if("bh".equals(BankPass) && "pstu".equals(BankName))
        {
                 
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Bank.fxml"));
        windo.getChildren().setAll(pane);
                 
        bankLabel.setText("Successfullllll");
        }
        else
        {
        bankLabel.setText("Wrong Admin Name or Password");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
