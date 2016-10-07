package com.snacks.namkeen;

import java.util.concurrent.ThreadLocalRandom;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testMultiplyAlwaysPass() {
        App app = new App();
        for (int i = 0; i < 10; ++i) {
            int a = ThreadLocalRandom.current().nextInt(0, 100);
            int b = ThreadLocalRandom.current().nextInt(0, 100);
            int prod = app.multiply(a, b);
            System.out.println(prod);
            assertTrue(prod < 10000);
        }
    }

    /*
    public void testMultiplyAlwaysFail() {
        App app = new App();
        for (int i = 0; i < 10; ++i) {
            int a = ThreadLocalRandom.current().nextInt(0, 100);
            int b = ThreadLocalRandom.current().nextInt(0, 100);
            int prod = app.multiply(a, b);
            int threshold = 0;
            System.out.println(prod);
            assertTrue(prod < threshold);
        }
    }

    public void testMultiplyRandomFail() {
        App app = new App();
        for (int i = 0; i < 10; ++i) {
            int a = ThreadLocalRandom.current().nextInt(0, 100);
            int b = ThreadLocalRandom.current().nextInt(0, 100);
            int prod = app.multiply(a, b);
            int threshold = ThreadLocalRandom.current().nextInt(5000, 10000);
            System.out.println(prod);
            assertTrue(prod < threshold);
        }
    }
    */
    
    public void testDependencies() {
        App app = new App();
        System.out.println(app.eatWithSamosas());
        assertTrue(true);
    }
}
