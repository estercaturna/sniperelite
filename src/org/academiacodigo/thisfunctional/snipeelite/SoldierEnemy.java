package org.academiacodigo.thisfunctional.snipeelite;

public class SoldierEnemy extends Enemy implements Destroyable{

    public SoldierEnemy(){
        super(100);
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public void hit(int dmg) {
        super.hit(dmg);
    }


    @Override
    public boolean isDestroyed() {
        return false;
    }
}
