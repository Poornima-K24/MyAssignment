package assignment;

import java.util.Scanner;
public class ArmstrongNumber 
{
 	public static void main(String[] args)
	{ 		
 		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number");
		int out = num.nextInt();
		int number= out;
		int number1= out;
		int sum =0,rem=0,count =0;
		while(number>0)
		{
			count++;
			number=number/10;
			
		}
		while(number1>0)//System.out.println("count"+count); -- to check the count of digit ented
		{
			rem=number1%10;
			//System.out.println(rem);-- to check the remainder value
			sum+=(int)Math.pow(rem, count);
			//System.out.println("- "+sum);-- to check the summed value
			number1=number1/10;
		}
		
		if(sum==out)
		{
			System.out.println("Entered number is Armstrong number - "+sum);
		}
		
		else
		{
			System.out.println("Entered number is not armstrong number");
		}		
				
	}
}
