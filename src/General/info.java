package General;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class info {

    @FXML
    private Text nameTXF;

    @FXML
    private Text priceTXF;

    @FXML
    private Text availableTXF;

    @FXML
    private Text unavailableTXF;

    @FXML
    private Button plusbtn;

    @FXML
    private Button minusbtn;

    @FXML
    private TextField tedadTXF;

    @FXML
    private Label noleftTXF;

    @FXML
    private ImageView imageview;

    @FXML
    private ImageView addtocart;

    @FXML
    private ImageView favoritesbtn;

    public Text getNameTXF() {
        return nameTXF;
    }

    public Text getPriceTXF() {
        return priceTXF;
    }

    public Text getAvailableTXF() {
        return availableTXF;
    }

    public Text getUnavailableTXF() {
        return unavailableTXF;
    }

    public TextField getTedadTXF() {
        return tedadTXF;
    }

    @FXML
    void minus(ActionEvent event) {

    }

    @FXML
    void plus(ActionEvent event) {

    }

}
