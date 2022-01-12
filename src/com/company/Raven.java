package com.company;

import com.company.impl.BirdAction;
import com.company.proparty.BirdPropary;

public class Raven extends BirdPropary implements BirdAction {

    public Raven(boolean fly, String color, String eat) {
        super(fly, color, eat);
    }

    @Override
    public void fly() {
        System.out.println("ես բարձր եմ թռնում ");

    }

    @Override
    public void sey() {
        System.out.println("Կառ Կառ Կառ");
    }
}
