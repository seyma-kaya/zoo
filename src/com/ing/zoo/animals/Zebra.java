package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivores;

import java.util.Random;

/**
 * This class represents a Zebra.
 */
public class Zebra extends Animal implements Herbivores {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra()
    {
        this.helloText = "zebra zebra";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
