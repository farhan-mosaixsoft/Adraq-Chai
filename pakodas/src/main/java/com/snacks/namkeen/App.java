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

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int eatWithSamosas() {
        Chilli chilli = new Chilli();
        return chilli.getChillies();
    }
}
