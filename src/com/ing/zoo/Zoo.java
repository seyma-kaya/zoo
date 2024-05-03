package com.ing.zoo;

import com.ing.zoo.animals.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Animal[] zooAnimals = new Animal[7];
        Animal henk = new Lion();
        henk.setName("henk");
        Animal elsa = new Hippo();
        elsa.setName("elsa");
        Animal dora = new Pig();
        dora.setName("dora");
        Animal wally = new Tiger();
        wally.setName("wally");
        Animal marty = new Zebra();
        marty.setName("marty");
        Animal mark = new Panda();
        mark.setName("mark");
        Animal dumbo = new Elephant();
        dumbo.setName("dumbo");


        zooAnimals[0] = henk;
        zooAnimals[1] = elsa;
        zooAnimals[2] = dora;
        zooAnimals[3] = wally;
        zooAnimals[4] = marty;
        zooAnimals[5] = mark;
        zooAnimals[6] = dumbo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        // Checks the first command
        for (Animal a : zooAnimals) {
            if (input.equals(commands[0] + " " + a.getName())) {
                a.sayHello();
                break;
            } else if (input.equals(commands[0])) {
                    System.out.println(a.getName() + ": ");
                    a.sayHello();
            }

        }

        // Checks the second command
        if (input.equals(commands[1])) {
            for (Animal a : zooAnimals) {
                if (a instanceof Herbivores) {
                    ((Herbivores) a).eatLeaves();
                }
            }
        }

        // Checks the third command
        if (input.equals(commands[2])) {
            for (Animal a : zooAnimals) {
                if (a instanceof Carnivores) {
                    ((Carnivores) a).eatMeat();
                }
            }
        }

        // Checks the fourth command
        if (input.equals(commands[3])) {
            for (Animal a : zooAnimals) {
                if (a instanceof Trick) {
                    ((Trick) a).performTrick();
                }
            }
        }
    }
}
