package com.epam.tasks.lesson2;

import java.util.Scanner;

public class Task33
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any character: ");
		int input = scan.nextLine().charAt(0);
		System.out.println("You entered: " + (char)input + ", it\'s serial number is "
		+ input + ".\nPrevious and next characters: " + (char)(input - 1) + " and " + (char)(input + 1));
	}
}
