package co.collections.util;

import java.util.TreeSet;

public class ExampTreeSet {
    public static void main(String[] args) {
        TreeSet<String> courses = new TreeSet<>();
        System.out.println(courses+" | size = "+courses.size());

        System.out.println(courses.add("Java"));
        System.out.println(courses.add("Java"));

        System.out.println(courses.add("Python"));
        courses.add("R");
        courses.add("Javascript");
        courses.add("C++");

        System.out.println(courses+" | size = "+courses.size());
    }
}
