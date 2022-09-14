package SkillBuilding;
import java.util.Scanner;
/*
Program: CircleCircumference.java          Date: 9/14/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class CircleCircumference 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle: ");
		double r = input.nextInt();
		
		double pi = 3.14;
		
		double C = 2*pi*r;
		
		System.out.println("The Circumfrence is: " + C);
	}

}
/*Screen Dump

What is the radius of the circle: 
3
The Circumfrence is: 18.84
 
*/
