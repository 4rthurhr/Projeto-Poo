package org.example.Model.Strategy;

import org.example.Model.Enemy;
import org.example.Model.Player;

import java.util.Random;

// IA basica para tomada de decisão do Inimigo

public class EnemyAIBasic implements EnemyAI{


    private final Random random = new Random();

    @Override
    public EnemyAction decide(Enemy enemy, Player player) {

        // se estiver quase morto tenta fugir
        if (enemy.getLife() <= 20){
            return EnemyAction.FLEE;
        }

        int chance = random.nextInt(100);

        // 80% atacar
        if (chance < 80){
            return EnemyAction.ATTACK;
        }


        return EnemyAction.FLEE;

    }
}
