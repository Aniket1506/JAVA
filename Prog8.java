import java.util.Scanner;

public class Prog8 {

	public static void main(String[] args)
	{
		int maximum,minimum;
		int[] arr = new int[5];
		Scanner sc =new Scanner(System.in);
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
	    sc.close();

		
	}

}
