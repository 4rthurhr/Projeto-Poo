package org.example.Model;

import org.example.Model.Strategy.StrategyAttack;

public class Player extends Entity{

    private StrategyAttack strategyAttack;

    public Player(String name, int life, int attack) {
        super(name, life, attack);
    }
}
