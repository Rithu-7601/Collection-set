package co.collections.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BankTest {

    public static void main(String[] args) {
        HashMap<String, Float> bank = new HashMap<String,Float>();
        System.out.println(bank.put("Abc", 25000f));//New key so we'll get  -> null
        System.out.println(bank.put("Abc",11500.90f));//Exsisting key so we'll get -> 25000.0
        System.out.println(bank.put("Anil",11500.90f));//null

        bank.put("Anuj",60000f);
        bank.put("Kabir",80000f);
        bank.put("Suraj",90000f);

        System.out.println(bank);//{Suraj=90000.0, Abc=11500.9, Kabir=80000.0, Anuj=60000.0, Anil=11500.9}

        //to get the value based on the key!
        System.out.println("-----------------------------------");
        float bal = bank.get("Kabir");
        System.out.println("account balance of kabir is " + bal);
        bal += 10000f;
        bank.put("Kabir",bal);
        System.out.println(bank);
        System.out.println("-----------------------------------");

        Set<String> names = bank.keySet();
        for(String name : names)
        {
            //System.out.print(name+ "  |  ");
            if(name == "Anil"){
                System.out.print(name);
            }
            else{
                System.out.print(name+" | ");
            }
        }
        System.out.println();
        System.out.println("-----------------------------------");

         Set<Map.Entry<String,Float>> entries = bank.entrySet();
        Iterator<Map.Entry<String,Float>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String,Float> entry = it.next();
            String name = entry.getKey();
            bal = entry.getValue();
            System.out.println(name+"  "+bal);
        }

        System.out.println("-----------------------------------");



    }

}
