package org.example.Model.Strategy;

import org.example.Model.Entity;

public class HealSpell implements StrategyAttack{
    @Override
    public int attacker(Entity attacker, Entity target) {
        int cure = attacker.getMagic() * 3;
        attacker.setLife(attacker.getLife() + cure);
        return -cure; //Negativo igual a cura
    }
}
