package com.everlesslycoding;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by emilyperegrine on 29/10/2015.
 */
public class BubbleSort implements SortingAlgorithm {

    private List<Integer> mList;

    BubbleSort(List<Integer> list){
        mList = list;
    }

    @Override
    public void setList(List<Integer> list) {
        mList = list;
    }

    @Override
    public void sort() {
        List<Integer> unsorted = mList;

        for (int i = 0; i < unsorted.size() - 1; i++) {
            for (int j = 0; j < unsorted.size() - 1; j++) {

                if (unsorted.get(j) > unsorted.get(j + 1)) {
                    Collections.swap(unsorted, j, j + 1);
                }
            }
        }

        mList = unsorted;
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
