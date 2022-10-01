package week1.day1;
import java.util.*;
public class Factorial 
{
	public static void main(String[] args) 
	{
		int fact=1;
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number");//Getting Input from user to calculate the factorial value
		int number = num.nextInt();
		for(int i=1;i<=number;i++)
		  {    
		      fact=fact*i;   
		  }
		  System.out.println("Factorial of entered number - "+fact);
		  
		  /* Directly passing the input for the factorial number to be calculated
			int fact=1,number=5;
			for(int i=1;i<=number;i++)
		  	{    
		      fact=fact*i;   
		  	}
		  	System.out.println("Factorial value- "+fact);
		  
		  */
	}
}

