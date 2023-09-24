package Customer;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class history {

    @FXML
    private Text nameTXF;

    @FXML
    private Text priceTXF;


    @FXML
    private Text numberTXF;

    @FXML
    private ImageView imageview;

    public Text getNameTXF() {
        return nameTXF;
    }

    public Text getPriceTXF() {
        return priceTXF;
    }

    public Text getNumberTXF() {
        return numberTXF;
    }
}
