
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class AdminLogInController implements Initializable {
    
    @FXML
    private AnchorPane window;
    
    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passField;

    @FXML
    void AdminBtnCntrl(ActionEvent event) throws IOException {
        
        String Name = nameField.getText();
        String Pass = passField.getText();
        
        if(Name.equals("pstu") && Pass.equals("bh"))
        {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        window.getChildren().setAll(pane);
        }
        else
        {
            System.out.println("Wront Password");
        }
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
