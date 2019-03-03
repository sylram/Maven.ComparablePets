package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetsComparatorTest {


    @Test
    public void comparePetsTest(){

        //Given
        Pets pet1 = new Pets("Max");
        Pets pet2 = new Pets("Chloe");
        int expected = -1;

        //When
        int actual = PetsComparator.compare(pet1, pet2);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void comparePetsTest2(){

        //Given
        Pets pet1 = new Pets("Max");
        Pets pet2 = new Pets("Max")
        int expected = 0;

        //When
        int actual = PetsComparator.compare(pet1, pet2);

        //
        Assert.assertEquals(expected, actual);


    }

        @Test
        public void comparePetsTest3(){
            //Given
            Pets pet1 = new Pets("Max");
            Pets pet2 = new Pets("Ned"):
            int expected = 1;

            //When
            int actual = PetsComparator.compare(pet1, pet2);

            //Then
            Assert.assertEquals(expected,actual);




        }




}