package Mastery;
import java.util.Scanner;
/*
Program: Digits.java          Date: 9/14/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class Order 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of burgers: ");
		float burger = input.nextInt();
		float Burger = (float) (burger* 1.69);
		
		System.out.println("Enter the number of fries: ");
		int fries = input.nextInt();;
		float Fries = (float) (burger* 1.09);
		
		System.out.println("Enter the number of sodas: ");
		int soda = input.nextInt();
		float Soda = (float) (burger* 0.99);
		
		//Tax
		System.out.println("Tax: ");
		
		//Final amount
		float total = (Burger + Fries + Soda);
		System.out.println("Final Total: " + total);
		
		//Amount
		System.out.println("Enter amount tendered");
		
		//Change
		System.out.println("Change");
		
	}

}
