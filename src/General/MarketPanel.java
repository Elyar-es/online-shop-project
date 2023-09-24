package General;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MarketPanel implements Initializable {

    private double x,y;

    @FXML
    private Button electronicsbtn;

    @FXML
    private Button furniturebtn;

    @FXML
    private Button clothesbtn;

    @FXML
    private Button stationarybtn;

    @FXML
    private Button trainingbtn;

    @FXML
    private Button healthbtn;

    @FXML
    private Button homebtn;

    @FXML
    void clothes(ActionEvent event) {

    }

    @FXML
    void elec(ActionEvent event) {

    }

    @FXML
    void furniture(ActionEvent event) {

    }

    @FXML
    void health(ActionEvent event) {

    }

    @FXML
    void home(ActionEvent event) throws IOException {
        openPage("moshtari.fxml",homebtn,"Customer");
    }

    @FXML
    void stationary(ActionEvent event) {

    }

    @FXML
    void training(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private void openPage(String pageName, Button button,String title) throws IOException {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/"+pageName));
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);

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
