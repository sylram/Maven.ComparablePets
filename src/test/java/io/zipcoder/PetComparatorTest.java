package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetComparatorTest {
    PetsComparator petsComparator;

    @Before
    public void setUp() {
        petsComparator = new PetsComparator();
    }

    @Test
    public void comparePetsTest() {

        //Given
        Pet pet1 = new Pet("Aly");
        Pet pet2 = new Pet("Chloe");
        int expected = -1;

        //When
        int actual = petsComparator.compare(pet1, pet2);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void comparePetsTest2() {

        //Given
        Pet pet1 = new Pet("Max");
        Pet pet2 = new Pet("Max");
        int expected = 0;

        //When
        int actual = petsComparator.compare(pet1, pet2);

        //
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void comparePetsTest3() {
        //Given
        Pet pet1 = new Pet("Zed");
        Pet pet2 = new Pet("Ned");
        int expected = 1;

        //When
        int actual = petsComparator.compare(pet1, pet2);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void comparePetsTest4() {

        //Given
        Pet pet1 = new Cat("Max");
        Pet pet2 = new Dog("Chloe");
        int expected = -1;

        //When
        int actual = petsComparator.compare(pet1, pet2);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void comparePetsTest5() {

        //Given
        Pet pet1 = new Fish("Max");
        Pet pet2 = new Dog("Max");
        int expected = 1;

        //When
        int actual = petsComparator.compare(pet1, pet2);

        //
        Assert.assertEquals(expected, actual);


    }


}