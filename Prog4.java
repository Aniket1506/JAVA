
public class Prog4 
{
	
	public static void add(int i,int j)
	{
		System.out.println("Add = "+(i+j));
	}
	
	public static void add(int i,int j,int k)
	{
		System.out.println("Add = "+(i+j+k));
	}
	
	public static void add(double i,int j)
	{
		System.out.println("Add = "+(i+j));
	}
	
	public static void add(String i,String j)
	{
		System.out.println("Add = "+(i+" "+j));
	}
	
	
	

	public static void main(String[] args) 
	{
		int a=20,b=30;
		double d1=12.45;
		
		add(a,b);
		add(d1,a);
		add(a,b,10);
		add("hello","Aniket");
		
		

	}

}
