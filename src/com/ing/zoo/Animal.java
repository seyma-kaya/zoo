package com.ing.zoo;

/**
 * This abstract class represents an animal in the zoo. Subclasses provide implementation for every animal.
 *
 * @author Seyma Kaya
 */

public abstract class Animal {

    public String name;


    /**
     * Returns the name of the animal
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the animal to the String name given in the params
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
