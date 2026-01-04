package org.example.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.Game.BattleResult;
import org.example.Game.GameManager;
import org.example.Model.Strategy.PysicalAttack;
import org.example.Service.BattleService;




public class BattleController {
    @FXML
    private Label namePlayer;
    @FXML
    private Label lifePlayer;
    @FXML
    private Label nameEnemy;
    @FXML
    private Label lifeEnemy;

    private BattleService battle;

    @FXML
    public void initialize(){

//        battle = GameManager.getInstace().getBattleService();
//
//        atualizarHUD();

        GameManager g = GameManager.getInstace();
        System.out.println(g.getBattleService());

    }

    private void atualizarHUD(){

        lifePlayer.setText("HP: " + battle.getPlayer().getLife());
        lifeEnemy.setText("HP: " + battle.getEnemy().getLife());

    }

    @FXML
    private void atacar(){
        BattleResult battleResult = battle.playerAttack(new PysicalAttack());
        atualizarHUD();

        if (battleResult == BattleResult.PLAYER_WIN){
            batalhaFinalizada(true);
            return;
        }

        if (battleResult == BattleResult.CONTINUE) {
            return;
        }

        BattleResult enemyResult = battle.enemyTurn();
        atualizarHUD();

        if ( enemyResult == BattleResult.ENEMY_WIN){
            batalhaFinalizada(false);
        }
    }

    private void batalhaFinalizada(boolean playerWin){
        GameManager manager = GameManager.getInstace();
        manager.endBattle(playerWin);

        if (playerWin){
            // Metodo para voltar para o mapa (quando fizer a tela de exploração)
        } else {
            // tela Game Over
        }

    }

    @FXML
    private void fugir(){
        GameManager.getInstace().endBattle(true);
        // Metodo para voltar para o mapa (quando fizer a tela de exploração)
    }


}
