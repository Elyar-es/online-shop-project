package General;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchPane implements Initializable {

    @FXML
    private ImageView searchBTN;

    @FXML
    private TextField searchTXF;

    @FXML
    private ImageView loignBTN;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        searchBTN.setOnMouseClicked(event -> {
            System.out.println("you searched" + searchTXF.getText());
        });
    }
}
