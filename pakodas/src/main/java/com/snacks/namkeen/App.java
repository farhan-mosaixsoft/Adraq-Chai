package com.snacks.namkeen;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int multiple(int a, int b) {
        assert((a < 100) && (b < 100));

        return a * b;
    }
}
