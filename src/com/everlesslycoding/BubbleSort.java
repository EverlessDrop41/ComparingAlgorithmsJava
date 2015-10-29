package com.everlesslycoding;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by emilyperegrine on 29/10/2015.
 */
public class BubbleSort implements SortingAlgorithm {

    private List<Integer> mList;
    SortingData mSortingData;

    BubbleSort(List<Integer> list){
        mList = list;
        mSortingData = new SortingData();
    }

    @Override
    public void setList(List<Integer> list) {
        mList = list;
    }

    @Override
    public void sort() {
        List<Integer> unsorted = mList;
        mSortingData.setBeforeList(unsorted);

        for (int i = 0; i < unsorted.size() - 1; i++) {
            for (int j = 0; j < unsorted.size() - 1; j++) {
                mSortingData.incrementComparisons();
                if (unsorted.get(j) > unsorted.get(j + 1)) {
                    mSortingData.incrementSwaps();
                    Collections.swap(unsorted, j, j + 1);
                }
            }
        }

        mSortingData.setAfterList(unsorted);
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
        System.out.println(mSortingData);
    }
}
