package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */

public class App 
{
	public static void main( String[] args )
    {
		Calculator calc = new Calculator();
		calc.add(1, 5);
		calc.subtract(4, 2);
		calc.multiply(10, 15);
		calc.divide(100, 10);		
    }
}
