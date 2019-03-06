package io.zipcoder;

import java.util.*;

public class PetsComparator {


    public int compare(Pets o1, Pets o2) {
        int byClass = o1.getClass().toString().compareTo(o2.getClass().toString());
        int byName =o1.getName().compareTo(o2.getName());
        if(byName==0){
            return byClass ;
        } else {
            return byName;
        }
    }


}
//    Pets[] petArray;
//
//    public PetsComparator(){
//        this.petArray = petArray;
//    }


//    public Pets[] petsSort (Comparator<Pets> comparator) {
//        List<Pets> petList = new ArrayList(Arrays.asList(petArray));
//        Collections.sort(petList,comparator);
//        Pets[] petsSorted = new Pets[petList.size()];
//        petsSorted =petList.toArray(petsSorted);
//        return petsSorted;
