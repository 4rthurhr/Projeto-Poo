package org.example.Model.Map;

public class Position {
    // Posição é algo que toda entidade tem. X é esquerda / direita, Y é cima/baixo
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // metodo de movimento, ele não altera o x e y, cria uma nova posição que é validada e depois posta junto da antiga posição-
    // posicao atual + deslocamento
    public Position move(int dx, int dy) {
        return new Position(this.x + dx, this.y + dy);
    }
    //retorna o x,y pra ver como tá
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
