package org.example.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaInicialController {

    @FXML
    private Button btStart;
    @FXML
    private Button btSair;

    public void initialize(){
        btStart.setOnAction(e -> {
            System.out.println("Iniciando o Jogo");
            //Stage stage = (Stage) btStart.getScene().getWindow();
            //Tela de escolher personagem aqui
            // GameScene game = new GameScene(stage)
            //stage.setScene(game.getScene())
        });

        btSair.setOnAction(e -> {
            Stage stage = (Stage) btSair.getScene().getWindow();
            stage.close();
        });
    }
}
