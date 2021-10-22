package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class UC9Test {
    @Test
    public void passTest() {
        UC9 uc9 = new UC9();
        uc9.push(56);
        uc9.push(30);
        uc9.push(70);
        uc9.insertAfter(40);
        int check = uc9.deleteAfter(40);
        Assert.assertEquals(1, check);
    }
}
