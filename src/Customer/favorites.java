package Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class favorites implements Initializable {
    private ArrayList<String> product=new ArrayList<>();

    public ArrayList<String> getProduct() {
        return product;
    }

    public Text getNameTXF() {
        return nameTXF;
    }

    public Text getPriceTXF() {
        return priceTXF;
    }

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
    private ImageView unfavoriteBTN;

    @FXML
    void minus(ActionEvent event) {

    }

    @FXML
    void plus(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        product.add("TV");
        product.add("computer");
    }
}
