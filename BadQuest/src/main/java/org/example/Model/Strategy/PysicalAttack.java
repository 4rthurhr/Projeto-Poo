package org.example.Model.Strategy;

import org.example.Model.Entity;

public class PysicalAttack implements StrategyAttack{
    @Override
    public int attacker(Entity attacker, Entity target) {
        // damage (dano) recebe o valor do atacante
        int damage = attacker.getAttack();
        int finalDamage = Math.max(1, damage - target.getDefense());
        // O atacado recebe o valor do dano (damage)
        target.setAttack(finalDamage);

        return finalDamage;
    }
}
