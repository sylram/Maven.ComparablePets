package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void getNameTest(){
        //Given
        String givenName = "Victor";
        Fish fish = new Fish(givenName);

        //When
        String expected = fish.getName();

        //Then
        Assert.assertEquals(givenName,expected);



    }

    @Test
    public void setNameTest(){
        //Given
        String givenName = "Victor";
        Fish fish = new Fish(givenName);

        //When
        fish.setName(givenName);
        String expected = fish.getName();

        //Then
        Assert.assertEquals(givenName,expected);

    }
    @Test
    public void fishSpeakTest(){
        //Given
        String givenName = "Victor";
        Fish fish = new Fish(givenName);
        String fishSound = "glu";

        //When
        String actualSpeak = fish.speak();

        //Then
        Assert.assertEquals(fishSound,actualSpeak);
    }
}
