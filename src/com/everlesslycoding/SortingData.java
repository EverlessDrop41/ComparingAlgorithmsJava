package com.everlesslycoding;

import java.util.List;

/**
 * Created by emilyperegrine on 29/10/2015.
 */
public class SortingData {
    List<String> mBeforeList;
    List<String> mAfterList;

    int comparisons;
    int swaps;

    public List<String> getBeforeList() {
        return mBeforeList;
    }

    public void setBeforeList(List<String> beforeList) {
        mBeforeList = beforeList;
    }

    public List<String> getAfterList() {
        return mAfterList;
    }

    public void setAfterList(List<String> afterList) {
        mAfterList = afterList;
    }

    public int getComparisons() {
        return comparisons;
    }

    public void setComparisons(int comparisons) {
        this.comparisons = comparisons;
    }

    public void incrementComparisons() {
        this.comparisons++;
    }

    public int getSwaps() {
        return swaps;
    }

    public void setSwaps(int swaps) {
        this.swaps = swaps;
    }

    public void incrementSwaps() {
        this.swaps++;
    }
}
