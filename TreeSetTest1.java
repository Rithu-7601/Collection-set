package co.collections.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) {
        TreeSet<Integer> marks = new TreeSet<Integer>(new MyComparator());
        //by defaault the elements will be arranged in ascending order in treeset
        marks.add(99);
        marks.add(75);
        marks.add(98);
        marks.add(67);
        marks.add(76);
        System.out.println(marks);//[67, 75, 76, 98, 99]

        //to get the elements in descending order
        //System.out.println(marks.descendingSet());
    }
}
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       //return -2; //try here with 1, 0, any negative value like -2 etc.
        System.out.println(o1+" "+o2);
        //to get the elements in descending order
        if(o1 > o2){
            return -1;
        }
        else if(o1 < o2){
            return 1;
        }
        else {
            return 0;
        }

    }
}