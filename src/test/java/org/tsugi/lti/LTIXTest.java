package org.tsugi;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.tsugi.LTIX;
import org.tsugi.impl.LTIX_JDBC;


public class LTIXTest {

    LTIX ltix = null;

    @Before
    public void setUp() throws Exception {
        ltix = new LTIX_JDBC();
    }
    
    @Test
    public void testImpl() {
        System.out.println("YOYO "+ltix.customGet("a","b"));
    }

}