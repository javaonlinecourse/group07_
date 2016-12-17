package com.javaonlinecourse.b4lesson2.classwork;

import org.apache.commons.collections.bidimap.DualHashBidiMap;

import java.util.*;

import static com.javaonlinecourse.b4lesson2.classwork.Boy.createBoysList;

/**
 * @author emitrohin
 * @version 1.0
 *          15.12.2016
 */
public class CollectionExample {
    public static void main(String[] args){
        Integer[] ints = new Integer[]{ 1,2,3,4,5};
        List<Integer> list = Arrays.asList(1, 5, 8);
    }
}

class BoyNameComparator implements Comparator<Boy>
{
    @Override
    public int compare(Boy o1, Boy o2) {
        return o1.name.compareTo(o2.name);
    }
}

class BoyWeightComparator implements Comparator<Boy>
{
    @Override
    public int compare(Boy o1, Boy o2) {
        return (o1.weight < o2.weight) ? -1 : ((o1.weight == o2.weight) ? 0 : 1);
    }
}


class Boy implements Comparable<Boy>{
    public int age;
    public String name;
    public int weight;

    public Boy(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Boy o) {
            return (age < o.age) ? -1 : ((age == o.age) ? 0 : 1);
    }

    public static void createBoysSet() {
        Set<Boy> set = new TreeSet<>();
        set.add(new Boy(1, "as", 10));
        set.add(new Boy(5, "df", 13));
        set.add(new Boy(9, "nm", 12));
        set.add(new Boy(7, "jk", 17));
        set.add(new Boy(2, "op", 19));
        set.add(new Boy(1, "qw", 11));

        for (Boy x: set) {
            System.out.println("Boy age value " + x.age + " ");
        }
    }


    public static void createBoysList() {
        List<Boy> list = new ArrayList<>();
        list.add(new Boy(1, "as", 10));
        list.add(new Boy(5, "zzz", 13));
        list.add(new Boy(9, "nm", 12));
        list.add(new Boy(7, "bk", 17));
        list.add(new Boy(2, "op", 19));
        list.add(new Boy(1, "vw", 11));

        Collections.sort(list, new Comparator<Boy>() {
            @Override
            public int compare(Boy o1, Boy o2) {
                return 0;
            }
        });
        for (Boy x: list) {
            System.out.println("Boy age value " + x.age + " weight value " + x.weight + " name " + x.name);
        }
    }
}
