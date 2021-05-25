import java.util.Scanner;

public class Prog3 {
    public static void swap(int a , int b ) 
    {
    	int temp = 0;
    	temp=a;
    	a=b;
    	b=temp;
    	System.out.println("After Swap 1st Number = "+a+" 2nd Number = "+b);
    	
    	
	}
	public static void main(String[] args) 
	{
		int Number1,Number2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number = ");
		Number1 = sc.nextInt();
	    System.out.print("Enter 2nd number = ");
	    Number2 = sc.nextInt();
	    System.out.println("Before Swap 1st Number = "+Number1+" 2nd Number = "+Number2);
	    swap(Number1,Number2);
		sc.close();

	}

}
