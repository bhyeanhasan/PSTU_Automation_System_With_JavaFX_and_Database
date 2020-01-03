
package Launch;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class DeanController implements Initializable {
    
        // The table and columns
    @FXML
    TableView<DeanController> itemTbl;
 
    @FXML
    TableColumn itemIdCol;
    @FXML
    TableColumn itemNameCol;
    @FXML
    TableColumn itemQtyCol;
    @FXML
    TableColumn itemPriceCol;
 
    // The table's data
    ObservableList<DeanController> data;
    
    @FXML
    private void handleButtonAction(ActionEvent event){
       
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        itemIdCol.setCellValueFactory(
            new PropertyValueFactory<DeanController,String>("id")
        );
        itemNameCol.setCellValueFactory(
            new PropertyValueFactory<DeanController,String>("name")
        );
        itemQtyCol.setCellValueFactory(
            new PropertyValueFactory<DeanController,Integer>("qty")
        );
        itemPriceCol.setCellValueFactory(
            new PropertyValueFactory<DeanController,String>("price")
        );
 
        data = FXCollections.observableArrayList();
        itemTbl.setItems(data);
    }    
    
}
