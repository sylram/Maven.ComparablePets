package io.zipcoder;


import java.util.*;

public class Application {
    String type;
    String name;
    Pets pet;
    IOConsole console;
    ArrayList<Pets> yourPets;


    public static void main(String[] args) {
        Application app = new Application();
        app.toString();
    }


    public Application() {
        console = new IOConsole();
        yourPets = new ArrayList<Pets>();
        Integer numberOfPets = console.getIntegerInput("Please enter the number of Pets");

        for (int i = 0; i < numberOfPets; i++) {
            String name = console.getStringInput("What's the name of your pet");
            String type = console.getStringInput("What's the type of your pet");


            if (type.equalsIgnoreCase("cat")) {
                Cat cat = new Cat(name);
                yourPets.add(cat);
            } else if (type.equalsIgnoreCase("dog")) {
                Dog dog = new Dog(name);
                yourPets.add(dog);
            } else if (type.equalsIgnoreCase("fish")) {
                Fish fish = new Fish(name);
                yourPets.add(fish);
            }

        }
//            console.println(yourPets.toString());
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}

