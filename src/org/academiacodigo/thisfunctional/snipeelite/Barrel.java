package org.academiacodigo.thisfunctional.snipeelite;

public class Barrel extends GameObject implements Destroyable {

    public Barrel() {
     BarrelType barrelType;
    int currentDmg;
    boolean destroyed;
    }

    @Override
    public void hit(int damage) {

    }

    @Override
    public boolean isDestroyed() {
        return false;
    }

    @Override
    public String getMessage(String message) {
        return "Explosion";
    }
}
