package com.company.proparty;

public class BirdPropary {
    public boolean fly;
    private String color;
    private String eat;

    public BirdPropary(boolean fly, String color, String eat) {
        this.fly = fly;
        this.color = color;
        this.eat = eat;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "BirdPropary{" +
                "fly=" + fly +
                ", color='" + color + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }


}