import java.util.Scanner;

public class Prog11 {

	public static void main(String[] args) 
	{
		int choice,Quantity,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("----Select the Item-----");
		System.out.println("1.Pen");
		System.out.println("2.Pencil");
		System.out.println("3.Notebook");
		System.out.println("4.Bottle");
		System.out.println("5.ColourBox");
		System.out.println("6.Exit/Done");
		boolean flag = false;
		while(flag!=true)
		{
			System.out.print("Enter Choice = ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Enter the Quantity of Pen = ");
				Quantity = sc.nextInt();
				sum = sum + (10*Quantity);
				System.out.print("Total Amount for Pen "+(10*Quantity));
				break;
			case 2:
				System.out.print("Enter the Quantity of Pencil = ");
				Quantity = sc.nextInt();
				sum = sum+(5*Quantity);
				break;
			case 3:
				System.out.print("Enter the Quantity of Notebook = ");
				Quantity = sc.nextInt();
			    sum = sum+(20*Quantity);
			    break;
			case 4:
				System.out.print("Enter the Quantity of Bottle = ");
				Quantity = sc.nextInt();
			    sum = sum+(30*Quantity);
			    break;
			case 5:
				System.out.print("Enter the Quantity of ColourBox = ");
				Quantity = sc.nextInt();
			    sum = sum+(50*Quantity);
			    break;
			case 6:
				flag = true;
				break;
			default:
				System.out.print("Invalid choice");    
			}
				
		}
		
		System.out.print(" Total Amount = "+sum);
		sc.close();

	}

}
