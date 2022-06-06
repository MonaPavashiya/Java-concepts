package oops;

public class Calculation3
{
	int a;
	int b;
	
	//Method returns some value
	
	int sum()
	{
	  return(a+b);
	}

	public static void main(String[] args)
	{
		Calculation3  cal = new Calculation3();
		cal.a = 100;
		cal.b =200;
		int r=cal.sum();
		System.out.println(r);
	
	}

}
