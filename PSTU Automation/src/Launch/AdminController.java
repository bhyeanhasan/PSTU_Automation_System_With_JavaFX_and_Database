
/*
    Md Babul Hasan (Noyen)
    Patuakhali Science and Technology University
    Faculty of Computer Science and Engineering
    16 th Batch (PSTU-CSE-2019)
    bhyean@gmail.com // B H Yean Hasan
*/
package Launch;

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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AdminController implements Initializable {
    
    Connection con =null;
    private PreparedStatement pst= null;
    private ResultSet rs= null;
    
    private ObservableList<AdminData> data;
    
    @FXML
    private TableView<AdminData> table;

    @FXML
    private TableColumn<?,? > idCol;

    @FXML
    private TableColumn<?,? > regCol;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TableColumn<?, ?> facultyCol;

    @FXML
    private TableColumn<?, ?> sessionCol;
    
     @FXML
    private TextField dltid;

    @FXML
    private TextField session;

    @FXML
    private TextField faculty;

    @FXML
    private TextField name;

    @FXML
    private TextField id;

    @FXML
    private TextField reg;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException{
        
        try{
        connection conn = new connection();
        con = conn.connect();
        String query="Insert into admin (id,reg,name,faculty,session,enrolment,hall,trxid) values (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        
        preparedStmt.setString(1,id.getText());
        preparedStmt.setString(2,reg.getText());
        preparedStmt.setString(3,name.getText());
        preparedStmt.setString(4,faculty.getText());
        preparedStmt.setString(5,session.getText());
        preparedStmt.setString(6,"0");
        preparedStmt.setString(7,"0");
        preparedStmt.setString(8,"0");
        
        preparedStmt.execute();
        
        data = FXCollections.observableArrayList();
        setCellTable();
        loadData();
 
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    @FXML
    private void deleteButtonAction(ActionEvent event) throws SQLException{
        try
        {
        connection conn = new connection();
        con = conn.connect();
        
        String query= "delete from admin where id =?";
        
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1,dltid.getText());
        preparedStmt.execute();
        
        data = FXCollections.observableArrayList();
        setCellTable();
        loadData();
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    private void setCellTable()
    {
        idCol.setCellValueFactory(new PropertyValueFactory("id"));
        regCol.setCellValueFactory(new PropertyValueFactory("Reg"));    
        nameCol.setCellValueFactory(new PropertyValueFactory("Name"));
        facultyCol.setCellValueFactory(new PropertyValueFactory("Faculty"));
        sessionCol.setCellValueFactory(new PropertyValueFactory("Session"));
        
    }
    
    private void loadData() throws SQLException
    {
        
        pst = con.prepareStatement("select * from admin");
        rs = pst.executeQuery();
        while(rs.next())
        {
            data.add(new AdminData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
        }
        
        table.setItems(data);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        connection  connn= new connection();
        
        try {
            con = connn.connect();
            data = FXCollections.observableArrayList();
            setCellTable();
            loadData();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}
