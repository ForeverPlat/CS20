package SkillBuilding;
import java.util.Scanner;
/*
Program: DistancePart2.java          Date: 9/13/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class Digits 
{

	public static void main(String[] args) 
	{
		try {
			Scanner input = new Scanner(System.in);//calls in scanner
			
			System.out.println("Enter a two digit number:");
			int num = input.nextInt();
			String num0 = Integer.toString(num);//changes changing num to a string
			char num1 = num0.charAt(0);//gets the first place value
			char num2 = num0.charAt(1);//gets the second place value
		
				
			System.out.println("The tens-place digit is"+num1);
			System.out.println("The ones-place digit is"+num2);	
		}
		catch (Exception e) 
		{
			System.out.println("You must put in a 2 digit number.");
		}
	}

}

/*Screen Dump
	Enter a two digit number:
	12
	The tens-place digit is1
	The ones-place digit is2
	
	//or
	
	Enter a two digit number:
	1
	You must put in a 2 digit number.
 */
 