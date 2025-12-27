package org.example.Model.Strategy;

import org.example.Model.Entity;

public class HeavySlash implements StrategyAttack{
    //Ataque Do cavaleiro
    @Override
    public int attacker(Entity attacker, Entity target) {
        int damage = attacker.getAttack() + 3;
        int finalDamage = Math.max(1, damage - target.getDefense());
        target.takeDamage(finalDamage);
        return finalDamage;
    }
}
