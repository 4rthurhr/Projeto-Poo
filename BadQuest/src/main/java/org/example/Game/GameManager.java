package org.example.Game;

import org.example.Model.Player;

public class GameManager {
    private GameState state = GameState.EXPLORATION;
    private Player player;
    private BattleService battleService;

    public GameManager(Player player) {
        this.player = player    ;
    }

    public void movePlayer(){
        if (state != GameState.EXPLORATION) return;

    }
}

