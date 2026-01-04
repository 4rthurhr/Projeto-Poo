package org.example.Factory;

import org.example.Game.PlayerClass;
import org.example.Model.Player;
import org.example.Model.Strategy.FireAttack;
import org.example.Model.Strategy.PysicalAttack;
import org.example.Model.Strategy.StrategyAttack;

public class PlayerFactory {

    // Tipos de personagens so p teste
    public static Player createPlayer(PlayerClass type){
            return switch (type){
                case GUERREIRO -> new Player(
                        "Guerreiro", 250, 18, 0, 15,
                        new PysicalAttack()
                );

                case MAGO-> new Player(
                        "Mago", 180, 8, 20, 8,
                        new FireAttack()
                );

                default -> throw new IllegalArgumentException("Classe Invalida");
            };
    }
}
