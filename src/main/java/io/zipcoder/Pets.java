package io.zipcoder;
import java.util.ArrayList;
import java.util.Collections;

import java.lang.Comparable;


public class Pets implements Comparable<Pets>{

    String name;


    public Pets(String name) {
        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "sound";
    }

    public int compareTo(Pets p){
        int byName = this.name.compareTo(p.getName());
        return byName ;

    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'';
    }
}
