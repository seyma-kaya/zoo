package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivores;
import com.ing.zoo.Trick;

import java.util.Random;

/**
 * This class represents a Panda.
 *
 * @author Seyma Kaya
 */
public class Panda extends Animal implements Herbivores, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Panda(){

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "panda pandatje";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "ki ki nomm";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "climb";
        }
        else
        {
            trick = "roll";
        }
        System.out.println(trick);
    }
}
