package org.example.Game;

import org.example.Factory.EnemyFactory;
import org.example.Model.Enemy;
import org.example.Model.Map.GameMap;
import org.example.Model.Player;
import org.example.Model.Strategy.PysicalAttack;
import org.example.Service.BattleService;

import java.util.Scanner;

public class GameManager {
    private GameState state = GameState.EXPLORATION;
    private Player player;
    private BattleService battleService;
    private PlayerClass playerClass;
    private static GameManager instance;

    public GameManager() {

    }

    public static GameManager getInstace(){
        if (instance == null){
            instance= new GameManager();
        }

        return instance;
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }


    // Função para movimento do player
    public void movePlayer(int dx, int dy, GameMap map){
        if (state != GameState.EXPLORATION) return;

        boolean moved = player.move(dx, dy, map);

        // Se *movimentar e encontrar inimigo, começa a batalha
        if (moved && foundEnemy()){
            startBattle();
        }
    }

    //Função para Encontrar Inimigo (20%)
    private boolean foundEnemy(){
        return Math.random() < 0.2;
    }

    private void startBattle(){
        // Cria inimigo, cria servico de batalha e muda o state
        Enemy enemy = EnemyFactory.createEnemyRandom();
        battleService = new BattleService(player, enemy);
        state = GameState.BATTLE;
    }

    public void endBattle(boolean playWon){
        // Se play ganhou state muda caso contrario perde o jogo
        if (playWon){
            state = GameState.EXPLORATION;
        } else {
            state = GameState.GAME_OVER;
        }
    }

    public BattleService getBattleService() {
        return battleService;
    }

    public GameState getState() {
        return state;
    }


    //Teste Tela de batalha
    public void startB(Enemy e){
        this.battleService = new BattleService(player, e);
        this.state = GameState.BATTLE;
    }
}

