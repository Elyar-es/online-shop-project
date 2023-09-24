package Manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class NewEmployee {

    private double x,y;

    @FXML
    private AnchorPane panelanchor;

    @FXML
    private Button deletebtn;

    @FXML
    private Button updatebtn;

    @FXML
    private Button addbtn;

    @FXML
    private Button homebtn;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TableColumn<?, ?> usercol;

    @FXML
    private TableColumn<?, ?> passcol;

    @FXML
    private TableColumn<?, ?> phonecol;

    @FXML
    private TextField userTXF;

    @FXML
    private TextField passTXF;

    @FXML
    private TextField phoneTXF;

    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void home(ActionEvent event) throws IOException {
        openPage("manager.fxml",homebtn,"Manager");
    }

    @FXML
    void update(ActionEvent event) {

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
