package org.example.Model;

import org.example.Model.Strategy.PysicalAttack;
import org.example.Model.Strategy.StrategyAttack;

public class Player extends Entity{

    private StrategyAttack strategyAttack;

    public Player(String name) {

        super(name,250, 15,5,10);
        this.strategyAttack = new PysicalAttack(); //Ataque "Padrão"
    }

    public void setStrategyAttack(StrategyAttack strategyAttack){
        this.strategyAttack = strategyAttack;
    }

    public int attack(Entity target){
        strategyAttack.attacker(this, target);
        return 0;
    }
}
