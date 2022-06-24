package com.Amlan;
import java.util.Set;
import java.util.TreeSet;
public class treesetpractice {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(38);
        set.add(72);
        set.add(14);
        System.out.println(set);
        set.remove(38);
        System.out.println(set);
        System.out.println(set.contains(14));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
    }
}
