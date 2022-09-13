import java.util.Scanner;
/*
Program: GradeAvgpart1.java          Date: 9/13/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 20
	 
*/
public class GradeAvgpart1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//calls in scanner
		
		System.out.println("What is the first Grade: ");
		int Grade1 = input.nextInt();//takes input
		
		System.out.println("What is the second Grade: ");
		int Grade2 = input.nextInt();//takes input
		
		System.out.println("What is the third Grade: ");
		int Grade3 = input.nextInt();//takes input
		
		System.out.println("What is the fourth Grade: ");
		int Grade4 = input.nextInt();//takes input
		
		System.out.println("What is the fifth Grade: ");
		int Grade5 = input.nextInt();//takes input
		
		int GradeAverage = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5)/5;//Averages the user inputs
		System.out.println("The grade average is: " + GradeAverage);
		
		
	}

}
/*Screen Dump

What is the first Grade: 
50
What is the second Grade: 
50
What is the third Grade: 
50
What is the fourth Grade: 
50
What is the fifth Grade: 
50
The grade average is: 50 

 */
