package com.company;

public class Creature {
    private void breathe() {

    }
    private void move() {

    }

    protected void aboutCreature(){

    }


    protected void menuDisplay() {
        String[] menu = {"1.Tiger", "2.Panda", "3.Sloth", "4.Eagle", "5.Peacock", "6.Pike", "7.Carp", "0.Exit"};
        for (String list : menu) {
            System.out.println(list);
        }
    }
}

