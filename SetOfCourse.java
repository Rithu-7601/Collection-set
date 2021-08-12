package co.collections.util;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOfCourse {

    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        String moreToADD = "Y";
        while (moreToADD.equalsIgnoreCase("Y")){

            System.out.println("Enter course name: ");
            String cname = sc.next();

            boolean isAdded = courses.add(cname);

            if(!isAdded) {
                System.out.println(cname + " is already in the list");

                System.out.println("Any more course to add: ");
                moreToADD = sc.next();
            }

        }
        System.out.println("courses are "+courses);

    }
}
