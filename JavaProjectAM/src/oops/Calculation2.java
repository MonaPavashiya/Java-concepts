package oops;

public class Calculation2
{
	int a;
	int b;
	
	//Method takes parameters 
	void sum(int x, int y)
	{
		a =x;
		b =y;
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		Calculation2  cal = new Calculation2();
		cal.sum(100, 200);
	
	}

}
