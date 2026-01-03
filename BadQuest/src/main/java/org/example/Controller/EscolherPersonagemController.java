package org.example.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EscolherPersonagemController implements Initializable {

    @FXML
    private ImageView guerreiroImg;
    @FXML
    private ImageView magoImg;

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image imgGuerreiro = new Image(
                getClass().getResource("/Img/sprites/guerreiro/guerreiro.png")
                        .toExternalForm()
        );

        Image imgMago = new Image(getClass().getResourceAsStream("/Img/sprites/guerreiro/mago.png"));

        guerreiroImg.setImage(imgGuerreiro);
        guerreiroImg.setSmooth(false);
        guerreiroImg.setPreserveRatio(true);

        magoImg.setImage(imgMago);
        magoImg.setSmooth(false);
        magoImg.setPreserveRatio(true);

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }


}
