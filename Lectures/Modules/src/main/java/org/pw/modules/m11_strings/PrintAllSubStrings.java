package org.pw.modules.m11_strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrintAllSubStrings {
    public static void main(String[] args) {
        String name="pratap";
        for (int i = 0; i < name.length(); i++) {
            for (int j = i+1; j <= name.length(); j++) {
                String substring = name.substring(i, j);
                System.out.print(substring+" ");
            }
            System.out.println();
        }

        List<String> list=new LinkedList();

        // 0,1, 2
        list.add("Pratap");

        list.add("vaishnavi");
//        list.add(700);
        list.add("Pratap");


        System.out.println(list);
        list.add(0,"Patil");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.forEach(e-> System.out.println(e));

        for(String s:list){

        }

        // iterator
        System.out.println("Using iterator \n");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        list.set(2,"Adhav");
        System.out.println(list);
    }
}
