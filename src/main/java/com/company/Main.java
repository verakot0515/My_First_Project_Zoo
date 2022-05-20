package com.company;

import java.io.SequenceInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s = "============================";

        Creature allCreature = new Creature();

        Tiger tiger = new Tiger();
        Panda panda = new Panda();
        Sloth sloth = new Sloth();
        Eagle eagle = new Eagle();
        Peacock peacock = new Peacock();
        Pike pike = new Pike();
        Carp carp = new Carp();
        allCreature.menuDisplay();

        while (true){
            int input = new Scanner(System.in).nextInt();

            if (input == 1) {
                System.out.println("Tiger");
                tiger.breaher();
                tiger.movingOnTheGround();
                tiger.aboutCreature();
                System.out.println(s);
                allCreature.menuDisplay();
            }
            else if (input == 2) {
                System.out.println("Panda");
                panda.breaher();
                panda.movingOnTheGround();
                panda.aboutCreature();
                System.out.println(s);
                allCreature.menuDisplay();
            }
            else if (input == 3) {
                System.out.println("Sloth");
                sloth.breaher();
                sloth.movingOnTheGround();
                sloth.aboutCreature();
                System.out.println(s);
                allCreature.menuDisplay();
            }
            else if (input == 4) {
                System.out.println("Eagle");
                eagle.breaher();
                eagle.movingInTheAir();
                eagle.aboutCreature();
                System.out.println(s);
                allCreature.menuDisplay();
            }
            else if (input == 5) {
                System.out.println("Peacock");
                peacock.breaher();
                peacock.movingInTheAir();
                peacock.aboutCreature();
                System.out.println(s);
                allCreature.menuDisplay();
            }
            else if (input == 6) {
                System.out.println("Pike");
                pike.breaher();
                pike.movingInTheWater();
                pike.aboutCreature();
                System.out.println(s);
                allCreature.menuDisplay();
            }
            else if (input == 7) {
                System.out.println("Carp");
                carp.breaher();
                carp.movingInTheWater();
                carp.aboutCreature();
                System.out.println(s);
                allCreature.menuDisplay();
            }
            else if (input == 0) {
                break;
            }
        }
    }
}


