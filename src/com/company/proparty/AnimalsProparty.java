package com.company.proparty;

public class AnimalsProparty {
    private int foot;
    public boolean fur;
    public boolean tusk;

    public AnimalsProparty(int foot, boolean fur, boolean tusk) {
        this.foot = foot;
        this.fur = fur;
        this.tusk = tusk;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }


    @Override
    public String toString() {
        return "AnimalsProparty{" +
                "foot=" + foot +
                ", fur=" + fur +
                ", tusk=" + tusk +
                '}';
    }
}
