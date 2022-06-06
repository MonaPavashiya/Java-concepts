package oops;

public class Calculation1
{
	int a;
	int b;
	
	//Method may not takes parameters - empty parameters
	void sum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		Calculation1  cal = new Calculation1();
		cal.a = 100;
		cal.b =200;
		cal.sum();
	
	}

}
