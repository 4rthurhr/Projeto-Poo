package org.example.Model.Strategy;

import org.example.Model.Entity;

public class MagicAttack implements StrategyAttack{
    @Override
    public int calcularDano(Entity attacker, Entity target) {
        return attacker.getMagic() * 2;
    }
}