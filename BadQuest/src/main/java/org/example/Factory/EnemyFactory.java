package org.example.Factory;

import org.example.Model.Enemy;
import org.example.Model.Strategy.FireAttack;
import org.example.Model.Strategy.PysicalAttack;

import java.util.Random;

public class EnemyFactory {
    private static final Random random = new Random();

    public static Enemy createEnemyRandom(){
            int type = random.nextInt(2);

            if (type == 0){
                return new Enemy("Zumbi", 50, 8, 0, 3, new PysicalAttack());
            } else {
                return new Enemy("Goblin", 70,12,4, 8, new FireAttack());
            }
    }
}