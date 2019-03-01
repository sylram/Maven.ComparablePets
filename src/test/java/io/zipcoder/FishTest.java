package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void getNameTest(){
        //Given
        String givenName = "Victor";
        Fish fish = new Fish();

        //When
        String expected = fish.getName();

        //Then
        Assert.assertEquals(givenName,expected);



    }

    @Test
    public void setNameTest(){
        //Given
        String givenName = "Victor";
        Fish fish = new Fish();

        //When
        String expected = fish.setName();

        //Then
        Assert.assertEquals(givenName,expected);

    }
    @Test
    public void fishSpeakTesh(){
        //Given
        String givenName = "Victor";
        Fish fish = new Fish();
        String fishSound = "glu"

        //When
        String expected = fish.speak();

        //Then
        Assert.assertEquals(givenName,expected);
    }
}
