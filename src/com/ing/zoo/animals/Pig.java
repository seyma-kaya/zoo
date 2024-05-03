package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivores;
import com.ing.zoo.Herbivores;
import com.ing.zoo.Trick;

import java.util.Random;

/**
 * This class represents a Pig.
 */
public class Pig extends Animal implements Herbivores, Carnivores, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Pig()
    {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        this.helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
