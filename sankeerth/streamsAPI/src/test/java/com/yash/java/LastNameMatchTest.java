package com.yash.java;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class LastNameMatchTest extends TestCase {

    @Test
    public void testlastname(){
        Assert.assertEquals(1, LastNameMatch1.getLastName().size());
    }
}
