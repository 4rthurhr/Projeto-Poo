package org.example.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.example.Factory.EnemyFactory;
import org.example.Factory.PlayerFactory;
import org.example.Game.GameManager;
import org.example.Game.PlayerClass;
import org.example.Model.Enemy;
import org.example.Model.Player;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EscolherPersonagemController implements Initializable {

    @FXML
    private ImageView guerreiroImg;
    @FXML
    private ImageView magoImg;
    @FXML
    private Button btCon;

    private Stage stage;

    private PlayerClass escolha;

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

    @FXML
    private void escolherGuerreiro(){
        escolha = PlayerClass.GUERREIRO;
    }

    @FXML
    private void escolherMago(){
        escolha = PlayerClass.MAGO;
    }


    @FXML
    public void confirmarEscolha(){

        Player player = PlayerFactory.createPlayer(escolha);
        GameManager.getInstace().setPlayer(player);

        System.out.println("Vc escolheu " + player.getName());
        //Troca de tela
        
       
        // !!!!!TESTE
        Player p = PlayerFactory.createPlayer(PlayerClass.GUERREIRO);
        
        GameManager g = GameManager.getInstace();
        g.setPlayer(p);

        Enemy e = EnemyFactory.createEnemyRandom();
        g.startB(e);
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/battle-view.fxml"));
            Parent root = loader.load();

            Stage s = (Stage) btCon.getScene().getWindow();
            s.setScene(new Scene(root));
            s.show();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }


}
