package com.epam.tasks.lesson2;

import java.util.Scanner;

public class Task13
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the coordinates of the triangle's vertices:");
		int x1 = Integer.parseInt(scan.nextLine());
		int x2 = Integer.parseInt(scan.nextLine());
		int y1 = Integer.parseInt(scan.nextLine());
		int y2 = Integer.parseInt(scan.nextLine());
		int z1 = Integer.parseInt(scan.nextLine());
		int z2 = Integer.parseInt(scan.nextLine());
		
		double a = getLength(x1, x2, y1, y2);
		double b = getLength(x1, x2, z1, z2);
		double c = getLength(y1, y2, z1, z2);
		
		double p = a + b + c;
		double s = Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c));
		
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		System.out.println("P = " + p + ", S = " + s);
	}
	
	public static double getLength(int x1, int x2, int y1, int y2)
    {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

}
