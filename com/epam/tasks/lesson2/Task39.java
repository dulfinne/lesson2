package com.epam.tasks.lesson2;

import java.util.Scanner;

public class Task39
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x = ");
		double x = Double.parseDouble(scan.nextLine());
		
		double result = (((2 * x - 3) * x + 4) * x -5) * x + 6;
		System.out.println(result);
	}
}
