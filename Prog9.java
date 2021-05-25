import java.util.Scanner;

public class Prog9 {

	public static void main(String[] args) 
	{
		
		int maximum,minimum,size;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size of Array = ");
		size = sc.nextInt(); 

		int[] arr = new int[size];
		
		System.out.println("Enter Array Elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		maximum=arr[0];
		minimum=arr[0];
		for (int i=0; i < arr.length;i++)
	    {
	        if (arr[i]>maximum)
	        {
	            maximum=arr[i];
	        }
	        if (arr[i]<minimum)
	        {
	            minimum=arr[i];
	        }

	    }
	    System.out.println("Maximum no = "+maximum);
	    System.out.println("Minimum no = "+minimum);
	    
	    int sum=0;
	    for(int i = 0;i < arr.length;i++)
	    {
	    	sum = sum+arr[i];
	    }
	    System.out.println("Sum = "+sum);
	    
	    int average;
	    average=sum/size;
	    System.out.println("Average = "+average);
	    
	    sc.close();

	}

}
