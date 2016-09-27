package com.damon.test.algorithms.sort;

import com.damon.test.algorithms.sort.impl.MergeSort;

/**
 * Created by Damon on 2016/9/23.
 */
public class MergeSortTest {
    public static void main(String[] args) throws Exception {
        int[] array = {2, 1, 3, 4, 5, 37, 36, 32};
        SortUtil mergeSort = new MergeSort(array);
        mergeSort.sort();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
