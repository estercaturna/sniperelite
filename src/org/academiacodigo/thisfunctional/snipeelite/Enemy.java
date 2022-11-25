package org.academiacodigo.thisfunctional.snipeelite;

public abstract class Enemy extends GameObject implements Destroyable {

    private int hp;
    private boolean dead;


    public int getHp(){
        return hp;
    }
    public boolean isDead() {
        return dead;
    }

    private void setDead(boolean dead) {
        this.dead = dead;
    }
    public abstract boolean isDestroyed();

    public void hit(int damage){
        if (hp > 0) {
            this.hp = hp - damage;
        }

        if (hp <= 0) {
        setDead(true);
            System.out.println("IM DEAD!");
        }
    }

    public Enemy(int hp) {
        this.hp = hp;

    }

    @Override
    public String getMessage(String message) {

        return "Dont kill me bro pls, IM BEGGING YOU";
    }
}
