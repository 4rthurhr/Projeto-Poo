package org.example.Controller;

import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class EscolherPersonagemController {

        private Stage stage;

        @FXML
        private ImageView guerreiroImg;

        public void setStage(Stage stage) {
            this.stage = stage;
        }

        @FXML
        public void initalize(){
            Image guerreiro = new Image("Img/sprites/guerreiro/Idle_Down-Sheet.png");
            guerreiroImg.setFitWidth(180);
            guerreiroImg.setFitHeight(180);


        }


}
