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
		calc.add(1, 2);
		calc.subtract(4, 2);
		calc.multiply(10, 10);
		calc.divide(100, 10);		
    }
}
