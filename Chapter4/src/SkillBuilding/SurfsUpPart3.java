package SkillBuilding;

import java.util.Scanner;

/*
Program: SurfsUpPart3.java          Date: 9/16/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class SurfsUpPart3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the wave height today: ");
		int Height = input.nextInt();
		
		if (Height >= 6) 
		{
			System.out.println("Great day for surfing!");
		}
		if (Height >= 4 && Height <= 5) 
		{
			System.out.println("Go for a swim.");
		}
		if (Height >= 0 && Height <= 3) 
		{
			System.out.println("Whoa! What kind of surf is that?");
		}
	}

}
/*Screen Dump
 * 
What is the wave height today: 
6
Great day for surfing!

What is the wave height today: 
4
Go for a swim

What is the wave height today: 
2
Whoa! What kind of surf is that?
*/
