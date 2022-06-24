package com.Amlan;

import java.util.HashSet;
import java.util.Set;

public class namerolstudents {
    public static void main(String[] args) {
        Set<Student> StudentSet = new HashSet<>();
        StudentSet.add(new Student("Amlan",1));
        StudentSet.add(new Student("Rajesh",2));
        StudentSet.add(new Student("Ravi",3));
        StudentSet.add(new Student("Suresh",1));
        System.out.println(StudentSet);
    }
}
