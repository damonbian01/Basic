package com.damon.test.algorithms.sort;

import com.damon.test.algorithms.sort.impl.MaxHeapSort;
import com.damon.test.algorithms.sort.SortUtil;

/**
 * Created by Damon on 2016/9/23.
 */
public class MaxHeapSortTest {

    public static void main(String[] args) throws Exception {
        int[] array = {2, 1, 3, 4, 5, 37, 36, 32};
        SortUtil heapSort = new MaxHeapSort(array);
        heapSort.sort();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
