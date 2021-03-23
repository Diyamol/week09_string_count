package com.diyamolVarghese_C078791;

import java.util.ArrayList;

public class Week09_Word_Count {
    public static void main(String[] args) {
        String str = "hello hello how Are you HELLO are there happy test you";
        ArrayList<String> items=new ArrayList<String>();
        items.add("hello");
        items.add("HELLO");
        items.add("how");
        items.add("are");
        items.add("Are");
        items.add("you");
        items.add("there");
        items.add("happy");
        items.add("test");
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0;
        String[] string_collection = str.split(" ");
        for (String word : string_collection)
        {
            if(items.get(0).contains(word)||items.get(1).contains(word))
            {
                count1++;
            }
            if(items.get(2).contains(word))
            {
                count2++;
            }
            if(items.get(3).contains(word)||items.get(4).contains(word))
            {
                count3++;
            }
            if(items.get(5).contains(word))
            {
                count4++;
            }
            if(items.get(6).contains(word))
            {
                count5++;
            }
            if(items.get(7).contains(word))
            {
                count6++;
            }
            if(items.get(8).contains(word))
            {
                count7++;
            }
        }
        System.out.println("hello >" +count1);
        System.out.println("how >" +count2);
        System.out.println("are >" +count3);
        System.out.println("you >" +count4);
        System.out.println("there >" +count5);
        System.out.println("happy >" +count6);
        System.out.println("test >" +count7);
    }
}
