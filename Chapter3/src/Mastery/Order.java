package Mastery;
import java.util.Scanner;
/*
Program: Order.java          Date: 9/15/2022


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
		double burger = input.nextInt();
		double Burger = burger* 1.69;
		
		System.out.println("Enter the number of fries: ");
		int fries = input.nextInt();;
		double Fries = fries* 1.09;
		
		System.out.println("Enter the number of sodas: ");
		int soda = input.nextInt();
		double Soda = soda* 0.99;
		
		//Before Tax
		double BeforeTax = (Burger + Fries + Soda);
		System.out.print("Total Before Tax: $");
		System.out.format("%.2f", BeforeTax);
		System.out.println();//Spacing
		
		
		//Tax
		double tax = BeforeTax*0.065;
		System.out.print("Tax: $");
		System.out.format("%.2f", tax);
		System.out.println();//Spacing
		
		//After Tax
		double AfterTax = (Burger + Fries + Soda + tax);
		System.out.print("Final Amount: $");
		System.out.format("%.2f", AfterTax);
		System.out.println();//Spacing
		
		//Amount
		System.out.println();//Spacing
		System.out.println("Enter amount tendered: $");
		double Tendered = input.nextDouble();
		
		//Change
		System.out.print("Change: $");
		double Change = Tendered - AfterTax;
		System.out.format("%.2f", Change);
		System.out.println();//Spacing
		
	}

}
/*
Enter the number of burgers: 
2
Enter the number of fries: 
5
Enter the number of sodas: 
5
Total Before Tax: $13.78
Tax: $0.90
Final Amount: $14.68

Enter amount tendered: $
20.00
Change: $5.32 
*/
 