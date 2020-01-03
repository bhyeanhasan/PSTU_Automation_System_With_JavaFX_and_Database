
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
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class HallController implements Initializable {

    @FXML
    private TableView<AdminData> table;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> regCol;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TableColumn<?, ?> hallCol;
    
    
    Connection con =null;
    private PreparedStatement pst= null;
    private ResultSet rs= null;
    private ObservableList<AdminData> data;
    
    private void setCellTable()
    {
        idCol.setCellValueFactory(new PropertyValueFactory("id"));
        regCol.setCellValueFactory(new PropertyValueFactory("Reg"));    
        nameCol.setCellValueFactory(new PropertyValueFactory("Name"));
        hallCol.setCellValueFactory(new PropertyValueFactory("hall"));
    }
    
    private void loadData() throws SQLException
    {
        pst = con.prepareStatement("select * from admin");
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            data.add(new AdminData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(7)));
        }
        
        table.setItems(data);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        connection  connn= new connection();
        
        try{
            
            con = connn.connect();
            data = FXCollections.observableArrayList();
            setCellTable();
            loadData();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
