package io.zipcoder;

import java.util.Comparator;

public class PetsComparator implements Comparator<Pet> {


    public int compare(Pet o1, Pet o2) {
        int byClass = o1.getClass().toString().compareTo(o2.getClass().toString());
        int byName = o1.getName().compareTo(o2.getName());

        if (byClass > 0) {
            return 1;
        } else if (byClass < 0) {
            return -1;
        }else{
            if (byName > 0) {
                return 1;
            } else if (byName < 0) {
                return -1;
            }
        }
        return 0;
    }
}
