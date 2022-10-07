package assignment;

import java.util.Scanner;

public class PrimeNumber 
{
	public boolean prime(int num)
	{

		
		if(num<1)
		{
			return false;
		}
	
		for(int i=2;i<=num/2;i++)
		{
			if((num%i)==0)
			{
				return false;
			}
		}
	
		return true;
	}
	public static void main(String[] args)
		
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int primenumber=sc.nextInt();
		PrimeNumber pm= new PrimeNumber();
		boolean flag=pm.prime(primenumber);
		if(flag==true)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
	}
	
}
