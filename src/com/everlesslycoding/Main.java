package com.everlesslycoding;

import java.util.ArrayList;
import java.util.List;

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
    }
}
