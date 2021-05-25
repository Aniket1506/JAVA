import java.util.Scanner;

public class Prog10 {

	public static void main(String[] args) 
	{
		float Salary=0;
		int Basic;
		String Name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name = ");
		Name = sc.nextLine();
		System.out.println("Enter the Basic of the Employee = ");
		Basic = sc.nextInt();
		
		if(Basic <= 10000)
		{
			Salary = (float) (Basic+(Basic*0.2)+(Basic*0.8));
		}
		else if(Basic>10000 && Basic<=20000)
		{
			Salary = (float)(Basic+(Basic*0.25)+(Basic*0.90));
		}
		else if(Basic>20000)
		{
			Salary = (float)(Basic+(Basic*0.30)+(Basic*0.95));
		}
		System.out.println("Employee Name = "+Name);
		System.out.println("Gross Salary of "+Name+" = "+Salary);
		sc.close();
		

	}

}
