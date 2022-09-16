package SkillBuilding;
import java.util.Scanner;
/*
Program: SurfsUpPart2.java          Date: 9/16/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class SurfsUpPart2 
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
		if (Height < 6) 
		{
			System.out.println("Go body boarding!");
		}
	}

}
/*
What is the wave height today: 
2
Go body boarding! 

What is the wave height today: 
7
Great day for surfing!
*/
 