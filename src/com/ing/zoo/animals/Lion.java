package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivores;

/**
 * This class represents a Lion.
 */
public class Lion extends Animal implements Carnivores {
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
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
        this.helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        this.eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
