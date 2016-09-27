package com.damon.test.algorithms.sort.impl;

import com.damon.test.algorithms.sort.SortUtil;

/**
 * Created by Damon on 2016/9/23.
 */
public class MaxHeapSort implements SortUtil {
    private int[] array;
    private int heapSize;
    private boolean isBuild = false;

    public MaxHeapSort() {
    }

    public MaxHeapSort(int[] array) {
        this.init(array);
    }

    public void init(int[] array) {
        this.array = array;
        this.heapSize = (null == array) ? 0 : array.length;
        this.isBuild = false;
    }

    public void BuildMaxHeap() throws Exception {
        if (null == this.array) throw new Exception("sort array is null");
        if (!this.isBuild) {
            /* 非叶子节点从 n/2 - 1 开始，从底层向上，依次最大堆化 */
            for (int i = this.heapSize / 2 - 1; i >= 0; i--) {
                maxNode(i);
            }
            this.isBuild = true;
        }
    }

    public void sort() throws Exception {
        if (null == this.array) throw new Exception("sort array is null");
        if (!isBuild) this.BuildMaxHeap();
        for (int i = 0; i < this.array.length; i++) {
            /* 每次都将最大值放到末尾 */
            int max = this.array[0];
            this.array[0] = this.array[heapSize - 1];
            this.array[heapSize - 1] = max;
            this.heapSize--;
            /* 重新调整堆 */
            maxNode(0);
        }
    }

    private void maxNode(int i) {
        /* 最大化子树节点i */
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;

        if (left < this.heapSize && this.array[left] > this.array[i]) max = left;
        else max = i;
        if (right < this.heapSize && this.array[right] > this.array[max]) max = right;
        /* 超过了比较范围 */
        if (max == i || max >= this.heapSize) return;
        int tmp = this.array[i];
        this.array[i] = this.array[max];
        this.array[max] = tmp;
        /* 递归调用，BuilMaxHeap保证从底层往上都是最大化堆，调换破环后，需要递归修复 */
        maxNode(max);
    }

}
