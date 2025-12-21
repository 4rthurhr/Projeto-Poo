package org.example.Model.Strategy;

import org.example.Model.Entity;

public class MagicAttack implements StrategyAttack{

    @Override
    public int attacker(Entity attacker, Entity target) {
        int damage = attacker.getAttack() * 2;
        int finalDamage = Math.max(1, damage - target.getDefense());
        target.takeDamage(finalDamage);

        return finalDamage;
    }
}