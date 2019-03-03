package io.zipcoder;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        IOConsole console = new IOConsole();

        Integer numberOfPeets = console.getIntegerInput("Please enter the number of Pets");
        Pets[] yourPets = new Pets[numberOfPeets];
        for (int i = 0; i < numberOfPeets; i++) {
            String names = console.getStringInput("What's the name of your pet");
            String type = console.getStringInput("What's the type of your pet");
            if(type.equalsIgnoreCase("cat")){
                yourPets[i] = new Cat(names);
            }

        }

        console.println(yourPets.toString());


    }


}
