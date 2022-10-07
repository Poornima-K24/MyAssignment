package assignment;

public class FindIntersection 
{
	
	public static void main(String[] args)
	{
		int[] input = {15,1,125,170};
		int[] input2 = {15,10,8,125,170};
	    int len=input.length;
	    int len2=input.length;
	    System.out.println("Intersection value between two arrays are-");
	    for(int i=0;i<len;i++)
	    {
	    	for(int j=0;j<len2+1;j++)
	    	{
	    		if(input[i]==input2[j])
	    		{
	    			System.out.println(input[i]);
	    		}
	    	}
	    }
	}

}
