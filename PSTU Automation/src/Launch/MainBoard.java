
package Launch;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainBoard implements Initializable {
    
    @FXML
    private AnchorPane main;

    @FXML
    private Button bankBtn;

    @FXML
    private Button adminBtn;

    @FXML
    private Button hallBtn;

    @FXML
    private Button deanBtn;

    @FXML
    private Button enrolmentBtn;

    @FXML
    private Button admitBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Label label;
    
    @FXML
    private ImageView pic;

    @FXML
    private AnchorPane window;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("BankLogIn.fxml"));
        window.getChildren().setAll(pane); 
    }
    
    @FXML
    private void adminAction(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("AdminLogIn.fxml"));
        window.getChildren().setAll(pane);    
    }
    
    @FXML
    private void hallAction(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Hall.fxml"));
        window.getChildren().setAll(pane);
    }

    @FXML
    private void deanAction(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Dean.fxml"));
        window.getChildren().setAll(pane);
        
        
    }    
   
    @FXML
    private void enrolmentAction(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Enrolment.fxml"));
        window.getChildren().setAll(pane);
    }
    
    @FXML
    private void admitAction(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("admit.fxml"));
        window.getChildren().setAll(pane);
    }
    
    @FXML
    private void homeButtonAction(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainBoard.fxml"));
        main.getChildren().setAll(pane); 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            
        
    }    
    
}
