package com.linkedlist;

import org.junit.Assert;

public class UC7Test {
    @Test
    public void passTest() {
        UC7 uc7 = new UC7();
        uc7.push(56);
        uc7.push(30);
        uc7.push(70);
        int check = uc7.search(30);
        Assert.assertEquals(1, check);
    }

    @Test
    public void failTest() {
        UC7 uc7 = new UC7();
        uc7.push(56);
        uc7.push(30);
        uc7.push(70);
        int check = uc7.search(20);
        Assert.assertEquals(0, check);
    }
}