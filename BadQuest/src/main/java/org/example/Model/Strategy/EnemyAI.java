package org.example.Model.Strategy;

import org.example.Model.Enemy;
import org.example.Model.Player;

public interface EnemyAI {
    EnemyAction decide(Enemy enemy, Player player);
}
