package org.example.Model.Strategy;

import org.example.Model.Entity;

public interface StrategyAttack {
    int attacker(Entity attacker, Entity target);
}

// Interface para definir a estrategia de ataque
// attacker = atacante  e target = alvo