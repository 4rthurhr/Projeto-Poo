package org.example.Model;

import org.example.Model.Map.GameMap;
import org.example.Model.Map.Position;
import org.example.Model.Strategy.PysicalAttack;
import org.example.Model.Strategy.StrategyAttack;

public class Player extends Entity{

    private StrategyAttack strategyAttack;
    private Position position;

    public Player(String name) {
        super(name,250, 15,5,10);
        this.strategyAttack = new PysicalAttack(); //Ataque "Padrão"
        this.position = new Position(0,0); // posição "padrão" também
    }

    public Position getPosition() {
        return position;
    }

    public boolean move(int dx, int dy, GameMap map) {
        // calcula uma posição possivel
        Position newPosition = position.move(dx, dy);

        // Chama o metodo que valida se a posição está dentro do mapa
        if (map.isInside(newPosition)) {
            //se sim, o player muda de lugar(posição)
            this.position = newPosition;
            return true;
        }
        // se não for válida, ele não mexe
        return false;
    }

    public void setStrategyAttack(StrategyAttack strategyAttack){
        this.strategyAttack = strategyAttack;
    }

    public int attack(Entity target){
        return strategyAttack.attacker(this, target);
    }
}
