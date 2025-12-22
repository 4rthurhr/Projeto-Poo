package org.example.Model.Map;

public class GameMap {
    // o mapa tem largura(width) e altura (height)
    private int width;
    private int height;

    public GameMap(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // metodo que valida se a posicao do player está ou não dentro do mapa, para não ultrapassar seus limites
    public boolean isInside(Position position) {
        return position.getX() >= 0 &&
                position.getY() >= 0 &&
                position.getX() < width &&
                position.getY() < height;
    }
}
