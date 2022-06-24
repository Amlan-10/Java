package com.Amlan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        list.add(new Student("Amlan",1));
        list.add(new Student("Rajesh",4));
        list.add(new Student("Ravi",3));
        list.add(new Student("Suresh",2));

        Student s1=new Student("Amlan",10);
        Student s2=new Student("Ayan",4);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, (o1,o2) ->o1.name.compareTo(o2.name));
        System.out.println(list);
    }
}
