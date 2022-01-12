package com.company.proparty;

public class FishProparty {
    public boolean scales;
    public boolean teetf;
    private String eat;

    public FishProparty(boolean scales, boolean teetf, String eat) {
        this.scales = scales;
        this.teetf = teetf;
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "FishProparty{" +
                "scales=" + scales +
                ", teetf=" + teetf +
                ", eat='" + eat + '\'' +
                '}';
    }
}
