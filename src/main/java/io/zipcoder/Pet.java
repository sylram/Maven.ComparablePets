package io.zipcoder;

import java.lang.Comparable;


public class Pet implements Comparable<Pet> {

    String name;


    public Pet(String name) {
        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return null;
    }

    public int compareTo(Pet p) {
        int byClass = this.name.getClass().toString().compareTo(p.getClass().toString());
        int byName = this.name.compareTo(p.getName());
        if (byName > 0) {
            return 1;
        } else if (byName < 0) {
            return -1;
        }else{
            if (byClass < 0) {
                return -1;
            }else if (byClass > 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'';
    }
}
