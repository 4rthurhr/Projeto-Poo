package org.example.Game.Input;

import javafx.scene.input.KeyCode;
import org.example.Game.GameManager;
import org.example.Model.Map.GameMap;

public class InputManager {

    private final GameManager gameManager;
    private final GameMap gameMap; //Precisa do gamemap pq o movePlayer precisa dele pra funcionar

    public InputManager(GameManager gameManager, GameMap gameMap) {
        this.gameManager = gameManager;
        this.gameMap = gameMap;
    }

    //Keycode é um enum do jfx que representa uma tecla tipo Keycode.A
    public void processInput(KeyCode key) {
        int dx = 0;
        int dy = 0;
        // Não quer dizer que zera a posição do player, mas cada tecla altera o valor de 1 em 1

        //Cada tecla altera um eixo. Ele traduz o input em dx e dy
        switch(key) {
            case W -> dy = -1;
            case S -> dy = 1;
            case A -> dx = -1;
            case D -> dx = 1;
            default -> {
                return;
            }
        }
        //Depois de traduzir a tecla em movimento, chama o método que move
        gameManager.movePlayer(dx, dy, gameMap);
    }
}
