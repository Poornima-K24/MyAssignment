package assignment;

import java.util.Arrays;

public class FindSecondLargest 
{
 public static void main(String[] args)
 {
    int[] input = {15,10,1,125,170};
    Arrays.sort(input);
    int len=input.length;
    //int num = len-1;
    System.out.println(len);
    System.out.println("FindSecondLargest in the array is = "+input[len-2]);
    
 }
}
