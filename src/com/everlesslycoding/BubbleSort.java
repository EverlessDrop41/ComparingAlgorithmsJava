package com.everlesslycoding;

import java.util.List;

/**
 * Created by emilyperegrine on 29/10/2015.
 */
public class BubbleSort implements SortingAlgorithm {

    private List<Integer> mList;

    @Override
    public void setList(List<Integer> list) {
        mList = list;
    }

    @Override
    public void sort() {
        //TODO: Implement bubble sort
    }

    @Override
    public void printList(String pre) {
        System.out.println(pre + mList.toString());
    }

    @Override
    public void printSort() {
        printList("Before: ");
        sort();
        printList("After: ");
    }
}
