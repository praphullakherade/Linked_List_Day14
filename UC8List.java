package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class UC8List {
    @Test
    public void passTest() {
        UC8 uc8 = new UC8();
        uc8.push(56);
        uc8.push(30);
        uc8.push(70);
        int check = uc8.insertAfter(40);
        Assert.assertEquals(1, check);
    }
}
