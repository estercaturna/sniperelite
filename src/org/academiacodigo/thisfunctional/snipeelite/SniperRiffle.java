package org.academiacodigo.thisfunctional.snipeelite;

public class SniperRiffle {

    private int bulletDmg  ;
    private int shotsFired = 0;
    private int shootTries = 7;


    public int getbulletDmg(){
        return bulletDmg;
    }

    public int  getShotsFired(){
        return shotsFired;
    }

    public void setBulletDmg(int bulletDmg) {
        this.bulletDmg = bulletDmg;
    }

    public SniperRiffle() {
        this.bulletDmg = 20;
        this.shotsFired = shotsFired;
        //cada vez q da um tiro ele conta as balas
    }

    public void shootEnemy(Destroyable kill){
        if (shootOdds()) {
            shotsFired++;
            kill.hit(this.bulletDmg);
        }

    }

    public boolean shootOdds () {
        if (Math.random() > ((double) shootTries)/ 10){
            //shoot again u fail
          return true;
        }
        else {
            return false;
        }
    }
}
