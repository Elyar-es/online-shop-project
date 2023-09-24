package Customer;

import General.info;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class moshtari implements Initializable {
    private double x, y;
    ArrayList<String> product = new ArrayList<>();
    ArrayList<String> favproduct = new ArrayList<>();
    private Pane view;

    @FXML
    private Button marketbtn;

    @FXML
    private Button accountbtn;

    @FXML
    private Button cartbtn;

    @FXML
    private Button favbtn;

    @FXML
    private Button purchasedbtn;

    @FXML
    private Button logoutbtn;

    @FXML
    private Button reqBTN;

    @FXML
    private TextField searchTXF;

    @FXML
    private AnchorPane anchor;

    @FXML
    private AnchorPane panelanchor;

    public AnchorPane getAnchor() {
        return anchor;
    }

    public AnchorPane getPanelanchor() {
        return panelanchor;
    }

    @FXML
    void account(ActionEvent event) throws IOException {
        changeanchor("Moshtariaccount.fxml", anchor);
    }

    @FXML
    void cart(ActionEvent event) throws IOException {
        openPage("cart.fxml", cartbtn, "Cart");
    }

    @FXML
    void favorites(ActionEvent event) throws IOException {
        anchor.getChildren().clear();
        favproduct.add("TV");
        favproduct.add("Mobile");
        for (int i = 0; i < favproduct.size(); i++) {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxmls/favorites.fxml"));
            try {
                Parent roott = loader.load();
                favorites control = loader.getController();

                control.getNameTXF().setText(favproduct.get(i));
                control.getPriceTXF().setText("178000");


                AnchorPane.setTopAnchor(roott, 50.0 + i * 550.0);
                AnchorPane.setLeftAnchor(roott, 42.5);
                anchor.getChildren().add(roott);


            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @FXML
    void logout(ActionEvent event) throws IOException {

        openPage("StartPage.fxml",logoutbtn,"s");
    }

    @FXML
    void market(ActionEvent event) throws IOException {
        anchor.getChildren().clear();
        changeanchor("marketPanel.fxml", panelanchor);


        for (int i = 0; i < product.size(); i++) {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxmls/info.fxml"));
            try {
                Parent roott = loader.load();
                info control = loader.getController();

                control.getNameTXF().setText(product.get(i));
                control.getPriceTXF().setText("178000");


                AnchorPane.setTopAnchor(roott, 60.0 + i * 550.0);
                AnchorPane.setLeftAnchor(roott, 42.5);
                anchor.getChildren().add(roott);


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Pane view = getPage("searchPane.fxml");
        anchor.getChildren().add(view);
    }


    @FXML
    void purchased(ActionEvent event) throws IOException {
        {
            anchor.getChildren().clear();
            for (int i = 0; i < product.size(); i++) {
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxmls/history.fxml"));
                try {
                    Parent roott = loader.load();
                    history control = loader.getController();

                    control.getNameTXF().setText(product.get(i));
                    control.getPriceTXF().setText("178000");


                    AnchorPane.setTopAnchor(roott, 50.0 + i * 470.0);
                    AnchorPane.setLeftAnchor(roott, 42.5);
                    anchor.getChildren().add(roott);


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    @FXML
    void req(ActionEvent event) throws IOException {
        changeanchor("requestProduct.fxml", anchor);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        product.add("Mobile");
        product.add("TV");
        product.add("Computer");


        try {
            changeanchor("Moshtariaccount.fxml", anchor);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public Pane getPage(String filename) throws IOException {

        URL file = moshtari.class.getResource("/fxmls/" + filename);
        if (file == null)
            throw new java.io.FileNotFoundException("COULDNT FIND THE FILE");
        view = new FXMLLoader().load(file);


        return view;
    }

    private void changeanchor(String filename, AnchorPane anc) throws IOException {
        Pane view = getPage(filename);
        anc.getChildren().clear();
        anc.getChildren().add(view);
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

