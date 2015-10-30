package com.everlesslycoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> mList = new ArrayList<>();
        mList.add(0);
        mList.add(20);
        mList.add(23);
        mList.add(7);
        mList.add(14);
        BubbleSort bs = new BubbleSort(mList);
        bs.printSort();

        System.out.printf("This is the classpath:  %s %n",
                System.getProperty("java.class.path"));
        Set<String> propNames = new TreeSet<String>(System.getProperties().stringPropertyNames());
        for (String propertyName : propNames) {
            System.out.printf("%s is %s %n",
                    propertyName,
                    System.getProperty(propertyName));
        }
    }
}
