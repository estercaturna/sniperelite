package org.academiacodigo.thisfunctional.snipeelite;

public class ArmorEnemy extends Enemy implements Destroyable {

    private int armor;

    public int getArmor() {
        return armor;
    }

    public ArmorEnemy(int armor) {
        super(100);
        this.armor = armor;

    }


    @Override
    public String getMessage(String message) {

        return super.getMessage(message);
    }

    @Override
    public void hit(int damage) {

        int dmgTaken =0;

        if (this.armor > 0 && damage <= armor){
            //confirmo se tenho armor positivo e recebo menos dano do que tenho armor

            armor = this.armor - damage;
            //atualizo a armor com o dano recebido
        }
        else {
            //calculo quanto dano extra vou levar além do shield
            dmgTaken = damage - this.armor;
            //uso o método super onde subtraio ao meu hp
            super.hit(dmgTaken);
        }

    }
    @Override
    public boolean isDestroyed () { //if armor is destroy
        if (armor == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}