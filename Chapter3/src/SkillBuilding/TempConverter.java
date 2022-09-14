package SkillBuilding;
import java.util.Scanner;
/*
Program: TempConverter.java          Date: 9/14/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class TempConverter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the Fahrenheit: ");
		float F = input.nextInt();
		
		float C = (5*(F-32))/9;
		
		System.out.println("The Celsius is: " + C);
	}

}

/*
What is the Fahrenheit: 
30
-1.1111112
*/
 