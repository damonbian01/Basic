package com.damon.test.api.IntegerUtil;

/**
 * Created by Damon on 2016/9/27.
 */
public class IntegerUtil {

    public static void higher(int value, int target) throws Exception {
        if (value < target) throw new Exception(String.format("%s not higher than %s", value, target));
    }
}
