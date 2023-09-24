package employee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Addproduct implements Initializable {

    @FXML
    private AnchorPane panelanchor;

    @FXML
    private Button addBTN;

    @FXML
    private Button updatebtn;

    @FXML
    private Button DeleteBTN;

    @FXML
    private Button homebtn;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TableColumn<?, ?> namecol;

    @FXML
    private TableColumn<?, ?> pricecol;

    @FXML
    private TextField productTXF;

    @FXML
    private TextField priceTXF;

    @FXML
    private TextField idTXF;

    @FXML
    private TextField InventoryTXF;

    @FXML
    private ComboBox<String> categorycombo;

    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void home(ActionEvent event) throws IOException {
        openPage("Employee.fxml",homebtn, "employee");
    }

    @FXML
    void update(ActionEvent event) {

    }
    private void openPage(String pageName, Button button,String title) throws IOException {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/"+pageName));
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        final ObservableList<String> types = FXCollections.observableArrayList("Electronics", "Furniture", "Clothes","Stationary","Training","Health");
        categorycombo.setItems(types);
    }
}
