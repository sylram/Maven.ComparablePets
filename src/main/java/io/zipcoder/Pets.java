package io.zipcoder;
import java.util.ArrayList;
import java.util.Collections;

import java.lang.Comparable;


public class Pets implements Comparable<Pets>{

    String name;
    ArrayList petsData;



    public Pets(String name){
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
    public void sortPets(){
        Collections.sort(petsData);

    }

}
