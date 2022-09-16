package SkillBuilding;
import java.util.Scanner;
/*
Program: SurfsUpPart1.java          Date: 9/16/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class SurfsUpPart1 
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
	}

}
/*Screen Dump
What is the wave height today: 
7
Great day for surfing! 
 */
