package org.example.Model;

import org.example.Model.Strategy.StrategyAttack;

public class Enemy extends Entity{

    private StrategyAttack strategyAttack;

    public Enemy(String name, int life, int attack, int magic, int defense, StrategyAttack strategyAttack) {
        super(name, life, attack, magic, defense);
        this.strategyAttack = strategyAttack;
    }

    public int attack(Entity target ){
        return strategyAttack.attacker(this, target);
    }


}
