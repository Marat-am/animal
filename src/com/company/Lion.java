package com.company;

import com.company.impl.AnimalsAction;
import com.company.proparty.AnimalsProparty;


public class Lion extends AnimalsProparty implements AnimalsAction {


    public Lion(int foot, boolean fur, boolean tusk) {
        super(foot, fur, tusk);
    }

    @Override
    public void run() {
        System.out.println("ես կարող եմ վազել" );

    }

    @Override
    public void jump() {
        System.out.println("ես կարող եմ թռչել");
    }

    @Override
    public void sey() {
        System.out.println("ես ասում եմ ՛ՌՌՌՌՌՌՌ՛ ");

    }
}


