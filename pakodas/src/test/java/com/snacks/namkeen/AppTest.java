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

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        App app = new App();
        for (int i = 0; i < 10; ++i) {
            int a = ThreadLocalRandom.current().nextInt(0, 200);
            int b = ThreadLocalRandom.current().nextInt(0, 200);
            System.out.println(a + " * " + b + " = " + app.multiple(a, b));
        }
    }
}
