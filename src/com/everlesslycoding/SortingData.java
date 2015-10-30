package com.everlesslycoding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emilyperegrine on 29/10/2015.
 */
public class SortingData {
    List<Integer> mBeforeList;
    List<Integer> mAfterList;

    int mComparisons;
    int mSwaps;


    @Override
    public String toString() {
        return "SortingData{" +
                "BeforeList=" + mBeforeList +
                ", AfterList=" + mAfterList +
                ", mComparisons=" + mComparisons +
                ", mSwaps=" + mSwaps +
                '}';
    }

    public List<Integer> getBeforeList() {
        return mBeforeList;
    }

    public void setBeforeList(List<Integer> beforeList) {
        mBeforeList = new ArrayList<>(beforeList);
    }

    public List<Integer> getAfterList() {
        return mAfterList;
    }

    public void setAfterList(List<Integer> afterList) {
        mAfterList = new ArrayList<>(afterList);
    }

    public int getComparisons() {
        return mComparisons;
    }

    public void setComparisons(int comparis) {
        this.mComparisons = comparis;
    }

    public void incrementComparisons() {
        this.mComparisons++;
    }

    public int getSwaps() {
        return mSwaps;
    }

    public void setSwaps(int swaps) {
        this.mSwaps = swaps;
    }

    public void incrementSwaps() {
        this.mSwaps++;
    }
}
