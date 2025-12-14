package org.example.Model.Strategy;

import org.example.Model.Entity;

public class PysicalAttack implements StrategyAttack{
    @Override
    public int calcularDano(Entity attacker, Entity target) {
        // Pega o valor do ataque do atacante e subitrai com a defesa do alvo
        return attacker.getAttack() - target.getDefense();
    }

}
