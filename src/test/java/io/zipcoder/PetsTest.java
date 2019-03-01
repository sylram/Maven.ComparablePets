package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class PetsTest {

    private String name;
    private String speak;

    @Test
    public void newPetDogTest(){
        //Given

        String name = "Max";
        Dog dog = new Dog(name);

        //When

        String actualName = dog.getName();

        //Then
        Assert.assertEquals(name, actualName);

    }

    @Test
    public void newPetCatTest(){
        //Given
        String name = "Puss in Boots";

        //When
        Cat cat = new Cat (name);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(name, actualName);

    }

    @Test
    public void newPetFishTest(){
        //Given
        String name = "Nemo";
        Fish fish = new Fish(name);

        //When

        String actualName = fish.getName();

        //Then
        Assert.assertEquals(name, actualName);


    }

}
