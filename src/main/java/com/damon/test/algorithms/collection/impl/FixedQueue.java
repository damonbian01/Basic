package com.damon.test.algorithms.collection.impl;

import com.damon.test.algorithms.collection.CollectionUtil;
import com.damon.test.api.IntegerUtil.IntegerUtil;

/**
 * Created by Damon on 2016/9/27.
 */
public class FixedQueue implements CollectionUtil {
    private int[] array;
    private int front;
    private int currCapacity;
    private int capacity;

    public FixedQueue() {
    }

    public FixedQueue(int capacity) throws Exception {
        this.capacity = capacity;
        IntegerUtil.higher(capacity, 1);
        this.array = new int[capacity];
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        if (currCapacity == 0) return true;
        else return false;
    }

    /**
     * @param value
     */
    public void push(int value) throws Exception {
        if (null == array) throw new Exception("please init capacity");
        /* 队列满，插入在front，front后移一位 */
        if (currCapacity == capacity) {
            array[this.front] = value;
            front = (front + 1) % (capacity);
        } else if (currCapacity < capacity) {
            int insertPos = (this.front + currCapacity) % (capacity);
            array[insertPos] = value;
            currCapacity = (currCapacity + 1) % (capacity + 1);
        } else {
            throw new Exception(String.format("current installed %s elements and capacity is %s", currCapacity, capacity));
        }
    }

    /**
     * @return
     */
    public int pop() throws Exception {
        if (null == array) throw new Exception("please init capacity");
        if (isEmpty()) throw new Exception("FixedQueue is empty");
        else {
            int result = array[front];
            front = (front + 1) % capacity;
            currCapacity--;
            return result;
        }
    }

}
