package Customer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RequestProduct implements Initializable {

    @FXML
    private TextField nameTXF;

    @FXML
    private ComboBox<String> categorycombo;

    @FXML
    private Button sendBTN;

    @FXML
    void sendrequest(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        final ObservableList<String> types = FXCollections.observableArrayList("Electronics", "Furniture", "Clothes","Stationary","Training","Health");
        categorycombo.setItems(types);

    }
}
