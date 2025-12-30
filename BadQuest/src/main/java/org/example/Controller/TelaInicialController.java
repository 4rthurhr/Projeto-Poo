package org.example.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaInicialController {

    @FXML
    private Button btStart;
    @FXML
    private Button btSair;

    public void initialize(){
        btStart.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/escolha-personagem-view.fxml"));
            Parent root = null;
            try {
                root = loader.load();

                EscolherPersonagemController controller = loader.getController();
                Stage stage = (Stage) btStart.getScene().getWindow();
                controller.setStage(stage);

                stage.setScene(new Scene(root));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        });

        btSair.setOnAction(e -> {
            Stage stage = (Stage) btSair.getScene().getWindow();
            stage.close();
        });
    }
}
