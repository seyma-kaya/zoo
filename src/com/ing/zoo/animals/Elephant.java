package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivores;

/**
 * This class represents an Elephant
 *
 * @author Seyma Kaya
 */
public class Elephant extends Animal implements Herbivores {
    public String name;
    public String helloText;
    public String eatText;

    public Elephant() {

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
        this.helloText = "hor hor";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        this.eatText = "so yummy in my tummy";
        System.out.println(eatText);
    }
}
