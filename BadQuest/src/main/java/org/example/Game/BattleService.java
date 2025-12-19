package org.example.Game;

import org.example.Model.Enemy;
import org.example.Model.Player;
import org.example.Model.Strategy.StrategyAttack;

public class BattleService {
    private Player player;
    private Enemy enemy;
    private Boolean playTurn = true;

    public BattleService(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public BattleResult PlayerAttack(StrategyAttack strategyAttack){

        if (!playTurn) return BattleResult.NOT_PLAYER_TURN;

        player.setStrategyAttack(strategyAttack);
        int damage = player.attack(enemy);

        if (!enemy.isLive()) {
            return BattleResult.PLAYER_WIN;
        }

        playTurn = false;
        return BattleResult.CONTINUE;
    }

    public BattleResult EnemyTurn(){
        if (playTurn) return BattleResult.NOT_ENEMY_TURN;

        enemy.attack(player);

        if (!player.isLive()){
            return BattleResult.ENEMY_WIN;
        }

        playTurn = true;
        return  BattleResult.CONTINUE;
    }


}
