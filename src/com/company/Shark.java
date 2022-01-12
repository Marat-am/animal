package com.company;

import com.company.impl.FishAction;
import com.company.proparty.FishProparty;

public class Shark extends FishProparty implements FishAction {

    public Shark(boolean scales, boolean teetf, String eat) {
        super(scales, teetf, eat);
    }

    @Override
    public void swim() {
        System.out.println(" լողում եմ շատ արագ");
    }

    @Override
    public void eat() {
        System.out.println("  ուտում եմ միս ");
    }
}
