package com.radinbourse.animal;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class StepDefs {
    private Animal cat;
    private Animal dog;

    @Given("animals are in the zoo")
    public void animalsAreInTheZoo() {
        cat = new Cat();
        dog = new Dog();
    }

    @When("zookeeper arrives")
    public void zookeeperArrives() {
    }

    @Then("{word} makes {string}")
    public void animalMakesSound(String animalName, String sound) {
        Animal animal = switch (animalName) {
            case "cat" -> cat;
            case "dog" -> dog;
            default -> throw new IllegalArgumentException();
        };
        assertEquals(sound, animal.makeSound());
    }
}

