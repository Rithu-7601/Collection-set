package co.collections.util;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,Float> bank = new TreeMap<String,Float>();
        System.out.println(bank.put("Abc", 25000f));
        System.out.println(bank.put("Abc",11500.90f));
        System.out.println(bank.put("Anil",11500.90f));

        bank.put("Anuj",60000f);
        bank.put("Kabir",80000f);
        bank.put("Kabir",50000f);
        bank.put("Suraj",90000f);

        System.out.println(bank);
    }
}
