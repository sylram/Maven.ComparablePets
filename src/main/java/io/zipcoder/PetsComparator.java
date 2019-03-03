package io.zipcoder;

import java.util.*;

public class PetsComparator implements Comparator<Pets> {

    Pets[] petArray;



    public int compare(Pets o1, Pets o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public Pets[] petsSort (Comparator<Pets> comparator) {
        List<Pets> petList = new ArrayList(Arrays.asList(petArray));
        Collections.sort(petList,comparator);
        Pets[] petsSorted = new Pets[petList.size()];
        petsSorted =petList.toArray(petsSorted);

        return petsSorted;

    }
}

