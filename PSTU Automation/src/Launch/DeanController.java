
package Launch;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import net.proteanit.sql.DbUtils;


public class DeanController implements Initializable {
    
    Connection con=null;
    PreparedStatement pp;
    ResultSet r;
    
     @FXML
    private TableColumn<?, ?> table;
     
     @FXML
    private void dean(ActionEvent event) throws IOException, SQLException {
       
        connection conn=new connection();
        con=conn.connect();
        pp= con.prepareStatement("select * from dean");
        r=pp.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(r));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
