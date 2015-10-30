package com.everlesslycoding;

import java.util.List;

/**
 * Created by emilyperegrine on 29/10/2015.
 */
public interface SortingAlgorithm {
    public void setList(List<Integer> list);

    public void sort();

    public void printList(String pre);

    public void printSort();
}
