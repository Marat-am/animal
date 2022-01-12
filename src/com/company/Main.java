package com.company;

import com.company.proparty.BirdPropary;

public class Main {
    public static void main(String[] args) {
        Lion Lion = new Lion( 4 , true, true);
        System.out.println(Lion);
        Lion.run();
        Lion.jump();
        Lion.sey();


       Raven raven = new Raven(true, "black", "meat");
        System.out.println(raven);
        raven.fly();
        raven.sey();

        Shark shark=new Shark(false,true,"another fish");
        System.out.println(shark);
        shark.swim();
        shark.eat();


    }

}

