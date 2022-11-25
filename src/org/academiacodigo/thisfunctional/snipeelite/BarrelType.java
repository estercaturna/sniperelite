package org.academiacodigo.thisfunctional.snipeelite;

public enum BarrelType {

    PLASTIC("Pastic"),
    WOOD("Madeirence"),
    METAL("Metal");

    private String name;
    private int maxDmg;

    public String getName() {
        return name;
    }

    public int getMaxDmg(){
        return maxDmg;
    }
    BarrelType(String name){
        this.name =name;
    }

    @Override
    public String toString() {
        return name;
    }
}
