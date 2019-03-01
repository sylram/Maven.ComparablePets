package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {



    @Test
    public void getNameTest(){
        //Given
        String givenName = "Bella";
        Cat cat = new Cat(null);


        //When
        String expected = cat.getName();

        //Then
        Assert.assertEquals(givenName,expected);
    }



    @Test
    public void setNameTest(){
        //Given
        String nameGiven = "Bella";
        Cat cat = new Cat(null);


        //When
        cat.setName();
        String expected = cat.getName();

        //Then
        Assert.assertEquals(nameGiven,expected);
    }

    @Test
    public void catSpeakTest(){
        //Given
        String nameGiven = "Bella";
        Cat cat = new Cat(null);
        String sound = "meow!";


        //When
        String expected = cat.speak();

        //Then
        Assert.assertEquals(nameGiven,expected);
    }

}
