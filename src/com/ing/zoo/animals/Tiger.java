package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivores;
import com.ing.zoo.Trick;

import java.util.Random;

/**
 * This class represents a Tiger.
 */
public class Tiger extends Animal implements Carnivores, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger()
    {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello()
    {
        this.helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
