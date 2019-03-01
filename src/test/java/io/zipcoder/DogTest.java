package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {


    @Test
    public void getDogNameTest(){
        //Given
        String name = "Reina";
        Dog dog = new Dog(name);


        //When
        String actualName = dog.getName();

        //Then
        Assert.assertEquals(name, actualName);

    }

    @Test
    public void setDogNameTest(){
        //Given
        Dog dog = new Dog(null);
        String name = "Cujo";
        dog.setName(name);

        //When
        String actual = dog.getName();

        //Then
        Assert.assertEquals(name, actual);



    }

    @Test
    public void getDogSpeakTest(){
        //Given
        String speak = "Woof!";
        Dog dog = new Dog(null);

        //When
        String actualSpeak = dog.speak();

        //Then
        Assert.assertEquals(speak, actualSpeak);

    }

}
