package Mastery;
import java.util.Scanner;
/*
Program: CircleCircumference.java          Date: 9/14/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class Change 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//calls in scanner
		 
		 System.out.println("Enter the change in cents: ");
		 int change = input.nextInt();//Takes user input
		 
		 
		 int quarters = change / 25;//finds number of quarters
		 int dimes = ((change % 25)/10);//finds number of dimes 
		 int nickels = ((change % 25)%10)/5;//finds number of nickels
		 int pennies = (change % 10);
		 		  


		 System.out.println("The minimum number of coins is: " +(quarters+dimes+nickels));
		 System.out.println("Quarter: " + quarters);
		 System.out.println("Dimes: "+dimes);
		 System.out.println("Nickels: "+nickels);
		 System.out.println("Pennies: "+pennies);
	}

}
/*
Enter the change in cents: 
212
The minimum number of coins is: 9
Quarter: 8
Dimes: 1
Nickels: 0
Pennies: 2 
*/
