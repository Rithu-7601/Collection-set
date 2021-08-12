package co.collections.util;

import java.util.HashSet;

public class SetHash {
    public static void main(String[] args) {
        HashSet<String> courses = new HashSet<>();
        System.out.println(courses+" | size = "+courses.size());

        System.out.println(courses.add("Java"));//true
        System.out.println(courses.add("Java"));//false

        System.out.println(courses.add("Python"));//true
        courses.add("R");
        courses.add("Javascript");
        courses.add("C++");

        System.out.println(courses+" | size = "+courses.size());//[Java, R, C++, Javascript, Python] | size = 5
    }
}
