package oops;

public class Calculation4
{
	int a;
	int b;
	
	//Method  may not returns any value
	
	void sum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		Calculation4  cal = new Calculation4();
		cal.a = 100;
		cal.b =200;
		cal.sum();
	
	}

}
