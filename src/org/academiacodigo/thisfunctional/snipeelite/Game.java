package org.academiacodigo.thisfunctional.snipeelite;

public class Game {

    private GameObject[] gameObjs;

    private SniperRiffle sniperRifle;


    public SniperRiffle getSniperRiffle() {
        return getSniperRiffle();
    }

    public void start() {

    }

    private void createObjects(int numObjs) {

         gameObjs = new GameObject[numObjs];

        for (int i = 0; i < gameObjs.length;i++) {
            double id =  Math.random();

            if (id < 0.3){
                gameObjs[i] =  new ArmorEnemy(50);
            }
            else if (id < 0.8) {
                gameObjs[i] = new SoldierEnemy();
            }
            else {
                gameObjs[i] = new Tree();
            }

        }

    }

    public void shootEnemies(Enemy enemy) {

            SniperRiffle sniperRif = new SniperRiffle();

            for (GameObject obj : gameObjs) { //

                if (obj instanceof Destroyable) { // check if the object of the array instance
                    // of interface Destroyable
                    sniperRif.shootEnemy((Destroyable) obj); //cast
                }

            }


    }
    public Game (int numbObjs) {
        createObjects(numbObjs);
            this.sniperRifle = sniperRifle;

    }
}
