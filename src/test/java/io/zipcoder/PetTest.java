package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PetTest {

    private String name;
    private String speak;

    @Test
    public void newPetDogTest() {
        //Given

        String name = "Max";
        Dog dog = new Dog(name);

        //When

        String actualName = dog.getName();

        //Then
        Assert.assertEquals(name, actualName);

    }

    @Test
    public void newPetCatTest() {
        //Given
        String name = "Puss in Boots";

        //When
        Cat cat = new Cat(name);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(name, actualName);

    }

    @Test
    public void newPetFishTest() {
        //Given
        String name = "Nemo";
        Fish fish = new Fish(name);

        //When

        String actualName = fish.getName();

        //Then
        Assert.assertEquals(name, actualName);


    }

    @Test
    public void speakTest() {
        //Given
        Pet pet = new Pet(name);
        String expected = null;

        //When
        String actual = pet.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortPetsTest() {
        //Given
        String name = "Nemo";
        String name2 = "Gloria";
        String name3 = "Zula";

        Pet fish = new Fish(name);
        Pet cat = new Cat(name2);
        Pet dog = new Dog(name3);
        Pet[] pets = {fish, cat, dog};
        Pet[] before = {fish, cat, dog};

        //When
        Arrays.sort(pets);

        //Then
        //for(Pet pet : pets)System.out.println(pet);
        Assert.assertNotEquals(before.toString(), pets.toString());
    }

    @Test(expected = NullPointerException.class)
    public void sortPetsNullPointerTest() {
        //Given
        String name = "Nemo";
        String name2 = "Gloria";
        String name3 = "Zula";

        Pet fish = new Fish(name);
        Pet cat = new Cat(name2);
        Pet dog = new Dog(name3);
        Pet pikachu = new Pet(null);

        Pet[] pets = {fish, cat, dog, pikachu};

        Arrays.sort(pets);
    }

}
