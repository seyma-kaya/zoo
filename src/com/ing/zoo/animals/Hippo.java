package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivores;

/**
 * This class represents a Hippo.
 */
public class Hippo extends Animal implements Herbivores {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo()
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
        this.eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
