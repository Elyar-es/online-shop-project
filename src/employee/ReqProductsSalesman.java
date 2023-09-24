package employee;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ReqProductsSalesman {
    private double x,y;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TableView<?> producttable;

    @FXML
    private TableColumn<?, ?> productcol;

    @FXML
    private TableColumn<?, ?> categoryCol;

    @FXML
    private TextField productTXF;

    @FXML
    private TextField priceTXF;

    @FXML
    private TextField idTXF;

    @FXML
    private TextField InventoryTXF;

    @FXML
    private TextField categoryTXF;

    @FXML
    private AnchorPane panelanchor;

    @FXML
    private Button sendBtn;

    @FXML
    private Button rejectBTN;

    @FXML
    private Button homebtn;

    @FXML
    void home(ActionEvent event) throws IOException {
        openPage("salesMan.fxml",homebtn,"Sales Man");
    }

    @FXML
    void reject(ActionEvent event) {

    }

    @FXML
    void send(ActionEvent event) {

    }
    private void openPage(String pageName, Button button,String title) throws IOException {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/"+pageName));
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);

        //drag it here
        root.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {

            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);

        });
        primaryStage.show();


        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }
}
