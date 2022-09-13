import java.util.Scanner;
/*
Program: DistancePart2.java          Date: 9/13/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class DistancePart2 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);//calls in scanner
		
		System.out.println("Distance of Segment: ");
		double Seg1 = input.nextInt();
		
		System.out.println("Enter a three digit number:");
		double Seg2 = input.nextInt();
		
		System.out.println("Distance of Segment: ");
		double Seg3 = input.nextInt();
		
		double TotalSeg = Seg1 + Seg2 + Seg3;
		System.out.print("The total race is distance ");
		System.out.format("%.1f",TotalSeg);
		System.out.print("Km");
		
	}

}

/*Screen Dump
 
	Distance of Segment: 
	1
	Enter a three digit number:
	2
	Distance of Segment: 
	3
	The total race is distance 6.0Km
	
*/
 