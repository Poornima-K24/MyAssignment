package assignment;


public class PrintDuplicatesInArray 
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,2,1 };
		int len = arr.length;
		for(int i=0;i<len;i++)
		  {
			for (int j=i+1;j<len;j++)
			  {
				  if(arr[i]==arr[j]&&i!=j)
				  {
					  System.out.println("duplicate element in array are - "+arr[i]);
				  }
				 
			  }
			
		  }  
	 
	}
}
