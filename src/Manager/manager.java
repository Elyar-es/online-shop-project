package Manager;

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
import Customer.moshtari;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class manager implements Initializable {
    private Pane view;
    @FXML
    private AnchorPane panelanchor;

    @FXML
    private Button accountbtn;

    @FXML
    private Button soldlistbtn;

    @FXML
    private Button employeebtn;

    @FXML
    private Button logoutbtn;

    @FXML
    private AnchorPane anchor;

    @FXML
    void account(ActionEvent event) throws IOException {
        changeanchor("Manageraccount.fxml",anchor);
    }

    @FXML
    void employee(ActionEvent event) throws IOException {
        openPage("NewEmployee.fxml",employeebtn,"Edit Employee");
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        openPage("StartPage.fxml",logoutbtn,"s");
    }

    @FXML
    void sold(ActionEvent event) throws IOException {
        anchor.getChildren().clear();
        changeanchor("soldList.fxml",anchor);

    }
    private Pane getPage(String filename) throws IOException {

        URL file= moshtari.class.getResource("/fxmls/"+filename);
        if (file==null)
            throw new java.io.FileNotFoundException("COULDNT FIND THE FILE");
        view=new FXMLLoader().load(file);


        return view;
    }
    private void changeanchor(String filename,AnchorPane anc) throws IOException {
        Pane view=getPage(filename);
        anc.getChildren().clear();
        anc.getChildren().add(view);
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
        try {
            changeanchor("Manageraccount.fxml",anchor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
