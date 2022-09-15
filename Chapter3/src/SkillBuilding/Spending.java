package SkillBuilding;
import java.util.Scanner;
/*
Program: Spending.java          Date: 9/15/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class Spending 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount spent last month on the following items: ");
		
		//Space
		System.out.println("");
		System.out.println("");
		//Space
		
		
		System.out.println("Food:  ");
		double food = input.nextDouble();
		
		System.out.println("Clothing:  ");
		double clothing = input.nextDouble();
		
		System.out.println("Entertainment:  ");
		double entertainment = input.nextDouble();
		
		System.out.println("Rent:  ");
		double rent = input.nextDouble();
		
		//Space
		System.out.println("");
		//Space
		
		double total = food + clothing + entertainment + rent;//total amount spent
		
		System.out.println("Category		Budget");
		
		double foodPer = (food/total)*100;
		System.out.print("Food			");
		System.out.format("%.2f", foodPer);
		System.out.print(" %");
		
		//Space
		System.out.println("");
		//Space
		
		double clothingPer = (clothing/total)*100;
		System.out.print("Clothing		");
		System.out.format("%.2f", clothingPer);
		System.out.print(" %");
		
		//Space
		System.out.println("");
		//Space
		
		
		double entertainmentPer = (entertainment/total)*100;
		System.out.print("Entertainment		");
		System.out.format("%.2f", entertainmentPer);
		System.out.print(" %");
		
		//Space
		System.out.println("");
		//Space
		
		
		
		double rentPer = (rent/total)*100;
		System.out.print("Rent			");
		System.out.format("%.2f", rentPer);
		System.out.print(" %");
		
		//Space
		System.out.println("");
		//Space
		
		
	}

}
