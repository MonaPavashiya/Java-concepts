package overloading;

public class ConstructorOverloading
{
	int a =0;
	int b =0;
	double c =0;
	
	ConstructorOverloading() //first
	{ 
		a=10;
		b=20;
		c=20.5;
	}
	
	ConstructorOverloading(int x, int y) //second
	{
		a=x;
		b=y;	
	}
	
	
	ConstructorOverloading(int x, double y) //third
	{
		a=x;
		c=y;
	}
	
	ConstructorOverloading(int x, int y, double z) //fourth
	{
		a=x;
		b=y;
		c=z;
	}
	
	ConstructorOverloading(int x, double y, int z) //fifth
	{
		a=x;
		b=z;
		c=y;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
	}
	

	public static void main(String[] args) 
	{
		ConstructorOverloading co1 = new ConstructorOverloading(); //call first
		ConstructorOverloading co2 = new ConstructorOverloading(10,20); //call second
		ConstructorOverloading co3 = new ConstructorOverloading(10, 20.5); //call third
		ConstructorOverloading co4 = new ConstructorOverloading(10, 20, 20.5);//call forth
		ConstructorOverloading co5 = new ConstructorOverloading(10, 20.5,30); //call fifth
		co1.display(); 
		co2.display();
		co3.display();
		co4.display();
		co5.display();

	}

}
