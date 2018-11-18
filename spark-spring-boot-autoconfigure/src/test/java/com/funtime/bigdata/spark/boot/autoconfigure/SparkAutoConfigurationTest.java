package com.funtime.bigdata.spark.boot.autoconfigure;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SparkAutoConfigurationTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SparkAutoConfigurationTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SparkAutoConfigurationTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
