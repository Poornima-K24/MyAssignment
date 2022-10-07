package assignment;

import java.util.Scanner;

public class SumOfDigits 
{

	public static void main(String[] args) 
	{
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number");
		int out = num.nextInt();
		int rem,sum=0;
		while(out>0)
		{
			rem=out%10;
			sum=sum+rem;
			out=out/10;
		}
		System.out.println("sum of digits "+ sum);
	}
}
