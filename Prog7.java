import java.util.Scanner;

public class Prog7 
{
	public static void main(String[] args) 
	{
        int no;
		int arr[] = new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array Elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Number to Search:");
		no=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
			System.out.println("Number present  at index:"+i);
			break;
			}
			
		}
		   sc.close();
		
	}
	

}
