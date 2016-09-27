package com.damon.test.algorithms.sort.impl;

import com.damon.test.algorithms.sort.SortUtil;

/**
 * Created by Damon on 2016/9/23.
 */
public class MergeSort implements SortUtil {
    private int[] array;

    public MergeSort() {
    }

    public MergeSort(int[] array) {
        init(array);
    }

    public void init(int[] array) {
        this.array = array;
    }

    public void sort() throws Exception {
        if (null == array || array.length < 1) throw new Exception("sort array is null");
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] nums, int low, int high) {
        if (null == nums || low >= high || high == 0) return;

        int mid = (low + high) / 2;
        if (low < high) {
            sort(nums, low, mid);
            sort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int[] tmp = new int[high - low + 1];
        /* 左指针 */
        int i = low;
        /* 右指针 */
        int j = mid + 1;
        /* 新数组指针 */
        int k = 0;

        /* 把较小的数移到数组当中 */
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) tmp[k++] = nums[i++];
            else tmp[k++] = nums[j++];
        }

        /* 把左边剩余的移动到数组中 */
        while (i <= mid) tmp[k++] = nums[i++];
        /* 把右边剩余的移动到数组中 */
        while (j <= high) tmp[k++] = nums[j++];

        /* 覆盖nums数组 */
        for (int n = 0; n < tmp.length; n++)
            nums[n + low] = tmp[n];
    }
}
