package com.zensar.gourab.sarkar.question1;

import java.util.Scanner;

public class NumberTest {

	public static void main(String[] args) {
		
		double[] doubleArray = new double[5];
		
		Scanner sc = new Scanner(System.in); 
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Enter a number to insert into the array: ");
			doubleArray[i] = sc.nextDouble();		// Values to be entered: // -25.70, 16.25, 45.85,35.5, 12.25	
		}
		
		System.out.println("The average of the array elements is: " + calculateArrayAverage(doubleArray));
		
		updateArrayElements(doubleArray);

	}
	
	public static void displayArrayElements(double[] doubleArray)
	{
		System.out.println("Here are the array elements: " );
		for(int i = 0; i < doubleArray.length; i++)
		{
			System.out.println(doubleArray[i]);
		}
	}
	
	public static void updateArrayElements(double[] doubleArray)
	{
		for (int i = 0; i < doubleArray.length; i++)
		{
			if (doubleArray[i] > 12.0 && doubleArray[i] < 40.0)
			{
				doubleArray[i] += 2.5;
			}
		}
		
		displayArrayElements(doubleArray);
	}
	
	public static double calculateArrayAverage(double[] doubleArray)
	{
		double totalDouble = 0;
		for(int i = 0; i < doubleArray.length; i++)
		{
			totalDouble += doubleArray[i];
		}
		return totalDouble / doubleArray.length;
	}

}
