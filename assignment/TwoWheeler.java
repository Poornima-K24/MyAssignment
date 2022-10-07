package assignment;

public class TwoWheeler
{
	int noOfWheels=4;
	short noOfMirrors = 3;
	long chassisNumber=5121;
	boolean isPunctured=false;
	String bikeName="Yahama";
	double runningKM = 40.44;
	
	public static void main(String[] args)
	{
		TwoWheeler object1= new TwoWheeler();
		int noOfWheels1= object1.noOfWheels;
		System.out.println("noOfWheels - "+noOfWheels1);
		short noOfMirrors1= object1.noOfMirrors;
		System.out.println("noOfMirrors - "+noOfMirrors1);
		long chassisNumber1= object1.chassisNumber;
		System.out.println("chassisNumber - "+chassisNumber1);
		boolean isPunctured1=object1.isPunctured;
		System.out.println("isPunctured - "+isPunctured1);
		String bikeName1= object1.bikeName;
		System.out.println("bikeName - "+bikeName1);
		double runningKM1= object1.runningKM;
		System.out.println("runningKM - "+ runningKM1);	
	}
}
