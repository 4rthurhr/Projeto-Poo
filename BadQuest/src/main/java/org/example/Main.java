package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.Factory.EnemyFactory;
import org.example.Game.BattleResult;
import org.example.Game.GameManager;
import org.example.Model.Enemy;
import org.example.Model.Player;
import org.example.Model.Strategy.PysicalAttack;
import org.example.Service.BattleService;


public class Main extends Application{


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/tela-inicial-view.fxml"));
        Scene scene = new Scene(root);

        stage.setTitle("BadQuest");
        stage.setScene(scene);
        stage.show();
    }

    static void main(String[] args) {
        launch(args);
    }
}