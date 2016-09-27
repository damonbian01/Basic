package com.damon.test.algorithms.collection;

import com.damon.test.algorithms.collection.impl.FixedQueue;

/**
 * Created by Damon on 2016/9/27.
 */
public class FixedQueueTest {

    public static void main(String[] args) throws Exception {
        FixedQueue queueTest = new FixedQueue(5);
        queueTest.push(1);
        System.out.println(queueTest.pop());
        queueTest.push(2);
        System.out.println(queueTest.pop());
        queueTest.push(3);
        System.out.println(queueTest.pop());
        queueTest.push(4);
        System.out.println(queueTest.pop());
        queueTest.push(5);
        System.out.println(queueTest.pop());
        queueTest.push(6);
        System.out.println(queueTest.pop());
        queueTest.push(7);
        System.out.println(queueTest.pop());
        queueTest.push(8);
        queueTest.push(9);
        queueTest.push(10);
        queueTest.push(11);
        queueTest.push(12);
        System.out.println(queueTest.pop());
        System.out.println(queueTest.pop());
        System.out.println(queueTest.pop());
        System.out.println(queueTest.pop());
        System.out.println(queueTest.pop());
    }
}
