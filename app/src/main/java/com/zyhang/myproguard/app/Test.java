package com.zyhang.myproguard.app;

/**
 * Created by zyhang on 2018/9/21.15:19
 */

public class Test {

    private int test;

    public Test(int test) {
        this.test = test;
    }

    public int getTest() {
        return test;
    }

    public Test setTest(int test) {
        this.test = test;
        return this;
    }

    @Override
    public String toString() {
        return "Test{" + "test=" + test +
                '}';
    }
}
