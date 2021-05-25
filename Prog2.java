import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args)
	{
		int Roll_no,Sum = 0;
		String name;
		float Percentage;
		int[] marks = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Student = ");
		name = sc.nextLine();
		System.out.println("Name = "+name);
		System.out.println("Enter Roll no = ");
		Roll_no = sc.nextInt();
		System.out.println("Roll No = "+Roll_no);
		System.out.println("Enter Marks = ");
		for(int i=0;i < marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		
		for(int i=0;i<marks.length;i++)
		{
			 Sum = Sum + marks[i];
		}
		
		Percentage = (float) ((Sum/500.00)*100);
		System.out.println("Percentage = "+Percentage);
		
		if(Percentage>75)
		{
			System.out.println("Grade = A");
		}
		else if(60<Percentage&&Percentage<75)
		{
			System.out.println("Grade = B");		
		}
		else
		{
			System.out.println("Grade = C");
			
		}
		
		
		
		sc.close();
		
		
		}

		

}
