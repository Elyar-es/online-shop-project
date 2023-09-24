package General;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartPage implements Initializable {
    private double x,y;

    @FXML
    private Button managerBTN;

    @FXML
    private Button salesmanBTN;

    @FXML
    private Button employeeBTN;

    @FXML
    private Button customerBTN;

    @FXML
    private ImageView exitbtn;

    @FXML
    void customer(ActionEvent event) throws IOException {
        openPage("moshtari.fxml",customerBTN,"moshtari");
    }

    @FXML
    void employee(ActionEvent event) throws IOException {
        openPage("Employee.fxml",employeeBTN,"Employee");
    }

    @FXML
    void manager(ActionEvent event) throws IOException {
        openPage("manager.fxml",managerBTN,"Manager");
    }

    @FXML
    void salesman(ActionEvent event) throws IOException {
        openPage("salesMan.fxml",salesmanBTN,"salesman");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        exitbtn.setOnMouseClicked(event -> {
            System.exit(0);
        });
    }

    private void openPage(String pageName, Button button, String title) throws IOException {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/" + pageName));
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
