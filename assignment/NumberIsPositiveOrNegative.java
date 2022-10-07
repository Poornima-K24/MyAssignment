package assignment;
import java.util.*;

public class NumberIsPositiveOrNegative
{
	public int NumberValidation(int num)
	{
		
		if(num>=0)
		{
			System.out.println("Entered number is positive");
		}
		else
		{
			System.out.println("Entered number is negative");
		}
		return num;
	}
	public static void main(String[] args)
	{
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number to check if it postive or negative");
		int number1 = num.nextInt();
		NumberIsPositiveOrNegative a1= new NumberIsPositiveOrNegative();
		a1.NumberValidation(number1);
	}
}
