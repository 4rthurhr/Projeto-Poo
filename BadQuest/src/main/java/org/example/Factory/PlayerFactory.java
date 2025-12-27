package org.example.Factory;

import org.example.Model.Player;
import org.example.Model.Strategy.FireAttack;
import org.example.Model.Strategy.PysicalAttack;
import org.example.Model.Strategy.StrategyAttack;

public class PlayerFactory {

    // Tipos de personagens so p teste
    public static Player createPlayer(String type, String name){
            return switch (type.toLowerCase()){
                case "cavalario" -> new Player(
                        name, 250, 18, 0, 15,
                        new PysicalAttack()
                );

                case "mago" -> new Player(
                        name, 180, 8, 20, 8,
                        new FireAttack()
                );

                default -> throw new IllegalArgumentException("Classe Invalida");
            };
    }
}
