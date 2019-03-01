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

        //When
        Dog dog = Pets.getNewPetDog(name);
        String actualName = dog.getName();

        //Then
        Assert.assertEquals(name, actualName);

    }

    @Test
    public void newPetCatTest(){
        //Given
        String name = "Puss in Boots";

        //When
        Cat cat = Pets.getNewPetCat(name);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(name, actualName);

    }

    @Test
    public void newPetFishTest(){
        //Given
        String name = "Nemo";

        //When
        Fish fish = Pets.getNewPetFish(name);
        String actualName = fish.getName();

        //Then
        Assert.assertEquals(name, actualName);


    }

}
