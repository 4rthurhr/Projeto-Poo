package org.example.Model;

public abstract class Entity {
    private String name;
    private int life;
    private int attack;
    private int defense;
    private int magic;

    public Entity(String name, int life, int attack, int magic, int defense) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.magic = magic;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    // Função para receber dano
    public void takeDamage(int damage){
        life = Math.max(0, life - damage);
    }

    // Função para verificar se a entity está viva
    public boolean isLive(){
        return life > 0;
    }
}
